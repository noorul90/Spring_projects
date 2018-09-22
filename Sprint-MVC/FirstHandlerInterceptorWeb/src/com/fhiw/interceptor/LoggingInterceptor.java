package com.fhiw.interceptor;

import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoggingInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object controller, Exception errors)
			throws Exception {
		System.out.println("afterCompletion()...");
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object controller, ModelAndView mav) throws Exception {
		System.out.println("postHandle() started...");
		Collection<String> headerNames = response.getHeaderNames();
		for(String headerName : headerNames){
			System.out.println(response.getHeader(headerName));
			System.out.println("postHandle() completed....");
		}
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object controller) throws Exception {
		Enumeration<String> headerName = request.getHeaderNames();
		while(headerName.hasMoreElements()){
		String headerNames = headerName.nextElement();
		System.out.println(request.getHeader(headerNames));
		System.out.println("preHandle() completed.....");
		}
		return true;
	}
	

}
