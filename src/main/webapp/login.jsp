<%@ page contentType="text/html;text/css;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="partials/head.jsp" %>
    <title>Login</title>
</head>
<body class="d-flex justify-content-center align-items-center">

    <div class="login-container">
        <div class="p-4">
        <h4 class="text-center pb-3"><i class="far fa-user fa-3x"></i></h4>
            <form action="login.jsp" method="POST" class="">
                <div class="d-flex justify-content-between align-items-center pb-2">
                    <input type="text" name="username" id="username" placeholder="Username"
                           class="text-center username"
                           required><br>
                </div>
                <div class="d-flex justify-content-between align-items-center pb-2">
                    <input type="password" name="password" id="password" placeholder="Password"
                           class="text-center password" required><br>
                </div>
                <div class="d-flex justify-content-center align-items-center pt-1">
                    <input type="submit" value="Enter" class="submit">
                    <i class="fas fa-sign-in-alt pl-1"></i>
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