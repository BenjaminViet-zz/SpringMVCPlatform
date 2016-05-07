<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Admin page</title>
</head>
<c:url var="logoutUrl" value="/perform_logout" />
<body>
<form:form action="${logoutUrl}" method="POST">
    Dear <strong>${user.username}</strong>, Welcome to Admin Page.
    <%--<a onclick="logout();">Logout</a>--%>
    <input type="submit"
           class="btn btn-block btn-primary btn-default" value="Log out">
    <br/><a href="/user/newUser.html">Add new user</a>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form:form>

<script type="text/javascript">
    function logout(){
        $('form').submit();
    }
</script>
</body>
</html>