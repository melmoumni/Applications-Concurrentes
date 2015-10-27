package com.groupeonepoint.enseirb.war.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet declaration to the servlet container
@WebServlet(name="HelloServlet", urlPatterns="/hello")
/**
 * A servlet that prints hello to the screen
 * If a name and a number are given it says hello name number times
 * Number must be > 0
 * The default name is John and the default number is 1 
 * @author mohammed
 *
 */
public class ServletHelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	// Method called when a GET request is received
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String loop = req.getParameter("loop");
		Integer number = 1;
		try{	
			number = Integer.parseInt(req.getParameter("loop"));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}finally{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			if(name == null)
				name = "John";
			if(number == null || number <= 0)
				number = 1;
			out.print("<!DOCTYPE html><html><body>");
			for(int i = 0; i< number; i++){
				out.println("<h1>" + "Hello " +name+ "</h1>");		
			}
			out.print("</body></html>");
		}
	}
}
