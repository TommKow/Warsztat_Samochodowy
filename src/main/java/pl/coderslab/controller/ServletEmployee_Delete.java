package pl.coderslab.controller;

import org.apache.taglibs.standard.lang.support.ExpressionEvaluatorManager;
import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletEmployee_Delete", urlPatterns = "/employeedel")
public class ServletEmployee_Delete extends HttpServlet {

    public static final String DELETE = "delete";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employeeDelete = request.getParameter(DELETE);

        Integer employeeIdDellete = Integer.parseInt(employeeDelete);

        EmployeeDao employeeDao = null;
        try {
            employeeDao = new EmployeeDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Employee employeeDel = null;
        try {
            employeeDel = employeeDao.deleteEmployee(employeeIdDellete);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(employeeDel != null) {
                response.getWriter().append("Employee Deleted!" );
            }else {
                response.getWriter().append("Something goes wrong");
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
