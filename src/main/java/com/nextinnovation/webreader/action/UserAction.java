package com.nextinnovation.webreader.action;

import com.nextinnovation.webreader.entity.User;
import com.nextinnovation.webreader.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

import java.util.Map;

public class UserAction extends BaseAction<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@InputConfig(resultName="login_fail")
	public String login(){
		if(model == null){
			return "login_fail";
		}
		User existsUser = userService.login(model);
		Map<String,Object> session = (Map<String, Object>) ActionContext.getContext().get("session");
		session.put("existsUser", existsUser);
		return "login_success";
	}

}
