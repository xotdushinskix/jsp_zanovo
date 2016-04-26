package newjsp;

import models.DBworker;
import models.DataFromForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by FromxSoul on 24.04.2016.
 */
public class GiveSingleInfoServlet extends ForwardServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataFromForm dataFromForm = new DataFromForm();
        DBworker dBworker = new DBworker();


        String item = request.getParameter("regItem");
        String queryName = "select " + item + " from registration_web ORDER BY id DESC LIMIT 1;";


        try {
            Statement statement = dBworker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(queryName);

            if (resultSet.next()) {
                String someVar = resultSet.getString(item);
                dataFromForm.setForAnyField(someVar);
            }

            request.setAttribute("dataFromForm", dataFromForm);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        super.forward("/singleInfo.jsp", request, response);

    }
}
