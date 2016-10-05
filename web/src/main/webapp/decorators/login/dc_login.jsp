<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html>
    <head>
        <title><decorator:title default="Login Page"/></title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8"/>

    </head>
    <decorator:head />

    <body>
        <div id="login-container">
            <decorator:body/>
        </div>
    </body>
</html>