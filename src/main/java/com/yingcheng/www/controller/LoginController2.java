package com.yingcheng.www.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yingcheng.www.entity.PageObject;
import com.yingcheng.www.entity.Userzy;
import com.yingcheng.www.service.Action;


@Controller
public class LoginController2 {
	@Resource
	private Action action;
	
	@RequestMapping("/toLogin.do")
	public String tologin(HttpServletRequest request,PageObject pageObject){
		System.out.println("toLogin()");
		List<Userzy> u=action.findPageAll(pageObject);
		//pageObject=action.findcount(pageObject);
		request.setAttribute("count", pageObject.getPageCount());
		request.setAttribute("list", u);
		return "houtai";
	}
	@RequestMapping("/tianjia.do")
	public String tianjia(){
		System.out.println("tianjia()");
		return "tianjia";
	}
	@RequestMapping("xinxi.do")
	public String geren(HttpServletRequest request){
		System.out.println("geren()");
		String username=request.getParameter("username");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		Userzy u=new Userzy();
		u.setName(name);
		u.setUsername(username);
		u.setPassword(password);
		u.setPhone(phone);
		u.setEmail(email);
		action.save(u);
		request.setAttribute("xinxi", u);
		return "xinxi";
	}
	@RequestMapping("/del.do")
	public String delete(HttpServletRequest request){
		System.out.println("delete()");
		int id=Integer.parseInt(request.getParameter("id"));
		action.delete(id);
		return "redirect:toLogin.do";
	}
	@RequestMapping("/load.do")
	public String load(HttpServletRequest request){
		System.out.println("load()");
		int id=Integer.parseInt(request.getParameter("id"));
		Userzy u=action.findID(id);
		request.setAttribute("load", u);
		return "update";
	}
	@RequestMapping("/success.do")
	public String modify(HttpServletRequest request){
		System.out.println("modify()");
		Userzy u=new Userzy();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setName(request.getParameter("name"));
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		u.setPhone(request.getParameter("phone"));
		u.setEmail(request.getParameter("email"));
		System.out.println(u);
		action.modify(u);
		System.out.println(1111);
		return "redirect:toLogin.do";
	}
	@RequestMapping("/sousuo.do")
	public String ferret(HttpServletRequest request,PageObject pageObject){
		String sousuo=request.getParameter("sousuo");
		request.setAttribute("data", sousuo);
		pageObject=action.findcount(pageObject);
		request.setAttribute("count", pageObject.getPageCount());
		List<Userzy> u=action.ferret(sousuo, pageObject);
		request.setAttribute("list", u);
		return "houtai";
	}
	@RequestMapping("/next.do")
	public String next(HttpServletRequest request,PageObject pageObject){
		int currentPage=Integer.parseInt(request.getParameter("currentPage"));
		pageObject.setPageCurrent(currentPage);
		pageObject=action.findcount(pageObject);
		request.setAttribute("count", pageObject.getPageCount());
		request.setAttribute("page", currentPage);
		List<Userzy> u=action.findPageAll(pageObject);
		request.setAttribute("list", u);
		return "houtai";
	}
	@RequestMapping("/goto.do")
	public String gotoo(HttpServletRequest request,PageObject pageObject){
		int currentPage=Integer.parseInt(request.getParameter("currentPage"));
		request.setAttribute("page", currentPage);
		System.out.println("goto:"+currentPage);
		pageObject=action.findcount(pageObject);
		
		System.out.println("pagecount:"+pageObject.getPageCount());
		request.setAttribute("count", pageObject.getPageCount());
		pageObject.setPageCurrent(currentPage);
		List<Userzy> u=action.findPageAll(pageObject);
		request.setAttribute("list", u);
		return "houtai";
	}
	@RequestMapping("/yanzheng.do")
	@ResponseBody
	public Integer findName(String username){
		System.out.println(username);
		int value=action.findName(username);
		System.out.println(value);
		return value;
	}
}
