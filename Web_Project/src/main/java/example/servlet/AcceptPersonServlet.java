package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AcceptPersonServlet
 */
@WebServlet("/doAccept")
public class AcceptPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	String countryOfOrigin =request.getParameter("myCountry");
	RequestDispatcher dispatcher = null ;
	
	if(countryOfOrigin.equalsIgnoreCase("India")) {
		//forward to /doGreetPerson
		dispatcher= request.getRequestDispatcher("doGreetPerson");
		///Attaching additional information to the current request
	 
		request.setAttribute("greeting", "Welcome ");
		dispatcher.forward(request, response);
		
	}
	else {
		//display some message and redirect to person_entry.html
		out.println("<h1>Sorry, this service is not available in your<h/>");
		dispatcher= request.getRequestDispatcher("person_entry.html");
		dispatcher.include(request,response);
		
		
	}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
