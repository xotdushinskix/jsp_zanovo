package newjsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by FromxSoul on 22.04.2016.
 */
public class ForwardServlet extends HttpServlet {

    protected void forward(String to, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(to);
        requestDispatcher.forward(request, response);
    }

}
