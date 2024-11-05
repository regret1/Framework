package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogFilter implements Filter{

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = "remoteAddr : " + req.getRemoteAddr();
		String uri = "uri : " + req.getRequestURI();
		String url = "url : " + req.getRequestURL().toString();
		String queryString = "queryString : "  + req.getQueryString();
		
		String referer = "referer : " + req.getHeader("referer");
		String agent = "agent : " + req.getHeader("User-agent");
		
		logger.info("LOG FILTER \n" + remoteAddr + "\n" + uri + "\n" + url + "\n" + queryString + "\n" + referer + "\n" + agent);
		
		chain.doFilter(req, response);
		
	}

	@Override
	public void destroy() {
		
	}

}
