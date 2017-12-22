<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/rl.css">
	<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/rl.js"></script>
	<script type="text/javascript">
		$(function(){
			init();
			keyBound();
			errorDisplay();
		});
	</script>
</head>
<body	style="width: 100%;height: 100%;background-color: #F7FAFC;margin: 0;padding: 0;">
	
	<div class="lor">
		<div>
				<h1 style="color: #0F88EB;text-align: center; ">WebReader</h1>
				<h2 style="    margin: 20px 0 30px;font-weight: 400;font-size: 18px;line-height: 1;text-align: center;">让小说阅读成为一种享受</h2>
				<div class="switch">
					<a id="loginA">登录</a>
					<a id="registerA">注册</a>
					<span class="a_span" style="margin-left:-10px"></span>
			</div>
			<form action="user_login" method="post" id="iForm">
				<div class="divInput">
					<!-- <input type="text" class="form-control .lrInput" placeholder="昵称" aria-describedby="basic-addon1"> -->
					<!-- <input type="text" class="form-control .lrInput" placeholder="用户名" aria-describedby="basic-addon1">
					<input type="text" class="form-control .lrInput" placeholder="密码" aria-describedby="basic-addon1"> -->
				</div>
				<div id="hiddenErrorUsername" style="display: block;">
					<s:fielderror fieldName="username"></s:fielderror>
				</div>
				<div id="hiddenErrorPassword" style="display: none;">
					<s:fielderror fieldName="password"></s:fielderror>
				</div>
				<div id="hiddenErrorNickname" style="display: none;">
					<s:fielderror fieldName="nickname"></s:fielderror>
				</div>
				<input type="submit" value="登录" class="btn_">
			</form>
		</div>
	</div>
	
</body>
	
</html>