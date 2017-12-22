package com.nextinnovation.webreader.util;

import javax.servlet.http.Cookie;

public class CookieUtils {
	public static Cookie getCookie(String key,String value){
		Cookie cookie = new Cookie(key,value);
		cookie.setMaxAge(3600*24);
		cookie.setPath("/");
		return cookie;
	}
	
	public static Cookie deleteCookie(String key){
		Cookie cookie = new Cookie(key,"");
		cookie.setMaxAge(0);
		cookie.setPath("/");
		return cookie;
	}
}
