package org.cdac.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	/**
	 * Servlet id
	 */
	private static final long serialVersionUID = -1630295395575771131L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("XMLServlet called in doGet method!!");
		
		String name = req.getParameter("name");
		
		//super.doGet(req, resp); 
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("Hello XML Servlet by "+ name);
	}

}
