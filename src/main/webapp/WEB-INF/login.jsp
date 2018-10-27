<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html;charset=utf-8"%> 
<html>
<head>
<meta charset="UTF-8">
<title>国际影城网</title>
<link rel="stylesheet" href="css/zhuye.css"/>
</head>
<script src="js/jquery-1.11.1.js"></script>
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
	function denglu(){
		
	}
	$(function(){
		start();
		$("#zhuye").hover(function(){
			clearInterval(id);
		},function(){
			start();
		});
		
		$("#user").hover(function(){
			$("#login")[0].className="";
			$("#search")[0].className="hide";
		
		},function(){
			$("#login")[0].className="hide";
			$("#search")[0].className="";
		});
		
	});
	function dodenglu(){
		var url = "toindex.do";
		$("#denglu").ajaxSubmit({
			url:url,
			type:"post",
			success:function(){
				alert("ok");
			}
		})
	}
	function doyanzheng(){
		console.log(11)
		  var url="dengluyanzheng.do";
		  var params={
			  "username":$("#zhas").val(),
			  "password":$("#mm").val()
		  }
		  $.post(url,params,function(result){
			 if(result.state==1){
				 $("form:first").trigger("submit")
			}else{
			 alert(result.message);	
			 $("#zhas").val("");
			 $("#mm").val("");
			 
			}
		  });
		}
$(document).ready(function(){
	$("#dl").on("click",doyanzheng);
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
			<li id="user">用户
			<div id="login" class="hide">
				<form action="toindex.do" method="post" id = "denglu">
					帐号：<input name ="username"  id="zhas"/><br/>
					密码：<input type = "password"name = "password" id= "mm"/><br/>
					<input type="button" value="注册" onclick="location='tozhuce.do'">
					<input type="button" id = "dl" value="登陆" >
				</form>	 
			
			</div>	
			</li>
			<li id="search"><input type="text"/><input type="button" value="影片搜索" width="10px"/>
		</ul>
		</div>
		
	</div>
	<div id="content">
	<div id="video">
	<video src="video/502.mp4" width="640" height="480" controls="controls" autoplay="autoplay" loop="loop">
	</video>
	</div>
	<div id="paixing" class="">
		<p style="color:white;background-color: blue;">影片排行榜</p>
		<img src="images/paixing.png">
	</div>
	
	<!-- <p id="p">
		<video src="video/501.mp4" width="320" height="240" controls="controls"/>
	</p>	 -->

	
	</div>
	<div id="copyright" >
		<p>友情链接 : 达内</p>
		<p>copyright:版权归JSD1703第二组所有</p>
	</div>
	
	
	<div id="chat">
	<div>
		<p id="chat2" style="color: red">
			<% 
	try{
		request.setCharacterEncoding("utf-8"); 
		String mywords=request.getParameter("message");
		String t="";
	  if(application.getAttribute("words")==null && mywords!=null){
		t= (String)request.getRemoteAddr() + ":" + mywords + "<br/>";
		application.setAttribute("words",(Object)t);
		out.println(t);
	}
	else if(mywords!=null){
		t=(String)application.getAttribute("words");
		t += (String)request.getRemoteAddr() + ":" + mywords + "<br/>";
		application.setAttribute("words",(Object)t);
		out.println(t);
	}
	}
	catch(Exception e){
	}
	%>
		</p>
	</div>
	
	<div>
		<form method="post" action="index.jsp" > 
			<input name="message" type="text" size=35  >
			<input type="submit" value="发送消息" > 
		</form> 
	</div>
</div>
</body>
</html>