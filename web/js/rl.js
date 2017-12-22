function keyBound (){
	$("#loginA").click(function(){
		rlTurn("login");
	});
	$("#registerA").click(function(){
		rlTurn("register");
	});
}

function init(){
	rlTurn("login");
}

function rlTurn(flag){
	if(flag == "login"){
		$("#loginA").css("color","#0F88EB");
		$("#registerA").css("color","#A6A8A9");
		$(".a_span").animate({
			"margin-left":"-10px"
		},300,'linear');
		$(".divInput").empty()
		.append("<input type='text' name='username' class='form-control .lrInput' placeholder='用户名' aria-describedby='basic-addon1'>")
		.append("<input type='text' name='password' class='form-control .lrInput' placeholder='密码' aria-describedby='basic-addon1'>");
		$(".btn_").val("登录");
		$("#iForm").attr("action","user_login");
	}else if(flag == "register"){
		$("#registerA").css("color","#0F88EB");
		$("#loginA").css("color","#A6A8A9");
		$(".a_span").animate({
			"margin-left":"61px"
		},300,'linear');
		$(".divInput").empty()
		.append("<input type='text' name='nickname' class='form-control .lrInput' placeholder='昵称' aria-describedby='basic-addon1'>")
		.append("<input type='text' name='username' class='form-control .lrInput' placeholder='用户名' aria-describedby='basic-addon1'>")
		.append("<input type='text' name='password' class='form-control .lrInput' placeholder='密码' aria-describedby='basic-addon1'>");
		
		$(".btn_").val("注册");
		$("#iForm").attr("action","user_register");
	}
}


function errorDisplay(){
	var usernameErrorMessage = $("#hiddenDivUsername .errorMessage li span").html();
	//alert(usernameErrorMessage);
}