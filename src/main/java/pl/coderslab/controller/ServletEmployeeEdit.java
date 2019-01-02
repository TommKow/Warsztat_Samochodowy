package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletEmployeeEdit", urlPatterns = "/employeeedit")
public class ServletEmployeeEdit extends HttpServlet {

    public static final String NAME = "name";
    public static final String SURNAME = "surname";
    public static final String EMAIL = "email";
    public static final String DATA = "dataEmployee";
    public static final String PHONE_NUMBER = "phoneNumberS";
    public static final String SALARY_PH = "salaryPhS";
    public static final String ID = "id";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idS = request.getParameter(ID);
        String name = request.getParameter(NAME);
        String surname = request.getParameter(SURNAME);
        String email = request.getParameter(EMAIL);
        String dataEmployee = request.getParameter(DATA);
        String phoneNumberS = request.getParameter(PHONE_NUMBER);
        String salaryPhS = request.getParameter(SALARY_PH);

        Integer id = Integer.parseInt(idS);
        Integer phoneNumber = Integer.parseInt(phoneNumberS);
        Double salaryPh = Double.parseDouble(salaryPhS);

        try {
            Employee employee = new Employee(id, name, surname, email, dataEmployee, phoneNumber, salaryPh);
            EmployeeDao employeeDao = new EmployeeDao();
            if(employeeDao.editEmployee(employee) != null) {
                response.getWriter().append("UPDATED !");
            }else {
                response.getWriter().append("DOES NOT UPDATE !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
