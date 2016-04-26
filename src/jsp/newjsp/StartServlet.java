package newjsp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by FromxSoul on 22.04.2016.
 */
public class StartServlet extends ForwardServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("enter") !=null){
            super.forward("/enter.jsp", request, response);
        } else if (request.getParameter("registration") !=null) {
            super.forward("/registration.jsp", request, response);
        }
    }
}
