package com.nextinnovation.webreader.interceptor;

import com.nextinnovation.webreader.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Map;


public class LoginInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session = (Map<String, Object>) invocation.getInvocationContext().get("session");
		User existsUser = (User) session.get("existsUser");
		if(existsUser == null){
			ActionSupport action = (ActionSupport) invocation.getAction();
			action.addActionError(action.getText("user.nologin"));
			return "no_login";
		}
		return invocation.invoke();
	}

}
