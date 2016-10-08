<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html>
    <head>
        <title><decorator:title default="Admin Page"/></title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8"/>

        <link rel="stylesheet" href="<c:url value="/themes/bootstrap/css/bootstrap.min.css" />">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">

        <c:choose>
            <c:when test="${instanceType == null || (instanceType != null && instanceType == 'DEV')}">
                <link rel="stylesheet" type="text/css" href="<c:url value="/dist/dev/css/adminstyle.css" />" />
            </c:when>
            <c:otherwise>
                <link rel="stylesheet" type="text/css" href="<c:url value="/dist/pro/css/adminstyle.min.css" />" />
            </c:otherwise>
        </c:choose>

        <link rel="stylesheet" href="<c:url value="/themes/bootstrap/css/AdminLTE.min.css" />">
        <link rel="stylesheet" href="<c:url value="/themes/bootstrap/css/skins/skin-blue.min.css" />">
    </head>

    <decorator:head />

    <body <decorator:getProperty property="body.id" writeEntireProperty="true"/><decorator:getProperty property="body.class"
                                                                                                       writeEntireProperty="true"/>>
        <jsp:include page="dc_header.jsp" />

        <div id="content">
            <decorator:body/>
        </div>

        <jsp:include page="dc_footer.jsp" />
    </body>
</html>