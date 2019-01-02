package pl.coderslab.controller;

import pl.coderslab.dao.CustomerDao;
import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Customer;
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

@WebServlet(name = "ServletCustomerLoadAll", urlPatterns = "/customerlaodall")
public class ServletCustomerLoadAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        List<Customer> cList = new ArrayList<>();

        CustomerDao customerDao = null;
        try {
            customerDao = new CustomerDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List customerList = customerDao.loadCustomer(cList);

        session.setAttribute("customers", customerList);

        getServletContext().getRequestDispatcher("/jsp/customer_load.jsp").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
