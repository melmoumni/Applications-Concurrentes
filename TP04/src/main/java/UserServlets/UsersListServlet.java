package UserServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Object.User;
import Object.UsersListSingleton;

/**
 * Servlet implementation class UsersListServlet
 */
@WebServlet(name="UsersListServlet", urlPatterns="/meteo/users")
public class UsersListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<User> usersList = UsersListSingleton.getUsersList();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersListServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html><html><body>");
		out.println("<h1>Users List</h1>");
		for(User user: usersList){
			out.println(user.getFirstName()+ "    "+user.getLastName()+"</br>");
		}
		out.print("<a href='/TP04/meteo/create-user'>New</a>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
