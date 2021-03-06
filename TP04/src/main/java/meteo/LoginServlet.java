package meteo;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mohammed on 11/11/15.
 */
@WebServlet(name="LoginServlet", urlPatterns="/meteo/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Inject @Basic private IAuthCtrl authCtrl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/loginPage.jsp").forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(request.getParameter("firstname"), request.getParameter("lastname"), request.getParameter("psswd"));
        if(authCtrl.authentificate(user))
            response.sendRedirect("/TP04/meteo");
        else
            doGet(request, response);
    }
}
