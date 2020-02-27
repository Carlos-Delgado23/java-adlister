<%@ page contentType="text/html;text/css;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="partials/head.jsp" %>
    <link rel="stylesheet" href="./css/custom.css" type="text/css">
    <title>Login</title>
</head>
<body class="d-flex justify-content-center align-items-center">

    <div class="login-container">
        <div class="p-4">
        <h4 class="text-center pb-4"><i class="far fa-user fa-3x"></i></h4>
            <form action="login.jsp" method="POST" class="">
                <div class="d-flex justify-content-between align-items-center pb-2">
                    <label for="username" class="pr-1"></label>
                    <input type="text" name="username" id="username" placeholder="Username" class="text-center"
                           required><br>
                </div>
                <div class="d-flex justify-content-between align-items-center pb-2">
                    <label for="password" class="pr-1"></label>
                    <input type="password" name="password" id="password" placeholder="Password" class="text-center" required><br>
                </div>
                <div class="d-flex justify-content-center align-items-center pt-2">
                    <input type="submit" value="Submit">
                </div>
            </form>
        </div>
    </div>

    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null){
            if (username.equals("admin") && password.equals("password")){
                response.sendRedirect("/profile.jsp?username="+username);
            } else {
                response.sendRedirect("/login.jsp");
            }
        }
    %>


<%@ include file="partials/scripts.jsp" %>
</body>
</html>