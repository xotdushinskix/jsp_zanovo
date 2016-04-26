package newjsp;

import models.DBworker;
import models.DataFromForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



/**
 * Created by FromxSoul on 23.04.2016.
 */
public class GiveInfoServlet extends ForwardServlet {

    private String tabName = "name";
    private String tabSecondName = "second_name";
    private String tabEmail = "email";
    private String tabCountry = "country";
    private String tabPassword = "password";


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBworker dBworker = new DBworker();
        DataFromForm dataFromForm = new DataFromForm();


        ArrayList dataData = new ArrayList();
        dataData.add(tabName);
        dataData.add(tabSecondName);
        dataData.add(tabEmail);
        dataData.add(tabCountry);
        dataData.add(tabPassword);


        String queryName = "select " + tabName + ", " + tabSecondName + ", " + tabEmail + ", "+ tabCountry + ", " +
                tabPassword + " from mydbtest.registration_web order by id desc limit 1;";


        try {
            Statement statement = dBworker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(queryName);

            File file = new File("D:\\JavaSpring\\jsp_zanovo\\src\\main\\resources\\user_data.txt");
            FileOutputStream output = new FileOutputStream(file);

            if (resultSet.next()) {
                for (int i = 0; i < dataData.size(); i++) {
                    String helpVar = (String) dataData.get(i);
                    InputStream input = resultSet.getBinaryStream(helpVar);
                    byte[] buffer = new byte[1024];
                    while (input.read(buffer) > 0) {
                        output.write(buffer);
                }

                String name = resultSet.getString(tabName);
                dataFromForm.setName(name);

                String secondName = resultSet.getString(tabSecondName);
                dataFromForm.setSecondName(secondName);

                String email = resultSet.getString(tabEmail);
                dataFromForm.setEmail(email);

                String country = resultSet.getString(tabCountry);
                dataFromForm.setCountry(country);

                String password = resultSet.getString(tabPassword);
                dataFromForm.setPassword(password);

                }

                request.setAttribute("dataFromForm", dataFromForm);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        super.forward("/showRegUser.jsp", request, response);

    }
}
