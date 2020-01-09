package com.ez.herb.cart.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/shop/cart")
public class CartController {
	private static final Logger logger
		=LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/cartAdd.do")
	public String cartAdd(@ModelAttribute CartVO cartVo, 
			@RequestParam String mode, HttpSession session, 
			Model model) {
		String userid=(String) session.getAttribute("userid");
		
		cartVo.setCustomerId(userid);
		logger.info("장바구니 담기, 파라미터 vo={}, mode={}", cartVo, mode);
		
		int cnt=cartService.insertCart(cartVo);
		logger.info("장바구니 담기 결과, cnt={}", cnt);
		
		String msg="", url="/shop/product/productDetail.do?productNo="
				+ cartVo.getProductNo();
		if(cnt>0) {			
			if(mode.equals("cart")) {  //장바구니 담기
				url="redirect:/shop/cart/cartList.do";
			}else if(mode.equals("order")) {  //바로 구매
				url="redirect:/shop/order/orderSheet.do";
			}
			
			return url;
		}else {
			msg="장바구니 담기 실패";
			
			model.addAttribute("msg", msg);
			model.addAttribute("url", url);
			
			return "common/message";
		}
	}
	
	@RequestMapping("/cartList.do")
	public void cartList(HttpSession session, Model model) {
		String userid=(String) session.getAttribute("userid");
		
		logger.info("장바구니 목록, 파라미터 userid={}", userid);
		
		List<Map<String, Object>> list=cartService.selectCart(userid);
		logger.info("장바구니 목록 결과, list.size={}", list.size());
		
		model.addAttribute("list", list);		
	}
	
	@RequestMapping("/cartEdit.do")
	public String cardEdit(@ModelAttribute CartVO cartVo) {
		logger.info("장바구니 수정, 파라미터 vo={}", cartVo);
		
		int cnt=cartService.updateCart(cartVo);
		logger.info("장바구니 수정, 결과 cnt={}", cnt);
		
		return "redirect:/shop/cart/cartList.do";
	}
	
	@RequestMapping("/cartDelete.do")
	public String cartDelete(@RequestParam(defaultValue = "0") 
		int cartNo) {
		logger.info("장바구니 삭제, 파라미터 cartNo={}", cartNo);
		
		int cnt=cartService.deleteCart(cartNo);
		logger.info("장바구니 삭제, 결과 cnt={}", cnt);
		
		return "redirect:/shop/cart/cartList.do";
	}
	
	
}








