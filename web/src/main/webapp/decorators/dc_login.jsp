<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html>
<head>
    <title><decorator:title default="SiteMesh Integration"/></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <decorator:head/>
</head>
<body>

<div id="content">
    <decorator:body/>
</div>

</body>
</html>