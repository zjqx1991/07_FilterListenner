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
 * @Date Jul 17, 20198:41:54 PM
 */
public class Request_BFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter_B_init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter_B_before");
		chain.doFilter(request, response);
		System.out.println("Filter_B_after");
	}

	@Override
	public void destroy() {
		System.out.println("Filter_B_destroy");
	}

}
