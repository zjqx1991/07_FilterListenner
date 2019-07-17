/**
 * 
 */
package com.revanwang.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 17, 20198:31:59 PM
 */
public class RequestFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.print("RequestFilter-init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("RequestFilter-A-before");
		//放行
		chain.doFilter(request, response);
		System.out.println("RequestFilter-A-after");
	}

	@Override
	public void destroy() {
		System.out.println("RequestFilter-destroy");
	}

}
