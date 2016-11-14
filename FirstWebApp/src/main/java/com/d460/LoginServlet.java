package com.d460;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response )
	throws ServletException, IOException {
				
		request.setAttribute("name1", request.getParameter("name"));
		request.setAttribute("pass", request.getParameter("pass"));
		
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request1, HttpServletResponse response )
			throws ServletException, IOException {
						
				request1.setAttribute("namet", request1.getParameter("txtname"));
				request1.setAttribute("passt", request1.getParameter("txtpass"));
				
				String nameok = request1.getParameter("txtname");
				String passok = request1.getParameter("txtpass");
				
				UserValidationService valid = new UserValidationService();
				if(valid.isUserValid(nameok, passok)){
					request1.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(request1, response);
				}
				else{
					request1.setAttribute("errormes", request1.getParameter("Error Messagge!!!"));
					request1.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request1, response);
				}
			}

}
