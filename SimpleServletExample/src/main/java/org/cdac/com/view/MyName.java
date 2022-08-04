/**
 * 
 */
package org.cdac.com.view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author vivekn4u
 *
 */

class MyServlet extends HttpServlet {

	/**
	 * @author vivekn4u
	 * Simply put, we use the serialVersionUID attribute to remember versions of a 
	 * Serializable class to verify that a loaded class and the serialized object are compatible
	 */
	private static final long serialVersionUID = -767089472513293530L;
	
	//instance variable
	private String name;
	
	
	/**
	 * @author vivekn4u
	 * to initialized the servlet instance variables
	 */
	@Override
	public void init() throws ServletException {
		
		//we have initialize the name instance variable
		name = "CDAC";
		
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		doGet(arg0, arg1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			PrintWriter write = resp.getWriter();
			write.print("Hello World, I am from "+ name);
			
		} catch(Exception e) {
			System.out.println("Error occured - "+e.getMessage());
		}

	}
	
	@Override
	public void destroy() {
		//release the reference of the name instance variable
		//so that garbage collector can clean it from memory
		name = null;
		super.destroy();
	}
	
}