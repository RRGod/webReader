package com.nextinnovation.webreader.action;

import com.nextinnovation.webreader.util.CookieUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	protected T model;
	public T getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public BaseAction() {
		Type superclass = this.getClass().getGenericSuperclass();
		ParameterizedType parameterizedType = (ParameterizedType)superclass;
		Class<T> modelClass = (Class<T>)parameterizedType.getActualTypeArguments()[0];
		
		try {
			model = modelClass.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void setSession(String key,Object value){
		if(value == null){
			ServletActionContext.getRequest().getSession().removeAttribute(key);
		}else{
			ServletActionContext.getRequest().getSession().setAttribute(key, value);
		}
		
	}
	public Object getSession(String key){
		return ServletActionContext.getRequest().getSession().getAttribute(key);
	}
	
	public void setCookie(String key,String value){
		if("remove".equals(value)){
			ServletActionContext.getResponse().addCookie(CookieUtils.deleteCookie(key));
		}else{
			ServletActionContext.getResponse().addCookie(CookieUtils.getCookie(key, value));
		}
	}
	
	public void setRequest(String key,Object value){
		if(value == null){
			ServletActionContext.getRequest().removeAttribute(key);
		}else{
			ServletActionContext.getRequest().setAttribute(key, value);
		}
	}
	
	public Object getRequest(String key){
		return ServletActionContext.getRequest().getAttribute(key);
	}
	
	//封装值栈的操作:
	
		//root栈 压栈操作(栈顶匿名对象)
		public void pushToValueStackRoot(Object o){
			ActionContext.getContext().getValueStack().push(o);
		}
		
		//栈顶map
		public void setToValueStackRoot(String  key,Object value){
			ActionContext.getContext().getValueStack().set(key, value);
		}
		
		
		//map栈:
		public void putToValueStackMap(String  key,Object value){
			ActionContext.getContext().put(key, value);
		}
}
