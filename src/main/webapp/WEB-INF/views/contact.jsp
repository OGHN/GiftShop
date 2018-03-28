<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<%--
  Created by IntelliJ IDEA.
  User: O HERNANDEZ
  Date: 28/03/2018
  Time: 01:01 AM
  To change this template use File | Settings | File Templates.
--%>

    <form>
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>
        <div class="form-group">
            <label for="exampleInputFile">File input</label>
            <input type="file" id="exampleInputFile">
            <p class="help-block">Example block-level help text here.</p>
        </div>
        <button type="submit" class="btn btn-default">Email</button>
        <button type="submit" class="btn btn-default">Phone</button>
        <button type="submit" class="btn btn-default">Chat</button>
    </form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>