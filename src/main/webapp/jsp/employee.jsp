<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employee</title>
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
    <form name="/employee" method="post">
        Load employee by ID : <input type="number" name="id"><input type="submit" name="LOAD" value="LOAD"><br>
    </form>
    <form action="/jsp/employee_add.jsp">
                              <input type="submit" name="ADD" value="ADD NEW EMPLOYEE"><br>
    </form>
    <form action="/jsp/employee_edit.jsp">
                              <input type="submit" name="edit" value="EDIT EMPLOYEE"><br>
    </form>
    <form name="/employeedel" method="post">
        Delete employee     : <input type="number" name="delete"><input type="submit" name="delete" value="DELETE"><br>
    </form>
        Employee orders     : <input type="number" name="order"><input type="submit" name="orders" value="ORDERS"><br>


    <h2>Employees List</h2>

        <table>
            <tr>
                <th>ID</th>
                <th>Firstname</th>
                <th>Lastname</th>
                <%--<th>E-mail</th>--%>
                <%--<th>Data</th>--%>
                <%--<th>Phone number</th>--%>
                <%--<th>Salary Ph</th>--%>
            </tr>

            <c:forEach items="${sessionScope.employee}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.surname}</td>
                <%--<td>${employee.email}</td>--%>
                <%--<td>${employee.dataEmployee}</td>--%>
                <%--<td>${employee.phoneNumber}</td>--%>
                <%--<td>${employee.salaryPh}</td>--%>
            </c:forEach>

        </table>
</body>
</html>


