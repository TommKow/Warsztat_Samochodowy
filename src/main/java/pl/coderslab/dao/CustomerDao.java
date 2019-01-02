package pl.coderslab.dao;

import pl.coderslab.model.Customer;
import pl.coderslab.model.Employee;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class CustomerDao {

    public static final String ADD_CUSTOMER = "INSERT INTO customers(customer_name, customer_surname) VALUES (?,?)";
    public static final String SELECT_FROM_CUSTOMERS = "select * from customers;";

    public CustomerDao() throws SQLException{

    }

    public List<Customer> loadCustomer(List<Customer> CustomerList) {


        try (Connection connection = DbUtil.getConn()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CUSTOMERS);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String surname = resultSet.getString("customer_surname");

                Customer customer = new Customer(id, name, surname);

                CustomerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return CustomerList;
    }


    public Customer saveCustomer(Customer customer){

        try(Connection connection = DbUtil.getConn()){
            PreparedStatement preparedStatement =
                    connection.prepareStatement(ADD_CUSTOMER);

            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getSurname());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;


    }

}
