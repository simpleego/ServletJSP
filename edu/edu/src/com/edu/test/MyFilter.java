package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/*@WebFilter(
        urlPatterns = "/*",
        initParams = @WebInitParam(name = "en", value = "UTF-8")       
)*/
public class MyFilter implements Filter{
	
	
	
  // 필터 구현
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}@Override
		public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
				throws IOException, ServletException {
			// TODO Auto-generated method stub
			
		}
	@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}
}
