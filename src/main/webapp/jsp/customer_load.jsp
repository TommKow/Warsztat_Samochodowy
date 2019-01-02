<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer_load</title>
</head>
<body>
<h2>Customers List</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Firstname</th>
        <th>Lastname</th>
    </tr>

    <c:forEach items="${sessionScope.customers}" var="customers">
    <tr>
        <td>${customers.id}</td>
        <td>${customers.name}</td>
        <td>${customers.surname}<button type="button" onclick=""> BACK </button> </td>
    </tr>
    </c:forEach>


</table>
</body>
</html>
