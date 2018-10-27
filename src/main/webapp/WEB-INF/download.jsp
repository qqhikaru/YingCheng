<%@ page  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta charset="UTF-8">
<title>国际影城网</title>
<link rel="stylesheet" href="css/zhuye.css"/>
</head>

<script src="js/jquery-1.11.1.js"></script>
<script>

	function guankan(){
		location.assign("guankan.html");
	}



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
		doGetFilm();
		$("#zhuye").hover(function(){
			clearInterval(id);
		},function(){
			start();
		});
		
		$("#user1").hover(function(){
			$("#login")[0].className="";
			$("#search")[0].className="hide";
		
		},function(){
			$("#login")[0].className="hide";
			$("#search")[0].className="";
		});
		
	});
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
	if($("#lp").html()=="欢迎"){
	$("#user2").hide()	
	}else{
		$("#user1").hide()
	}
	
	

})


/*电影搜索  */
function doGetFilm(){
		var url="findFilm.do";
		var cover=$("#cover");
		var body=$("#content");
		var params={"filmname":$("#film").val()}
		console.log(params);
		cover.empty();
		$.post(url,params,function(result){
			console.log(result);
			  for(var i in result){
		 var li='<li>'+'<a href="detail.html">'+result[i].filmname+'<img  src="'+result[i].address+' "></a><input type="button" value="下载"/><input type="button" value="观看" onclick="guankan()"/></li>'
				cover.append(li);
		 		body.append(cover);
			}  
			
		})
	} 



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
			<li>电影下载</li>
			<li>影院购票</li>
			<li>论坛</li>
			<li id="user1">用户
			<div id="login" class="hide">
				<form action="toindex.do" method="post" id = "denglu">
					帐号：<input name ="username"  id="zhas"/><br/>
					密码：<input type = "password"name = "password" id= "mm"/><br/>
					<input type="button" value="注册" onclick="location='tozhuce.do'">
					<input type="button" id = "dl" value="登陆" >
				</form>	 
			</div>
			</li>
				<li id="user2"><span id= "lp">欢迎${name }</span>
					&nbsp<a href ="quit.do">退出</a>&nbsp
					<a href ="tomodify.do">个人信息</a>
			</li>			
				
			
			<li id="search"><input id="film" type="text"/><input type="button" id="searchId" value="影片搜索" onclick="doGetFilm()" width="10px"/>
		</ul>
		</div>
		
	</div>
	<div id="content">
		<ul id="cover">
			

		</ul>
	
	</div>
	<div id="copyright" >
		<p>友情链接 : 达内</p>
		<p>copyright:版权归JSD1703第二组所有</p>
	</div>
</body>
</html>