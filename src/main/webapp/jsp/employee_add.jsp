
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employee_add</title>
</head>
<body>
        <form action="/employeeadd" method="post">
            Name:    <input name="name" type="text"><br>
            Surname: <input name="surname" type="text"><br>
            Email:   <input name="email" type="text"><br>
            Data:    <input name="dataEmployee" type="text"><br>
            Phone Number : <input name="phoneNumberS" type="text"><br>
            Salary PH : <input name="salaryPhS" type="text"><br>
            <input name="submit" type="submit" value="ADD">

        </form>
</body>
</html>
