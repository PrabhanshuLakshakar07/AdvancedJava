package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(name = "myGreetingServlet", urlPatterns = { "/doGreet" })
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Setting the MIME type for generating html response
		//MIME(Multi-Purpose Internet Mail Extension )
		String contentType ="text/html";
		response.setContentType(contentType);
		
		//Building the response text
		
		String responseText=
				"<h1 style='color:red'>Welcome to Servlet..</>";
		
		//Obtaining a printWriter associated with response object
		PrintWriter out = response.getWriter();		
		
		//sending the response
		out.println(responseText);
		
		
		
		
	}

}









