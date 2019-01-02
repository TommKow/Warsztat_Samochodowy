<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employee_view</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }
        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
            background-color: lightblue;
        }

    </style>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>E-mail</th>
            <th>Data</th>
            <th>Phone number</th>
            <th>Salary Ph</th>
        </tr>

        <tr>
            <td>${employeeById.id}</td>
            <td>${employeeById.name}</td>
            <td>${employeeById.surname}</td>
            <td>${employeeById.email}</td>
            <td>${employeeById.dataEmployee}</td>
            <td>${employeeById.phoneNumber}</td>
            <td>${employeeById.salaryPh}</td>
        </tr>

    </table>
<form name="/employee.jsp">
    <input type="submit" name="back" value="BACK">
</form>

</body>
</html>
