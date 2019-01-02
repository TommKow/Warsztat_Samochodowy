package pl.coderslab;

import pl.coderslab.dao.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "ServletTest", urlPatterns = "/test")
public class ServletTest extends HttpServlet {

    public static final String SELECT_FROM_CAR = "select * from vehicle;";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Connection conn = DbUtil.getConn();
            PreparedStatement prepStat = conn.prepareStatement(SELECT_FROM_CAR);
            ResultSet resultSet = prepStat.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String user = resultSet.getString("user");
                response.getWriter().append("<html><body><table><tr><td>" + id + "</td>\n" + "<td>" + name + "</td>\n" + "<td>" + user + "</td></tr></table></body></html>");
            }

            response.getWriter().append("\nJakis tekst");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


