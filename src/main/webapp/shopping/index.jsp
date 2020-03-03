<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Kickin Threads</h1>

    <c:forEach var="item" items="${sessionScope.items}">
        <div class="col-md-6">
            <h2>${item.name}</h2>
            <p>${item.price}</p>
        </div>
    </c:forEach>
</div>

</body>
</html>
