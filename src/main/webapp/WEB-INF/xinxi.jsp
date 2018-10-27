
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>影城管理系统</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<% Object admin=session.getAttribute("admin");
	if(admin==null){
		response.sendRedirect("index.jsp");
		return;
	}
%>
</head>
<body>
<!-- Header -->
<div id="header">
	<div class="shell">
		<!-- Logo + Top Nav -->
		<div id="top">
			<h1><a href="#">影城会员管理</a></h1>
			<div id="top-navigation">
				Welcome <a href="#"><strong>管理人</strong></a>
				<span>|</span>
				<a href="#">帮助</a>
				<span>|</span>
				<a href="#">设置</a>
				<span>|</span>
				<a href="quit.do">退出</a>
			</div>
		</div>
		<!-- End Logo + Top Nav -->
		
		<!-- Main Nav -->
		<div id="navigation">
			<ul>
			    
			</ul>
		</div>
		<!-- End Main Nav -->
	</div>
</div>
<!-- End Header -->
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" ></a></div>
<!-- Container -->
<div id="container">
	<div class="shell">
		
		<!-- Small Nav -->
		<div class="small-nav">
			<a href="#">Dashboard</a>
			<span>&gt;</span>
			当前页面
		</div>
		<!-- End Small Nav -->
		
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
			
			<!-- Content -->
			<div id="content">
				
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">当前页面</h2>
						
					</div>
					<!-- End Box Head -->	

					<!-- Table -->
					<div class="table">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th width="13"><input type="checkbox" class="checkbox" /></th>
								<th>会员昵称</th>
								<th>注册帐号</th>
								<th>注册时间</th>
								<th>手机号</th>
								<th>邮箱</th>
								<th width="110" class="ac">操作</th>
							</tr>
							
							<tr>
								<td><input type="checkbox" class="checkbox" /></td>
								<td><h3><a href="#">${xinxi.username}</a></h3></td>
								<td>${xinxi.name}</td>
								<td>${xinxi.cdate}</td>
								<td>${xinxi.phone}</td>
								<td>${xinxi.email}</td>
								<td id="zhuye"><a href="toLogin.do" class="ico del">主页</a>
							</tr>
							
						</table>
						
						
					</div>
					<!-- Table -->
					
				</div>
				<!-- End Box -->
				
			

			</div>
			<!-- End Content -->
			
			
			<div class="cl">&nbsp;</div>			
		</div>
		<!-- Main -->
	</div>
</div>
<!-- End Container -->

<!-- Footer -->
<div id="footer">
	<div class="shell">
		
	</div>
</div>
<!-- End Footer -->
	
</body>
</html>