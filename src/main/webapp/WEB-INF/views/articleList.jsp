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
<%--<link href="<c:url value="/resources/css/shop-item.css" /> " rel="stylesheet">--%>

<div class="container-wrapper">
<div class="container">
    </div>
    <div class="page-header">
        <h1>All products</h1>
        <p class="lead">Checkout all the products</p>
    </div>
    <!--<table class="table table-responsive table-hover">-->

    <!-- search function-->
    <form class="form-inline">
        <div class="form-group">
            <label>Search</label>
            <input type="text" ng-model="search" class="form-control" placeholder="Search">
        </div>
    </form>

    <%--<table ng-table="ngTableTutorial" class="table table-striped" ng-controller="tableController">--%>
    <table class="table table-striped table-hover">
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
        <tbody>
        <c:forEach items="${articles}" var="article">
            <tr>
                <td at-implicit at-sortable at-attribute="Photo tumb" width="150" at-initial-sorting="asc"><img
                        src="#"
                        alt="image"/>
                </td>
                <td at-implicit at-sortable at-attribute=="Name" width="250">${article.articleName}</td>
                <td at-implicit at-sortable at-attribute="Category">${article.articleCategory}</td>
                <td at-implicit at-sortable at-attribute="Shipping info">${article.articleShippingInfo}</td>
                <td at-implicit at-sortable at-attribute="Description">${article.articleDescription}</td>
                <td at-implicit at-sortable at-attribute="Price">${article.articlePrice}</td>
                <td at-implicit at-sortable at-attribute="Reviews">${article.articleCustomerReview}</td>
                <td at-implicit at-sortable at-attribute=="Code">${article.articleCode}</td>
                <!-- get the corresponding id for binding to articleView -->
                <td><a href="<spring:url value="/articleList/viewArticle/${article.id}" />"
                ><span class="glyphicon glyphicon-eye-open"></span></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <at-pagination at-list="list" at-config="config"></at-pagination>
    </div>

    <script>

    </script>


</div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>



