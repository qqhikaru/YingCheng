package com.yingcheng.www.service;

import java.util.List;

import com.yingcheng.www.entity.PageObject;
import com.yingcheng.www.entity.Userzy;

public interface Action {
	public List<Userzy> findAll();
	public void delete(int id);
	public void save(Userzy u);
	public Userzy findID(int id);
	public void modify(Userzy u);
	public List<Userzy> ferret(String str,PageObject pageObject);
	public List<Userzy> findPageAll(PageObject pageObject);
	public PageObject findcount(PageObject pageObject);
	public int findName(String name);
}
