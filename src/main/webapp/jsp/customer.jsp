
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customer</title>
</head>
<body>
    <form action="/customerlaodall" method="post">
        <input type="submit" name="LOAD" value="LOAD ALL CUSTOMER"><br>
    </form>
    <form action="/customer" method="post">
        <input type="submit" name="LOAD" value="LOAD BY ID"><br>
    </form>
    <form action="/jsp/customer_add.jsp">
        <input type="submit" name="ADD" value="ADD NEW CUSTOMER"><br>
    </form>
    <form action="/jsp/customer_edit.jsp">
        <input type="submit" name="edit" value="EDIT CUSTOMER"><br>
    </form>
    <form name="/employeedel" method="post">
        <input type="number" name="delete"><input type="submit" name="delete" value="DELETE"><br>
    </form>
    <form action="/jsp/vehicle_add.jsp" method="post">
        <input type="submit" name="LOAD" value="LOAD VEHICLE"><br>
    </form>


</body>
</html>
