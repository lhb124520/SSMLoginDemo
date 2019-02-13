<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录成功</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,user-scalable=no">
<link rel="stylesheet"  type="text/css" href="cs/style.css" >
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/vue/2.2.2/vue.min.js"></script>
<script src="js/vue.min.js"></script>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(function(){
    $("#back").click(function(){
       $(window).attr('location',"/SSMLoginDemo/Login.jsp");
    	/* window.location.href="/SSMLoginDemo/Login.jsp"; */
    });
});
</script>
</head>

<body>
	<div align="center">
	<h1>登录成功！</h1>
	<input type="button" name="btn" value="返回登录" id="back">
	</div>
	
</body>

</html>