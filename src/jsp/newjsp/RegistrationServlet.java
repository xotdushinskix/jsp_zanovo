package newjsp;

import models.DBworker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.sql.*;

/**
 * Created by FromxSoul on 21.04.2016.
 */
public class RegistrationServlet extends ForwardServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBworker dBworker = new DBworker();
        response.setContentType("text/html");

        int id = 0;
        String name = request.getParameter("name");
        String secondName = request.getParameter("secondName");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String password = request.getParameter("password");


        try {
            Class.forName("com.mysql.jdbc.Driver");
            PreparedStatement preparedStatement = dBworker.getConnection().prepareStatement
                    ("INSERT INTO registration_web VALUES (?, ?, ?, ?, ?, ?)", id);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, secondName);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, country);
            preparedStatement.setString(6, password);

            int upadateCount = preparedStatement.executeUpdate();

            if(upadateCount == 0) {
                super.forward("/data_dn_insert.jsp", request, response);
            }

            dBworker.getConnection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



        super.forward("/afterRegistrationSelectInfo.jsp", request, response);

    }
}
