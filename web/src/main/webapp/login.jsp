<%@ include file="/common/taglibs.jsp"%>
<html>
    <head>
        <title>Login page</title>
        <link rel="stylesheet" type="text/css" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />

        <c:choose>
            <c:when test="${instanceType == null || (instanceType != null && instanceType == 'DEV')}">
                <link rel="stylesheet" type="text/css" href="<c:url value="/sc-content/css/dev/adminstyle.css" />" />
            </c:when>
            <c:otherwise>
                <link rel="stylesheet" type="text/css" href="<c:url value="/sc-content/css/pro/adminstyle.min.css" />" />
            </c:otherwise>
        </c:choose>
    </head>

    <body>
        <div id="wrapper">
            <div class="login-card">
                <div class="login-form">
                    <form action="/perform_login" method="post" class="form-horizontal">
                        <c:if test="${param.error != null}">
                            <div class="alert alert-danger">
                                <p>Invalid username and password.</p>
                            </div>
                        </c:if>
                        <c:if test="${param.logout != null}">
                            <div class="alert alert-success">
                                <p>You have been logged out successfully.</p>
                            </div>
                        </c:if>
                        <div class="input-group input-sm">
                            <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
                        </div>
                        <div class="input-group input-sm">
                            <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
                        </div>
                        <div class="input-group input-sm">
                            <div>
                                <img id="captcha_id" name="imgCaptcha" src="captcha.jpg">
                            </div>
                        </div>
                        <div class="input-group input-sm">
                            <input type="text" class="form-control input-border" name="captcha_response" placeholder="Your captcha response" required />
                        </div>
                        <div class="input-group input-sm">
                            <div class="checkbox">
                                <label><input type="checkbox" id="rememberme" name="remember-me"> Remember Me</label>
                            </div>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                        <div class="form-actions">
                            <input type="submit"
                                   class="btn btn-block btn-primary btn-default" value="Log in">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>