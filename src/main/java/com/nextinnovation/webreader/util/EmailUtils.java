package com.nextinnovation.webreader.util;

public class EmailUtils {
	public static String getActiveCode(String username,String password,String activecode) {
		StringBuffer sb = new StringBuffer();
		sb.append("<html lang='zh-CN'><head ><meta charset='utf-8'>");
		sb.append("</head><body>内容：请尽快激活您的账号");
		sb.append("<a href=\"http://localhost:8080/TheNewWeb/user_sureRegister?username=");
		sb.append(username.trim());
		sb.append("&password=");
		sb.append(password.trim());
		sb.append("&activecode=");
		sb.append(activecode.trim());
		sb.append("\">");
		sb.append("请点击这里");
		sb.append("</a>");
		sb.append("</body></html>");
		return sb.toString();
	}
}


