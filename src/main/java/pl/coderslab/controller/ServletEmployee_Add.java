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

@WebServlet(name = "ServletEmployee_Add", urlPatterns = "/employeeadd")
public class ServletEmployee_Add extends HttpServlet {

    public static final String NAME = "name";
    public static final String SURNAME = "surname";
    public static final String EMAIL = "email";
    public static final String DATA = "dataEmployee";
    public static final String PHONE_NUMBER = "phoneNumberS";
    public static final String SALARY_PH = "salaryPhS";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter(NAME);
        String surname = request.getParameter(SURNAME);
        String email = request.getParameter(EMAIL);
        String dataEmployee = request.getParameter(DATA);
        String phoneNumberS = request.getParameter(PHONE_NUMBER);
        String salaryPhS = request.getParameter(SALARY_PH);

        Integer phoneNumber = Integer.parseInt(phoneNumberS);
        Double salaryPh = Double.parseDouble(salaryPhS);

        try {
            Employee employee = new Employee(name, surname, email, dataEmployee, phoneNumber, salaryPh);
            EmployeeDao employeeDao = new EmployeeDao();
            if(employeeDao.saveToDb(employee) != null) {
                response.getWriter().append("SAVED IN DATABASE !");
            }else {
                response.getWriter().append("DOES NOT SAVE IN DATABASE !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
