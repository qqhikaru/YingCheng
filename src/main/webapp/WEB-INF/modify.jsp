<%@ page  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<link rel="stylesheet" href="css/zhuye.css"/>
<script src="${basepath}js/jquery-1.11.1.js"></script>
<script>
	var n=0;
	var id;
	function start(){	
		id=setInterval(function(){
			n++;
			for(var i=0;i<$("#zhuye img").length;i++){
				$("#zhuye img")[i].className="hide";
			}
			var index=n%$("#zhuye img").length;
			$("#zhuye img")[index].className="";
		},3000);
		
	}
	
	$(function(){
		start();
		$("#zhuye").hover(function(){
			clearInterval(id);
		},function(){
			start();
		});
		
	});

	function phoneTrue() {
	    var val_ = $.trim($("#phone").val());
	    if (val_=="") {
	        $("#phones").html("请输入手机号");
	        return false;
	    }
	    if(!(/^1[34578]\d{9}$/.test(val_))){
	    	$("#phones").html("手机号格式错误");
	        return false;
	    }
	    $("#phones").html("ok");
	    return true;
	}
	$(document).ready(function(){
		$("#phone").on("blur",phoneTrue);
	})
	function pwdTrue(){
    var val_ = $.trim($("#password").val());
    if (val_=="") {
    	 $("#passwords").html("请输入密码");
        return false;
    }
    if(val_.length < 6 || val_.length > 30){
    	 $("#passwords").html("密码长度为6至30个字符");
        return false;
    }
    $("#passwords").html("ok");
    return true;
}
	function emailTrue() {
	    var regEmail= /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	    var val_ = $.trim($("#email").val());
	    if (val_=="") {
	    	$("#emails").html("邮箱不能为空");
	        return false;
	    }
	    if(!(regEmail.test(val_))){
	    	$("#emails").html("邮箱格式错误");
	        return false;
	    }
	    $("#emails").html("ok");
	    return true;
	}
	function xiugai(){
		if(emailTrue()&&pwdTrue()&&phoneTrue()){
			 $("form:first").trigger("submit")
		}else{
			alert("请按提示修改")
		}
	}
	$(document).ready(function(){
		$("#phone").on("blur",phoneTrue);
		$("#password").on("blur",pwdTrue);
		$("#email").on("blur",emailTrue);
		$("#xg").on("click",xiugai);
	})
</script>
<body>
	<div id="zhuye" align="center">
		<img  src="images/revenge.jpg" >
		<img  src="images/afengda.jpg" class="hide">
		<img  src="images/houtian.jpg" class="hide">
		<img  src="images/longfeng.jpg" class="hide">
	</div>
	<div id="icon">
		<div id="icon2">
		<ul id="icon3">
		<li id="index"><a href="index2.do">首页</a></li>
			<li>热门电影</li>
			<li><a href="down.do">电影下载</a></li>
			<li><a href="http://176.119.11.13:8080/hjw.gpxt/HJWYCXT_index.html">影院购票</a></li>
			<li>论坛</li>
			<li><input type="text"/><input type="button" value="影片搜索"/>
		</ul>
		</div>
		
	</div>
	<div id="content">
		<form action ="successmodify.do"style="font-size: 40px;color:white;text-align: center;margin:100px auto;">
			昵称:<input id="name"name="name" value=${name }><span id="names"></span><br/>
			邮箱:<input id="email"name="email" value =${email }><span id= "emails"></span><br/>
			电话:<input id = "phone"name ="phone" value =${phone }><span id="phones"></span><br/>
			密码:<input id= "password"name = "password"  value =${password }><span id = "passwords"></span><br/>
			<input  type="button" value="提交" id ="xg"/>
			<input type="reset" value="重置"/>
		</form>
	
	
	</div>
	<div id="copyright" >
		<p>友情链接 : 达内</p>
		<p>copyright:版权归JSD1703第二组所有</p>
	</div>
</body>
</html>