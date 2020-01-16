package com.ez.herb.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxTestController {
	private static final Logger logger
		=LoggerFactory.getLogger(AjaxTestController.class);
	
	@RequestMapping("/sandbox/ajaxTest/ajaxTest1.do")
	public void ajaxTest1() {
		logger.info("ajaxTest1 화면 보여주기");
	}
	
	@RequestMapping("/search.do")
	@ResponseBody
	public String search(@RequestParam(defaultValue = "") String keyword,
			@RequestParam(defaultValue = "") String id) {
		logger.info("search.do ajax 처리");
		
		String str=id+","+keyword+","+"sbs,sk,sm";
		
		return str;
	}
	
	@RequestMapping("/search2.do")
	//@ResponseBody
	public void search2(@RequestParam(defaultValue = "") String keyword,
			@RequestParam(defaultValue = "") String id, 
			HttpServletResponse response) {
		logger.info("search2.do ajax 처리");
		
		String str=id+","+keyword+","+"sbs,sk,sm";
		
		PrintWriter out=null;
		try {
			out = response.getWriter();
			out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/sandbox/ajaxTest/ajaxTest2.do")
	public void ajaxTest2() {
		logger.info("ajaxTest2 화면 보여주기");
	}
	
	@RequestMapping("/ajaxDetail1.do")
	@ResponseBody
	public MemoVO detail1() {
		logger.info("ajaxDetail1.do 처리");
		
		MemoVO vo =new MemoVO();
		vo.setNo(1);
		vo.setName("홍길동");
		vo.setContent("내용1");
		
		return vo;
		//{"no":1,"name":"홍길동","content":"내용1"}
	}
	
	@RequestMapping("/ajaxList1.do")
	@ResponseBody
	public List<MemoVO> list1() {
		logger.info("ajaxList1.do 처리");
		
		List<MemoVO> list=new ArrayList<MemoVO>();
		MemoVO vo1= new MemoVO();
		vo1.setNo(1);
		vo1.setName("김길동");
		vo1.setContent("안녕");
		
		list.add(vo1);
		
		MemoVO vo2= new MemoVO();
		vo2.setNo(2);
		vo2.setName("이길동");
		vo2.setContent("안녕하세요");
		
		list.add(vo2);
		
		MemoVO vo3= new MemoVO();
		vo3.setNo(3);
		vo3.setName("박길동");
		vo3.setContent("내용입니다.");
		
		list.add(vo3);
		
		return list;
		//[{"no":1,"name":"김길동","content":"안녕"},{"no":2,"name":"이길동","content":"안녕하세요"},{"no":3,"name":"박길동","content":"내용입니다."}]
	}
	
	@RequestMapping("/sandbox/ajaxTest/ajaxTest3.do")
	public void ajaxTest3() {
		logger.info("ajaxTest3 화면 보여주기");
	}
	
	@RequestMapping("/ajaxQuery.do")
	@ResponseBody
	public MemoVO query(@RequestParam(defaultValue = "0") int no) {
		logger.info("ajaxQuery.do 처리, 파라미터 no={}", no);
		
		MemoVO vo = new MemoVO();
		vo.setNo(no);
		vo.setName("홍길동");
		vo.setContent("안녕");
		
		return vo;
		//{"no":22,"name":"홍길동","content":"안녕"}
	}
	
	@RequestMapping("/ajaxWrite.do")
	@ResponseBody
	public ResultVO write(@ModelAttribute MemoVO memoVo) {
		logger.info("ajaxWrite.do 처리, 파라미터 memoVo={}", memoVo);
		
		memoVo.setNo(10);
		
		ResultVO resultVo=new ResultVO();
		resultVo.setMessage("메모 등록 성공");
		resultVo.setData(memoVo);
		
		return resultVo;
		//{"message":"메모 등록 성공","data":{"no":10,"name":"홍길동","content":"안녕"}}
	}
	
	@RequestMapping("/sandbox/ajaxTest/apiSampleApplicationXML.do")
	public void apiXml() {
		logger.info("api_xml 화면 보여주기");
	}
	
	@RequestMapping("/sandbox/ajaxTest/apiSampleApplicationJSON.do")
	public void apiJson() {
		logger.info("api_json 화면 보여주기");
	}
	
	
}





