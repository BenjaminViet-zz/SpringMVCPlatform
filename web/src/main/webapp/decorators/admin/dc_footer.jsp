<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="<c:url value="/sc-content/plugins/jquery/jquery-2.2.3.min.js" />"></script>

<script type="text/javascript">
    // if jQuery has not been loaded, load from google cdn
    if (!window.jQuery) {
        var s = document.createElement('script');
        s.setAttribute('src', 'https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js');
        s.setAttribute('type', 'text/javascript');
        document.getElementsByTagName('head')[0].appendChild(s);
    }
</script>

<script src="<c:url value="/themes/bootstrap/js/bootstrap.min.js" />"></script>

<c:choose>
    <c:when test="${instanceType == null || (instanceType != null && instanceType == 'DEV')}">
        <script src="<c:url value="/sc-content/js/AdminLTE.js" />"></script>
        <script src="<c:url value="/sc-content/js/app.js" />"></script>
    </c:when>
    <c:otherwise>
        <%--<script src="<c:url value="/sc-content/js/app.min.js" />"></script>--%>
    </c:otherwise>
</c:choose>