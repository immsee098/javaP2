package com.ez.herb.board.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ez.herb.board.model.BoardService;
import com.ez.herb.board.model.BoardVO;
import com.ez.herb.common.SearchVO;

@Controller
@RequestMapping("/board")
public class BoardListController {
	private static final Logger logger
		=LoggerFactory.getLogger(BoardListController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list.do")
	public String list(@ModelAttribute SearchVO searchVo, 
				Model model) {
		//1
		logger.info("글 목록, 파라미터 searchVo={}",searchVo);
		
		//2
		List<BoardVO> list=boardService.selectAll(searchVo);
		logger.info("글목록 결과, list.size={}", list.size());
		
		//3
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
}



