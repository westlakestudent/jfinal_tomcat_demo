package jfinal_tomcat_demo.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * IndexFilter
 * @author chendong
 * 2014年11月18日 上午10:14:47
 * @version 1.0.0
 *
 */
public class IndexFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

}
