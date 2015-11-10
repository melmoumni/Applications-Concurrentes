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
@WebServlet(name="MeteoServlet", urlPatterns="/meteo")
public class MeteoServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    @Inject @MeteoHot private MeteoProvider meteoProvider;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeteoServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/meteo.jsp").forward(request,response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city = request.getParameter("city");
        float temperature = meteoProvider.getMeteo(city);
        request.setAttribute("city", city);
        request.setAttribute("temperature", temperature);
        request.getRequestDispatcher("/meteo.jsp").forward(request, response);
    }



}
