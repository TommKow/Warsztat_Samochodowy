package pl.coderslab.dao;

import pl.coderslab.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {

    public static final String SAVE_TO_DB = "INSERT into employees(employee_name, employee_username," +
            "employee_email, employee_data, employee_phoneNumber, employe_salaryPh) values (?, ?, ?, ?, ?, ?);";
    public static final String LOAD_EMPLOYEE = "select * from employees;";
    public static final String LOAD_BY_ID = "SELECT * FROM employees WHERE employee_id=?;";
    public static final String DELETE_EMPLOYEE = "DELETE FROM users WHERE id=?";
    public static final String UPDATE_EMPLOYEE = "UPDATE employees set employee_name=?, employee_username=?, employee_email=?, " +
            "employee_data=?, employee_phoneNumber=?, employe_salaryPh=? where employee_id=?;";

    public EmployeeDao() throws SQLException {

    }

    public List<Employee> loadEmployee(List<Employee> employeeList) {


        try (Connection connection = DbUtil.getConn()) {
            PreparedStatement preparedStatement = connection.prepareStatement(LOAD_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String surname = resultSet.getString("employee_username");
                String email = resultSet.getString("employee_email");
                String data = resultSet.getString("employee_data");
                int phoneNumber = resultSet.getInt("employee_phoneNumber");
                double salaryPh = resultSet.getDouble("employe_salaryPh");

                Employee employee = new Employee(id, name, surname, email, data, phoneNumber, salaryPh);

                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public Employee loadEmployeeById(int id) {

        try (Connection connection = DbUtil.getConn()) {
            PreparedStatement preparedStatement = connection.prepareStatement(LOAD_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                Employee loadedEmployee = new Employee();
                loadedEmployee.setId(resultSet.getInt("employee_id"));
                loadedEmployee.setName(resultSet.getString("employee_name"));
                loadedEmployee.setSurname(resultSet.getString("employee_username"));
                loadedEmployee.setEmail(resultSet.getString("employee_email"));
                loadedEmployee.setDataEmployee(resultSet.getString("employee_data"));
                loadedEmployee.setPhoneNumber(resultSet.getInt("employee_phoneNumber"));
                loadedEmployee.setSalaryPh(resultSet.getInt("employe_salaryPh"));
                return loadedEmployee;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Employee saveToDb(Employee employee) throws SQLException {

        try (Connection conn = DbUtil.getConn()) {
            if(employee.getId() == 0) {
                String[] generatedColumns = {"ID"};
                PreparedStatement preparedStatement = conn.prepareStatement(SAVE_TO_DB, generatedColumns);

                preparedStatement.setString(1, employee.getName());
                preparedStatement.setString(2, employee.getSurname());
                preparedStatement.setString(3, employee.getEmail());
                preparedStatement.setString(4, employee.getDataEmployee());
                preparedStatement.setInt(5, employee.getPhoneNumber());
                preparedStatement.setDouble(6, employee.getSalaryPh());
                preparedStatement.execute();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if(resultSet.next()) {
                    employee.setId(resultSet.getInt(1));
                }

            }
        } catch (SQLException e) {
        e.printStackTrace();
    }
        return employee;
    }
    public Employee editEmployee(Employee employee) throws SQLException {
        try (Connection conn = DbUtil.getConn()) {
            if (employee.getId() != 0) {

                PreparedStatement prepStat = conn.prepareStatement(UPDATE_EMPLOYEE);

                prepStat.setString(1, employee.getName());
                prepStat.setString(2, employee.getSurname());
                prepStat.setString(3, employee.getEmail());
                prepStat.setString(4, employee.getDataEmployee());
                prepStat.setInt(5, employee.getPhoneNumber());
                prepStat.setDouble(6, employee.getSalaryPh());
                prepStat.setInt(7, employee.getId());
                prepStat.executeUpdate();

            }
        }
        return employee;
    }
    public Employee deleteEmployee(int id) throws SQLException {

        Employee employee = new Employee();
        try (Connection connection = DbUtil.getConn()) {
            if (id != 0) {
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                employee.setId(0);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
