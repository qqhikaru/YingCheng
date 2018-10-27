package com.yingcheng.www.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yingcheng.www.dao.UserDAO;
import com.yingcheng.www.entity.Film;
import com.yingcheng.www.entity.User;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	@Resource(name ="userDAO")
	private UserDAO dao ;
	public User checkLogin(String username,String password) {
		System.out.println(username);
		User user = dao.findByUsername(username);
		if(user==null){
			//用户名不存在可以抛出一个应用异常
			//表示层在捕捉到应用异常之后，;
			//需要明确提示用户采取正确的操作/
			throw new ApplicationException("BBBBB用户名不存在");
		}if(!user.getPassword().equals(password)){
			throw new ApplicationException("密码错误");
		}
		return user;
	}
	
	
	public void modify(User u){
		dao.modify(u);
	}
	public void zhuce(User u){
		dao.register(u);
	}
	public boolean zbzy(String username){
		User u=dao.findByUsername(username);
		if(u==null)return true;
		return false;
	}
	
	public List<Film> findFilm(Film film) {
		List<Film> list=dao.findFilm(film);
		
		return list;
	}
	
	
}
