<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<meta http-equiv="Content-Style-Type" content="text/css">--%>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Items" />
    </jsp:include>

</head>
<body id="custom">
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1 class="pl-3">Kickin Threads</h1>

    <div class="row d-flex align-items-center">
    <c:forEach var="item" items="${sessionScope.items}">

            <div class="col-lg-4 col-sm-12 d-flex justify-content-center align-items-stretch">
                <div class="card w-100 text-center m-3">
                    <div class="card-body">
                        <h5 class="card-title">${item.name}</h5>
                        <p class="card-text">${item.priceInCents}</p>
                        <a href="#" class="btn btn-primary">Add to <i class="fas fa-cart-plus"></i></a>
                    </div>
                </div>
            </div>

    </c:forEach>
    </div>
</div>


    <jsp:include page="/partials/scripts.jsp" />

</body>
</html>