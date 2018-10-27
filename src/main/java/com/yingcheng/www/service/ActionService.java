package com.yingcheng.www.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yingcheng.www.dao.UserDAOzy;
import com.yingcheng.www.entity.PageObject;
import com.yingcheng.www.entity.Userzy;

@Service("action")
public class ActionService implements Action{
	@Resource(name="userDAOzy")
	private UserDAOzy dao;
	public List<Userzy> findAll(){
		return dao.findAll();
	}
	public void delete(int id){
		dao.delete(id);
	}
	public void save(Userzy u){
		dao.save(u);
	}
	public Userzy findID(int id){
		return dao.findID(id);
	}
	public void modify(Userzy u){
		dao.modify(u);
	}
	public List<Userzy> ferret(String str,PageObject pageObject){
		pageObject.setPageSize(7);
		return dao.ferret(str, pageObject);
	}
	public List<Userzy> findPageAll(PageObject pageObject){
		pageObject.setPageSize(7);
		int rowcount=dao.findcount();
		System.out.println("count:"+rowcount);
		pageObject.setRowCount(rowcount);
		System.out.println("findPageAll="+pageObject.getStartIndex()+","+pageObject.getEndIndex()+","+pageObject.getPageCount());
		return dao.findPageAll(pageObject);
	}
	public PageObject findcount(PageObject pageObject){
		pageObject.setPageSize(7);
		int rowcount=dao.findcount();
		System.out.println("count:"+rowcount);
		pageObject.setRowCount(rowcount);
		return pageObject;
	}
	public int findName(String name){
		return dao.findName(name);
	}
}
