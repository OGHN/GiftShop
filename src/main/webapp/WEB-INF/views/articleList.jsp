<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<%--
  Created by IntelliJ IDEA.
  User: O HERNANDEZ
  Date: 25/03/2018
  Time: 02:01 PM
  To change this template use File | Settings | File Templates.
--%>
<link href="<c:url value="/resources/css/shop-item.css" /> " rel="stylesheet">
<div class="container-wrapper">
    <div class="container">
    </div>
    <div class="page-header">
        <h1>All products</h1>
        <p class="lead">Checkout all the products</p>
    </div>
    <table class="table table-responsive table-hover">
        <thead>
        <tr class="bg-success">
            <th>Photo tumb</th>
            <th>Name</th>
            <th>Category</th>
            <th>Shipping info</th>
            <th>Description</th>
            <th>Price</th>
            <th>Reviews</th>
            <th>Code</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${articles}" var="article">
            <tr>
                <td><img src="#" alt="image"/></td>
                <td>${article.articleName}</td>
                <td>${article.articleCategory}</td>
                <td>${article.articleShippingInfo}</td>
                <td>${article.articleDescription}</td>
                <td>${article.articlePrice}</td>
                <td>${article.articleCustomerReview}</td>
                <td>${article.articleCode}</td>
                <!-- get the corresponding id for binding to articleView -->
                <td><a href="<spring:url value="/articleList/viewArticle/${article.articleId}" />"
                ><span class="glyphicon glyphicon-eye-open"></span></a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</table>

<%@include file="/WEB-INF/views/template/footer.jsp" %>


