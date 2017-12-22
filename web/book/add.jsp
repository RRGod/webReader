<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="../css/add.css">
<link rel="stylesheet" type="text/css" href="../css/zui/zui.uploader.css">
<link rel="stylesheet" type="text/css" href="../css/uploader.css">
<%@include file="../commonjsp/header.jsp" %>
<body style="background-color: #F7F8FA;">
	<div class="body1">
		<div class="show1">

			<div class="bigBox">
				<div class="bookjd">
					<span class="glyphicon glyphicon-asterisk"></span>
					<span style="font-family: '华文琥珀';font-size: 24px;">书籍提交进度</span>
					<div class="progress" style="position: relative;top: 15px;width: 470px;left:5px;">
						<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 1%;">
							1%
						</div>
					</div>
				</div>
				<font class="titleFont" id="bookname1">书籍名称</font>
				<div>
					<div class="_left">
						<img id="imgurl1" alt="" src="../img/1.jpg" style="width: 200px;height: 120px;border-radius:10px;	">
					</div>
					<div class="_right">
						<h4>简介</h4>
						<p style="word-break:break-word;" id="sth1">Socket 编程让你沮丧吗？
							我将和所有人共享我的知识了。
							如果你了解 C 语言并。</p> 
					</div>
				</div>

			</div>
		</div>

		<div class="inputDiv" id="uploadBookInformationDiv">
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon2">书名</span>
				<input type="text" class="form-control" placeholder="哈姆雷特" aria-describedby="basic-addon2" id="bookname" name="bookname">
			</div>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon3">作者</span>
				<input type="text" class="form-control" placeholder="亚历山大" aria-describedby="basic-addon2" id="auther" name="auther">
			</div>
			<div class="input-group">
				<input name="sth" id="sth" type="text" class="form-control" placeholder="这是一本很棒的小说" aria-describedby="basic-addon2" style="width:470px;height:100px;">
			</div>
		</div>
		<div class="uploadDiv" id="uploadImgDiv">
		</div>

		<div class="uploadDiv" style="margin-top: 10px;" id="uploadBookDiv">
		</div>
		<div class="inputButton">
			<div style="position: absolute;left: 30%;cursor:pointer;" id="preButton" >
				<span class="glyphicon glyphicon-chevron-left setgGlyphicon"></span>
				<span style="font-size:18px; line-height:10px;margin:0px;padding: 0px;vertical-align: 4px;">重置</span>
			</div>
			<div style="position: absolute;left: 55%;cursor:pointer;" id="nextButton" >
				<span style="font-size:18px; line-height:10px;margin:0px;padding: 0px;vertical-align: 4px;">提交</span>
				<span class="glyphicon glyphicon-chevron-right setgGlyphicon"></span>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript" src="../js/zui/zui.js"></script>
<script type="text/javascript" src="../js/zui/zui.lite.js"></script>
<script type="text/javascript" src="../js/zui/zui.uploader.js"></script>
<script type="text/javascript" src="../js/add.js"></script>
<script src="../js/uploader.js"></script>
<script>
	$(function(){
        setUploaderMouse('#uploadImgDiv',"image/jpeg,image/jpg,image/png");
        setUploaderMouse('#uploadBookDiv',"image/jpeg,image/jpg,image/png");
	})
</script>
</html>