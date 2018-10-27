package com.yingcheng.www.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yingcheng.www.entity.Film;
import com.yingcheng.www.entity.User;
import com.yingcheng.www.service.ApplicationException;
import com.yingcheng.www.service.LoginService;

import web.JsonResult;

@Controller
public class LoginController {
	
	@Resource(name= "LoginService")
	private LoginService ls;
	
	@RequestMapping("login.do")
	public String login(){
		return "login";
	}
	@RequestMapping("toindex.do")
	public String index(HttpServletRequest request,HttpSession session){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User us =ls.checkLogin(username, password);
		session.setAttribute("us", us);
		System.out.println(us);
		if("111111".equals(us.getUsername())&&"123456".equals(us.getPassword())){
			session.setAttribute("admin", "123456");
			return "redirect:toLogin.do";
			
		}
		return "redirect:index2.do"
		
				;
	}
	@RequestMapping("index2.do")
	public String toindex(HttpServletRequest request,HttpSession session){
		User us= (User) session.getAttribute("us");
		System.out.println(us);
		if(us==null)return"login";
		session.setAttribute("name", us.getName());
		return "index2";
	}
	
	@RequestMapping("tomodify.do")
	public String modify(HttpServletRequest request,HttpSession session){
		User us =(User)session.getAttribute("us");
		request.setAttribute("name", us.getName());
		request.setAttribute("phone", us.getPhone());
		request.setAttribute("email", us.getEmail());
		request.setAttribute("password", us.getPassword());
		return "modify";
	}
	
	@RequestMapping("successmodify.do")
	public String successmodify(HttpServletRequest request,HttpSession session){
		User us =(User)session.getAttribute("us");
		String name=request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		us.setEmail(email);
		us.setName(name);
		us.setPhone(phone);
		us.setPassword(password);
		System.out.println(us.getPassword());
		session.setAttribute("name", us.getName());
		ls.modify(us);
		return "index2";
	}
	
	@RequestMapping("quit.do")
	public String quit(HttpSession session){
		session.removeAttribute("us");
		session.removeAttribute("name");
		session.removeAttribute("admin");
		return "login";
	}
	
	@RequestMapping("tozhuce.do")
	public String tozhuce(){
		return "register";
	}
	
	@RequestMapping("zhuce.do")
	public String zhuce(HttpServletRequest request,HttpSession session){
		User u = new User();
		String account=request.getParameter("account");
		String name=request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		u.setName(name);
		u.setUsername(account);
		u.setPassword(password);
		u.setEmail(email);
		u.setPhone(phone);
		ls.zhuce(u);
		session.setAttribute("us", u);
		session.setAttribute("name", u.getName());
		return "index2";
	}
	
	@RequestMapping("dengluyanzheng.do")
	@ResponseBody
	public JsonResult yanzheng(String username,String password){
		User us =ls.checkLogin(username, password);
		System.out.println(username+"+"+password);
		return new JsonResult();
	}
	
	@RequestMapping("zhuceyanzheng.do")
	@ResponseBody
	public JsonResult zhuceyanzheng(String username){
		boolean b = ls.zbzy(username);
		return new JsonResult(b);
	}
	
	@RequestMapping("down.do")
	public String down(HttpSession session){
		String oo=(String) session.getAttribute("name");
		return "download";
	}
	
	//电影搜索
	@RequestMapping("/findFilm.do")
	@ResponseBody
	public List<Film> findFilm(Film film){
		int a=0;
		
		a=a+1;
		
		System.out.println(123);
		System.out.println(123);
		
		return ls.findFilm(film);
	}
	
		
	
}
