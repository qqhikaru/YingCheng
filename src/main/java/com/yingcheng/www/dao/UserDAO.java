package com.yingcheng.www.dao;

import java.util.List;

import com.yingcheng.www.entity.Film;
import com.yingcheng.www.entity.User;

public interface UserDAO {
	public User findByUsername(String username);
	public void register(User user);
	public void modify(User user);
	
	public List<Film> findFilm(Film film);
}
