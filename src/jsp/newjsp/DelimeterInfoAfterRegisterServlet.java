package newjsp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by FromxSoul on 24.04.2016.
 */
public class DelimeterInfoAfterRegisterServlet extends ForwardServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("get_full_info") !=null){
            super.forward("/selectFullValue.jsp", request, response);
        } else if (request.getParameter("get_single_info") !=null) {
            super.forward("/selectSingleValue.jsp", request, response);
        }
    }

}
