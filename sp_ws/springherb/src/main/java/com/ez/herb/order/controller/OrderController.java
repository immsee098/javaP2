package com.ez.herb.order.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ez.herb.cart.controller.CartService;
import com.ez.herb.common.DateSearchVO;
import com.ez.herb.common.PaginationInfo;
import com.ez.herb.common.Utility;
import com.ez.herb.member.model.MemberService;
import com.ez.herb.member.model.MemberVO;
import com.ez.herb.order.model.OrderAllVO;
import com.ez.herb.order.model.OrderService;
import com.ez.herb.order.model.OrderVO;

@Controller
@RequestMapping("/shop/order")
public class OrderController {
	private Logger logger
		=LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private OrderService orderService;
		
	@RequestMapping(value="/orderSheet.do", method=RequestMethod.GET)
	public void orderSheet(HttpSession session, Model model) {
		String userid = (String) session.getAttribute("userid");		
		logger.info("주문하기 화면 보여주기, 파라미터 userid={}", userid);
		
		List<Map<String, Object>> list=cartService.selectCart(userid);
		logger.info("주문-장바구니 조회 결과, list.size={}", list.size());
		
		MemberVO memberVo=memberService.selectMember(userid);
		logger.info("주문-회원정보 조회 결과, vo={}", memberVo);
		
		model.addAttribute("list", list);
		model.addAttribute("memberVo", memberVo);
	}
	
	@RequestMapping(value="/orderSheet.do", method=RequestMethod.POST)
	public String orderSheet_post(@ModelAttribute OrderVO orderVo,
			HttpSession session) {
		String userid=(String) session.getAttribute("userid");
		orderVo.setCustomerId(userid);
		
		logger.info("주문처리, 파라미터 vo={}", orderVo);
		
		int cnt=orderService.insertOrder(orderVo);
		logger.info("주문처리 결과, cnt={}, 주문 후 orderVo={}", cnt, orderVo);
		
		return "redirect:/shop/order/orderComplete.do?orderNo="
			+ orderVo.getOrderNo();
	}
	
	@RequestMapping("/orderComplete.do")
	public String orderComplete(@RequestParam(defaultValue = "0") 
		int orderNo, Model model) {
		logger.info("주문완료, 파라미터 orderNo={}", orderNo);
		
		List<Map<String, Object>> list
			=orderService.selectOrderDetailsView(orderNo);
		logger.info("주문완료, 상세주문내역 조회 결과 list.size={}", list.size());
		
		Map<String, Object> map=orderService.selectOrdersView(orderNo);
		logger.info("주문완료, 주문정보 조회 결과 map={}", map);
		
		model.addAttribute("list", list);
		model.addAttribute("orderMap", map);
		
		return "shop/order/orderComplete";
	}
	
	@RequestMapping("/orderList.do")
	public void orderList(@ModelAttribute DateSearchVO dateSearchVo,
			HttpSession session,Model model) {
		String userid=(String) session.getAttribute("userid");
		dateSearchVo.setCustomerId(userid);
		logger.info("주문내역, 파라미터 dateSearchVo={}", dateSearchVo);
		
		//날짜 지정하지 않고, 처음 주문내역 메뉴를 클릭한 경우 현재 일자 셋팅
		String startDay=dateSearchVo.getStartDay();
		if(startDay==null || startDay.isEmpty()) {
			Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String str=sdf.format(today);
			
			dateSearchVo.setStartDay(str);
			dateSearchVo.setEndDay(str);			
		}
		
		//[1]
		PaginationInfo pagingInfo=new PaginationInfo();
		pagingInfo.setBlockSize(Utility.BLOCK_SIZE);
		pagingInfo.setCurrentPage(dateSearchVo.getCurrentPage());
		pagingInfo.setRecordCountPerPage(Utility.RECORD_COUNT);
		
		//[2]
		dateSearchVo.setFirstRecordIndex(pagingInfo.getFirstRecordIndex());
		dateSearchVo.setRecordCountPerPage(Utility.RECORD_COUNT);
		
		List<OrderAllVO> list=orderService.selectOrderList(dateSearchVo);
		logger.info("주문내역 조회 결과, list.size={}", list.size());
		
		//[3]
		int totalRecord=orderService.getTotalRecord(dateSearchVo);
		logger.info("주문내역조회, totalRecord={}", totalRecord);
		
		pagingInfo.setTotalRecord(totalRecord);
		
		model.addAttribute("list", list);
		model.addAttribute("pagingInfo", pagingInfo);
	}
	
	
}
