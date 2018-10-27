package com.yingcheng.www.service;

import java.util.List;

import com.yingcheng.www.entity.Film;
import com.yingcheng.www.entity.User;

public interface LoginService {
	public User checkLogin(String username,String pwd);
	public void zhuce(User u);
	public boolean zbzy(String username);
	public void modify(User u);
	
	public List<Film> findFilm(Film film);
}
