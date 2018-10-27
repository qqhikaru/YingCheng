package com.yingcheng.www.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yingcheng.www.entity.PageObject;
import com.yingcheng.www.entity.Userzy;

public interface UserDAOzy {
	public List<Userzy> findAll();
	public void save(Userzy u);
	public void delete(int id);
	public void modify(Userzy u);
	public Userzy findID(int id);
	public List<Userzy> ferret(@Param("str")String str,@Param("pageObject") PageObject pageObject);
	public List<Userzy> findPageAll(PageObject pageObject);
	public int findcount();
	public int findName(@Param("username")String username);
}
