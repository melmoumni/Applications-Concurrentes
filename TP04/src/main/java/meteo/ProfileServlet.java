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
@WebServlet(name="ProfileServlet", urlPatterns="/meteo/profile")
public class ProfileServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    @Inject @Basic IAuthCtrl authCtrl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(authCtrl.getCurrentUser() != null)
            request.getRequestDispatcher("/profile.jsp").forward(request,response);
        else
            request.getRequestDispatcher("/loginPage.jsp").forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
