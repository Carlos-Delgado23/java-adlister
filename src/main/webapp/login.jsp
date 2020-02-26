<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL Example</title>
</head>
<body>

    <div style="text-align: center;">
        <h4>Login</h4>
            <form action="profile.jsp" method="POST">
                Username <input type="text" name="username" id="username" required><br>
                Password <input type="password" name="password" id="password" required><br>
                <input type="submit" value="Submit">
            </form>
    </div>

</body>
</html>