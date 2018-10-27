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
	function zhuceyanzheng(){
		var url="zhuceyanzheng.do";
		var gg=$.trim($("#username").val());
		var params = {"username":$("#username").val()}
		if(gg.length < 6 || gg.length > 20){
	    	 $("#lop").html("帐号长度为6至30个字符");
	    	 return false;	 
		}
		$.post(url,params,function(result){
			if(result.data){
				$("#lop").html("OK")
			}else{
				$("#lop").html("用户名已被占用")
			}
		});
		if($("#lop").html()=="用户名已被占用"){
			return false;
		}else{
			return true;
		}
	}
	function phoneTrue() {
	    var gg = $.trim($("#phone").val());
	    if (gg=="") {
	        $("#phones").html("请输入手机号");
	        return false;
	    }
	    if(!(/^1\d{10}$/.test(gg))){
	    	$("#phones").html("手机号格式错误");
	        return false;
	    }
	    $("#phones").html("ok");
	    return true;
	}
	
	function pwdTrue(){
    var gg = $.trim($("#password").val());
    if (gg=="") {
    	 $("#passwords").html("请输入密码");
        return false;
    }
    if(gg.length < 6 || gg.length > 30){
    	 $("#passwords").html("密码长度为6至30个字符");
        return false;
    }
    $("#passwords").html("ok");
    return true;
}
	function emailTrue() {
	    var regEmail= /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	    var gg = $.trim($("#email").val());
	    if (gg=="") {
	    	$("#emails").html("邮箱不能为空");
	        return false;
	    }
	    if(!(regEmail.test(gg))){
	    	$("#emails").html("邮箱格式错误");
	        return false;
	    }
	    $("#emails").html("ok");
	    return true;
	}
	function zhuce(){
		console.log(zhuceyanzheng());
		console.log(emailTrue());
		console.log(pwdTrue());
		console.log(phoneTrue());
		if(zhuceyanzheng()&emailTrue()&pwdTrue()&phoneTrue()){
			 $("form:first").trigger("submit")
		}else{
			alert("请按提示填充")
		}
	}
	
	$(document).ready(function(){
		$("#username").on("blur",zhuceyanzheng);
		$("#phone").on("blur",phoneTrue);
		$("#password").on("blur",pwdTrue);
		$("#email").on("blur",emailTrue);
		$("#zc").on("click",zhuce);
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
		<form action ="zhuce.do" method ="post"style="font-size: 40px;color:white;text-align: center;margin:100px auto;">
			帐号:<input id = "username" name="account" "/><span id="lop"></span><br/>
			密码:<input id = "password"name ="password" type = "password"><span id="passwords"></span><br/>
			昵称:<input name="name"/><br/>
			邮箱:<input id = "email" name="email"/><span id="emails"></span><br/>
			电话:<input  id = "phone"name ="phone"/><span id="phones"></span><br/>
			<input id="zc" type="button" value="注册"/>
			<input type="reset" value="重置"/>
		</form>
	
	
	</div>
	<div id="copyright" >
		<p>友情链接 : 达内</p>
		<p>copyright:版权归JSD1703第二组所有</p>
	</div>
</body>
</html>