
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
	
<style>
	span{
		color:red;
	}
	p{
		margin-top: 10px;
	}
</style>
<script type="text/javascript" src="${basePath}/js/jquery-1.11.1.js"></script>
<script>
var state;
var username=/^\w{6,16}$/;
var acname=/^\w{2,16}$/;
var phone=/^1[34578]\d{9}$/;
var email= /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	$(document).ready(function(){
		$("#tijiao").on("click",yanzheng);
	})
	function names(){
			if(!acname.test($("#name").val())){
				$("#sname").html("2-16位字母数字组合")
				return false;
			}else{
				$("#sname").html("")
				return true;
			}
		}
		function phones(){
			if(!phone.test($("#phone").val())){
				$("#sphone").html("请正确填写")
				return false;
			}else{
				$("#sphone").html("")
				return true;
			}
		}
		function emails(){
			if(!email.test($("#email").val())){
				$("#semail").html("格式错误!")
				return false;
			}else{
				$("#semail").html("")
				return true;
			}
		}
		function pwds(){
			if(!username.test($("#pwd").val())){
				$("#spwd").html("6-16位字母数字组合")
				return false;
			}else{
				$("#spwd").html("")
				return true;
			}
		}
		function usernames(){
			var params={"username":$("#username").val()}
			console.log(params);
			$.post("yanzheng.do",params,function(data){
				console.log(data)
				value=data;
				if(data==1){
					$("#susername").html("帐号已存在！");
				}
			})
			if(!username.test($("#username").val())){
				$("#susername").html("6-16位字母数字组合")
				return false;
			}else{
				$("#susername").html("");
				return true;
			}
			if($("#susername").html()=="帐号已存在！")
				return false;
		}
		

	
	function yanzheng(){
		if((!state)&&usernames()&&names()&&pwds()&&phones()){
			$("form:first").trigger("submit");
		}else{
			alert("请正确填写信息！")
		}
	}
</script>	
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
		
		<!-- Message OK -->		
		
		<!-- End Message Error -->
		<br />
		<!-- Main -->
		<div id="main">
			<div class="cl">&nbsp;</div>
			
			<!-- Content -->
			<div id="content">
				<!-- Box -->
				<div class="box">
					<div id="content">
					<p id="whereami">
					</p>
					<h1>
						添加：
					</h1>
					
					<form action="xinxi.do" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									昵称:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="name" id="name" onblur="names()"/>
									<span id="sname"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									帐号:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="username" id="username" onblur="usernames()"/>
									<span id="susername"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									电话:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="phone" id="phone" onblur="phones()"/>
									<span id="sphone"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									密码:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="password" id="pwd" onblur="pwds()"/>
									<span id="spwd"></span>
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									邮箱:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="email" id="email" onblur="emails()"/>
									<span id="semail"></span>
								</td>
							</tr>
						</table>
						<p>
							<input type="button" id="tijiao" class="button" value="确定" />&nbsp&nbsp&nbsp&nbsp
							<input type="button" onclick="window.location.href='toLogin.do'" class="button" value="返回" />
						</p>
					</form>
				</div>
				
			

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



