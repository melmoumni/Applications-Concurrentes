package UserServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Object.User;
import Object.UsersListSingleton;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet(name="CreateUserServlet", urlPatterns="/meteo/create-user")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html><html><body>");
		out.println("<h1>Create a user</h1>");
		out.println("<form action='/TP04/meteo/create-user' method='POST'>");
		out.println("<input type='text' name='firstname' placeholder='First Name' required='true'>");
		out.println("<input type='text' name='lastname' placeholder='Last Name' required='true'>");
		out.println("<input type='submit' value='create'>");
		out.println("</form>");
		//	out.println("<h1>" +user.getFirstName()+ "    "+user.getLastName()+"</h1>");
		
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		User user = new User(firstName, lastName);
		UsersListSingleton.getUsersList().add(user);
		response.sendRedirect("/TP04/meteo/users");
	}

}
