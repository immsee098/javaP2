package com.ez.herb.admin.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

import com.ez.herb.admin.manager.model.ManagerService;
import com.ez.herb.admin.manager.model.ManagerVO;
import com.ez.herb.member.model.MemberService;

@Controller
@RequestMapping("/admin")
public class AdminManagerController {
	private static final Logger logger
		=LoggerFactory.getLogger(AdminManagerController.class);
	
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping(value="/manager/join.do", method=RequestMethod.GET)
	public void join_get(Model model) {
		//1
		logger.info("관리자 등록 화면 보여주기");
		
		//2
		List<Map<String, Object>> list=managerService.selectAuth();
		logger.info("관리자 등급 조회 결과, list.size={}", list.size());
		
		model.addAttribute("list", list);		
	}
	
	@RequestMapping(value="/manager/join.do", method=RequestMethod.POST)
	public String join_post(@ModelAttribute ManagerVO vo, Model model) {
		logger.info("관리자 등록, 파라미터 vo={}", vo);
		
		int cnt=managerService.insertManager(vo);
		logger.info("관리자 등록 결과, cnt={}", cnt);
		
		String msg="", url="/admin/manager/join.do";
		if(cnt>0) {
			msg="관리자 등록했습니다.";
		}else {
			msg="관리자 등록 실패!";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "common/message";
	}
	
	@RequestMapping("/manager/checkUserid.do")
	public void chkUserid(@RequestParam String userid, Model model) {
		logger.info("관리자 아이디 중복확인, 파라미터 userid={}", userid);
		
		int result=0;		
		if(userid!=null && !userid.isEmpty()) {
			result=managerService.selectDup(userid);
		}
		logger.info("아이디 중복확인 결과, result={}", result);
		
		model.addAttribute("result", result);
		model.addAttribute("EXIST_ID", MemberService.EXIST_ID);
		model.addAttribute("USEFUL_ID", MemberService.USEFUL_ID);
		
	}
	
	@RequestMapping(value="/login/adminLogin.do", method=RequestMethod.GET)
	public void login_get() {
		logger.info("관리자 로그인 화면 보여주기");
	}
	
	@RequestMapping(value="/login/adminLogin.do", method=RequestMethod.POST)
	public String login_post(@RequestParam String userid,
			@RequestParam String pwd, 
			@RequestParam(required = false) String chkSave,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		logger.info("관리자 로그인 처리, 파라미터 userid={}, pwd={}",userid, pwd);
		logger.info("chkSave={}",chkSave);
		
		int result=managerService.loginCheck(userid, pwd);
		logger.info("관리자 로그인 결과, result={}", result);
		
		//session => adminUserid
		//cookie => ck_admin_userid
		
		String msg="", url="/admin/login/adminLogin.do";
		if(result==MemberService.LOGIN_OK) {
			HttpSession session=request.getSession();
			session.setAttribute("adminUserid", userid);
			
			Cookie ck = new Cookie("ck_admin_userid", userid);
			ck.setPath("/");
			if(chkSave!=null && !chkSave.isEmpty()) {
				ck.setMaxAge(1000*24*60*60);
				response.addCookie(ck);
			}else {
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
			
			msg="관리자 로그인되었습니다.";
			url="/admin/adminMain.do";
		}else if(result==MemberService.DISAGREE_PWD) {
			msg="비밀번호가 일치하지 않습니다.";
		}else if(result==MemberService.NONE_USERID) {
			msg="아이디가 존재하지 않습니다.";
		}else {
			msg="로그인 처리 실패.";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("url", url);
		
		return "common/message";
	}
	
	@RequestMapping("/login/logout.do")
	public String logout(HttpSession session) {
		String userid=(String) session.getAttribute("adminUserid");
		
		logger.info("로그아웃, 파라미터 userid={}", userid);
		
		session.removeAttribute("adminUserid");
		
		return "redirect:/admin/login/adminLogin.do";
	}
	
}





