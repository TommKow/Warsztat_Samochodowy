package pl.coderslab.controller;

import pl.coderslab.dao.CustomerDao;
import pl.coderslab.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletCustomerAdd", urlPatterns = "/customeradd")
public class ServletCustomerAdd extends HttpServlet {

    public static final String NAME = "name";
    public static final String SURNAME = "surname";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter(NAME);
        String surname = request.getParameter(SURNAME);

        Customer customer = new Customer(name, surname);
        CustomerDao customerDao = null;
        try {
            customerDao = new CustomerDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(customerDao.saveCustomer(customer) != null) {
            response.getWriter().append("SAVED IN DB !");
        }else {
            response.getWriter().append("DOES NOT SAVED !");
        }


    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
