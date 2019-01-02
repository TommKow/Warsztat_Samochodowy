
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>vehicle_add</title>
</head>
<body>
    <form action="/vehicleadd" method="post">
        Car model:    <input name="carModel" type="text"><br>
        Car brand: <input name="carBrand" type="text"><br>
        Production Year: <input name="yearOfProd" type="text"><br>
        Registr Number: <input name="regNumber" type="number"><br>
        Tech Reviev: <input name="dateOfTech" type="text"><br>
        <input name="submit" type="submit" value="ADD">

    </form>
</body>
</html>
