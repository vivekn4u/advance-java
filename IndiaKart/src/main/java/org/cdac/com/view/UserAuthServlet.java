package org.cdac.com.view;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import org.cdac.com.service.entity.UserEntity;
import org.cdac.com.service.usecase.AuthUsecase;

/**
 * @author vivekn4u
 * Servlet implementation class UserAuthServlet
 */

public class UserAuthServlet extends HttpServlet {
	
	//instance variable
	private static final long serialVersionUID = 1L;
	
	private AuthUsecase authUsecase = new AuthUsecase();
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			
			
			
			
			//local variable
			String name = request.getParameter("name");
			String password = request.getParameter("password");
									
			UserEntity user = authUsecase.isUserAuthorized(name, password);
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			if(session.getAttribute("sessionID") != null ) {
				out.print("Hello "+ session.getAttribute("sessionID")  +", welcome to IndiaKart!");
			} else {
			
				//if the the user is not authorized then return to login page
				// else go to home page
				if(user == null || user.getUserid() == -1) {
					
					out.print("This user is not Authorised!!");
					
				} else {
					//set the session id for the authorized user
					//session = request.getSession();
					session.setAttribute("sessionID", name);
					
					out.print("Hello "+ user.getName() +", welcome to IndiaKart!");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	@Override
	public void destroy() {
		authUsecase = null;
		super.destroy();
	}

}
