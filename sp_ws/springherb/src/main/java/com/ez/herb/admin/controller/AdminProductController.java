package com.ez.herb.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ez.herb.category.model.CategoryService;
import com.ez.herb.category.model.CategoryVO;

@Controller
@RequestMapping("/admin/product")
public class AdminProductController {
	private static final Logger logger
		=LoggerFactory.getLogger(AdminProductController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/productWrite.do", method=RequestMethod.GET)
	public void pdWrite_get(Model model) {
		logger.info("관리자 - 상품등록 화면");
		
		List<CategoryVO> list=categoryService.selectCategory();
		logger.info("관리자-상품등록, 카테고리 조회 결과 list.size={}", list.size());
		
		model.addAttribute("list", list);		
	}
	
	
}
