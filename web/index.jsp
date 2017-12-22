<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.min.css">
  	<link rel="stylesheet" type="text/css" href="css/index.css">
  	<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<style type="text/css">
	.body1{
		background-color: #F7F8FA; width: 100%;height: 100%;
	}
	</style>
  </head>
	
  
  <body class="body1">
  		<input type="hidden" name="user_id" value="${existsUser.userId }">
		<div class="headerClass">
			<ul class="lrClass">
				<li><s:a href="javascript:;">个人中心</s:a></li>
				<li><s:a href="javascript:;">退出</s:a></li>
			</ul>
		</div>
   		<div class="bodyClass">
   			<div class="bodyLeft">
   				<div class="menu">
   					<span class="glyphicon glyphicon-plus-sign glyCut"></span>
   					<span id="addBook">添加书籍</span>
   					<span class="glyphicon glyphicon-minus-sign glyCut"></span>
   					<span id="deleteBook">删除书籍</span>
   					
   				</div>
   				<s:if test="![0].top.isEmpty()">
   				<s:iterator value="[0].top">
	   				<div class="bigBox" onclick="goto1(id)">
	 					<font class="titleFont"><s:property value="bookname"/></font>
	 					<div>
		 					<div class="_left">
		 						<img alt="" src="<s:property value="imgurl"/>" style="width: 200px;height: 120px;border-radius:10px;	">
		 					</div>
		 					<div class="_right">
		 						<h4>简介</h4>
		 						<p style="word-break:break-word;">
		 							<s:property value="sth"/>
		 						</p> 
		 					</div>
	   					</div>
	   					<div class="bookjd">
	   						<span class="glyphicon glyphicon-bookmark"></span>
	   						<span>最近阅读</span>
	   						<h5 class="bookH5">第一章</h5>
	   						<p>阿里客服经理卡手机发的卡时间段福利卡时间段风口浪发到空间</p>
	   						<div class="progress" style="position: relative;top: 15px;width: 470px;left:5px;">
								<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
								  0%
								</div>
							</div>
							<div class="btn-group btn-group-justified" role="group" aria-label="..." style="position: relative;width: 470px;left:5px;" >
								<div class="btn-group" role="group">
									<button type="button" class="btn btn-default">继续阅读</button>
								</div>
								<div class="btn-group" role="group">
									<button type="button" class="btn btn-default">目录</button>
								</div>
								<div class="btn-group" role="group">
									<button type="button" class="btn btn-default">重新阅读</button>
								</div>
							</div>
	   					</div>
	   				</div>
  				</s:iterator>
  				</s:if>
   			</div>
   			<div class="bodyRight">
   				<div class="menu1">
   					<div class="menuItem">   					
	   					<span class="glyphicon glyphicon-cloud glyCut"></span>
	   					<span>我的书单</span>
   					</div>
   					<div class="menuItem">   					
	   					<span class="glyphicon glyphicon-cloud glyCut"></span>
	   					<span>我的书籍</span>
   					</div>
   					<div class="menuItem">   					
	   					<span class="glyphicon glyphicon-cloud glyCut"></span>
	   					<span>我的收藏</span>
   					</div>
   					<div class="menuItem">   					
	   					<span class="glyphicon glyphicon-cloud glyCut"></span>
	   					<span>我的消息</span>
	   					<span class="menuItemNum">0</span>
   					</div>
   					
   					<div class="menuItem">   					
	   					<span class="glyphicon glyphicon-cloud glyCut"></span>
	   					<span>关注书单</span>
	   					<span class="menuItemNum">0</span>
   					</div>
   					
   					
   				</div>
   			</div>
   		</div>
  </body>

</html>
