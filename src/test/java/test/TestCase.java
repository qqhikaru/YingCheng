package test;

import java.io.File;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yingcheng.www.dao.UserDAO;
import com.yingcheng.www.entity.User;
import com.yingcheng.www.service.LoginService;
public class TestCase {
	@Resource(name= "LoginService")
	private LoginService ls;
	@Test
	public void test2(){
		User us = ls.checkLogin("tuihao", "123456");
		us.toString();
	}
	
	
	@Test
	public void test3(){
		File file=new File(".");
		System.out.println("��ǰ·��Ϊ:"+file.getAbsolutePath());
	}
	


	
}
