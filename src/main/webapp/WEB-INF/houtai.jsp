
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>影城管理系统</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<script type="text/javascript" src="${basePath}/js/jquery-1.11.1.js"></script>
<% Object admin=session.getAttribute("admin");
	if(admin==null){
		response.sendRedirect("index.jsp");
		return;
	}
%>


<script>
var current=<%=request.getAttribute("page")%>;

if(!current){
	current=1;
}
var pageCount=<%=request.getAttribute("count")%>

$(document).ready(function(){
		$("#pageId").on('click','.pre,.next',page);
		$("#current").html(current);
		$("#pagecont").html("共"+pageCount+"页");
		console.log(current)
		console.log(pageCount)
	})
function page(){
	var clazz=$(this).attr("class");
	console.log(clazz)
	if(clazz=="pre"&&current>1){
			current--;
			location.href="goto.do?currentPage="+current;
			$("#current").html(current);
			
	}else if(clazz=="next"&&current<pageCount){
			current++;
			location.href="next.do?currentPage="+current;
			$("#current").html(current);
	}
}
function quanxuan(isChecked){
	var list=$('tr input[name="duoxuan"]');
	for(var i=0;i<list.length;i++){
		if(list[i].type=="checkbox"){
			list[i].checked=isChecked;
		}
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
			
			
			
		</div>
		<!-- End Small Nav -->
		
		<!-- Message OK -->		
		<div class="msg msg-ok">
			
		</div>
		<!-- End Message OK -->		
		
		<!-- Message Error -->
		<div class="msg msg-error">
			
		</div>
		<!-- End Message Error -->
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
						<div class="right">
							<form action="sousuo.do">
							<label>搜索</label>
							
							<input type="text" class="field small-field" name="sousuo" />
							
							<input type="submit" class="button" value="确定" />
							</form>
						</div>
					</div>
					<!-- End Box Head -->	

					<!-- Table -->
					<div class="table">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th width="13"><input type="checkbox" class="checkbox" onclick="quanxuan(this.checked)"/></th>
								<th>ID</th>
								<th>会员帐号</th>
								<th>注册昵称</th>
								<th>注册时间</th>
								<th>手机号</th>
								<th>邮箱</th>
								<th>权限</th>
								<th width="110" class="ac">操作</th>
							</tr>
							<c:forEach items="${list}" var="e" varStatus="s">
							<tr>
								<td><input name="duoxuan" type="checkbox" class="checkbox" value="${e.id}"/></td>
								<td>${e.id}</td>
								<td><h3><a href="#">${e.username}</a></h3></td>
								<td>${e.name}</td>
								<td>${e.cdate}</td>
								<td>${e.phone}</td>
								<td>${e.email}</td>
								<td><a href="#">管理</a></td>
								<td><a href="del.do?id=${e.id}" class="ico del">删除</a><a href="load.do?id=${e.id}" class="ico edit">编辑</a></td>
							</tr>
							</c:forEach>
						</table>
						
						
						<!-- Pagging -->
						<div class="pagging">
							<div class="left">Showing</div>
							<div class="right" id="pageId">
								<a  class="pre">上一页</a>
								<a id="current"></a>
								<a id="pagecont"></a>
								<a  class="next">下一页</a>
							</div>
						</div>
						<!-- End Pagging -->
						
					</div>
					<!-- Table -->
					
				</div>
				<!-- End Box -->
				
			

			</div>
			<!-- End Content -->
			
			<!-- Sidebar -->
			<div id="sidebar">
				
				<!-- Box -->
				<div class="box">
					
					<!-- Box Head -->
					<div class="box-head">
						<h2>管理</h2>
					</div>
					<!-- End Box Head-->
					
					<div class="box-content">
						<a href="tianjia.do" class="add-button"><span>添加</span></a>
						<div class="cl">&nbsp;</div>
						
						<p class="select-all"><label></label></p>
						<p></p>
						
						<!-- Sort -->
						<div class="sort">
							<label>分类</label><br/>
							
								<a href="toLogin.do?"></a><br/><br/>
							
							
								<a href="toLogin.do"></a><br/><br/>
							
								<a href="toLogin.do"></a>

						</div>
						<!-- End Sort -->
						
					</div>
				</div>
				<!-- End Box -->
			</div>
			<!-- End Sidebar -->
			
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