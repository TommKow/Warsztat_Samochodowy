package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletEmployee", urlPatterns = "/employee")
public class ServletEmployee extends HttpServlet {

    public static final String ID = "id";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idString = request.getParameter(ID);
        Integer id = Integer.parseInt(idString);

        EmployeeDao employeeDao = null;
        try {
            employeeDao = new EmployeeDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Employee employeeById = employeeDao.loadEmployeeById(id);

        request.setAttribute("employeeById", employeeById);

        getServletContext().getRequestDispatcher("/jsp/employee_view.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        List<Employee> eList = new ArrayList<>();
        EmployeeDao employeeDao = null;
        try {
            employeeDao = new EmployeeDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List employeeList = employeeDao.loadEmployee(eList);

        session.setAttribute("employee", employeeList);

        getServletContext().getRequestDispatcher("/jsp/employee.jsp").forward(request, response);
    }
}
