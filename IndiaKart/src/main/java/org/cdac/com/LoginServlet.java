/**
 * 
 */
package org.cdac.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author vivekn4u
 *	this is a login servlet for IndiaKart
 *HTTP protocol is state less - client browser {ID} 
 */

public class LoginServlet extends HttpServlet {
	
	//instance variables
	private String name;
	
	
	/**
	 * @author vivekn4u
	 * Initialization of login page servlet - start
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
	}
		
	
	/**
	 * @author vivekn4u
	 * @param req - http data from browser to container
	 * @param resp - http data from container to browser
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.print("My Login Servlet!!");		
		
	}
	
	
	/**
	 * @author vivekn4u
	 * code clean up method
	 */
	@Override
	public void destroy() {
		name = null;
		super.destroy();
	}
		
	
}
