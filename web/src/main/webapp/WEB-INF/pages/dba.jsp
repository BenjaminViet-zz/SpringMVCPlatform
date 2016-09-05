<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/common/taglibs.jsp"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>DBA page</title>
</head>
<c:url var="logoutUrl" value="/perform_logout" />
<body>
    <form:form action="${logoutUrl}" method="POST">
        Dear <strong>${user}</strong>, Welcome to DBA Page.
        <button type="submit">Logout</button>
    </form:form>
</body>
</html>