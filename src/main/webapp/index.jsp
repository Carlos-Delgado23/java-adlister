<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
=======
<%@ page contentType="text/html;text/css;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="partials/head.jsp" %>

    <title>Index</title>
</head>
<body>




<%@ include file="partials/scripts.jsp" %>
</body>
</html>
>>>>>>> 0ab36395e56ff83dbe9b79c7d3b141fcd0dc5ca2
