package com.nextinnovation.webreader.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class MyRequest extends HttpServletRequestWrapper {
	HttpServletRequest request;
	boolean flag = false;

	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;// 将构造方法传递原始request 注入给当前MyRequest 对象
	}

	// 三个方法获取客户端提交用户数据
	@Override
	public String getParameter(String name) {
		// 先编码后解码 get post不需要
		Map<String, String[]> map = getParameterMap();
		String[] values = map.get(name);
		return values == null ? null : values[0];
	}

	@Override
	public Map<String, String[]> getParameterMap() { // map方法是数据源,其他的方法从map中获取参数即可
		String method = request.getMethod();
		if ("get".equalsIgnoreCase(method)) {
			if (!flag) { // 自锁
				// 确认 该方法业务只执行一次
				Map<String, String[]> map = request.getParameterMap();
				try {
					for (String key : map.keySet()) {
						String[] values = map.get(key);// map value值 用户输入数据
						if (values != null && values.length != 0) {
							for (int i = 0; i < values.length; i++) {
								values[i] = new String(
										values[i].getBytes("iso-8859-1"),
										"utf-8");
							}
						}
					}
					flag = true;
					return map;
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
					throw new RuntimeException("get乱码处理错误.,...." + e);
				}
			}
		}
		return super.getParameterMap();
	}

	@Override
	public String[] getParameterValues(String name) {
		Map<String, String[]> map = getParameterMap();
		return map.get(name);
	}

}
