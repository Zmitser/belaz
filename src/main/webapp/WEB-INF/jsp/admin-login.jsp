<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name='robots' content='all, follow' />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <title>Great admin</title>
    <link rel="stylesheet" href="<c:url value="/resources/public/css/login.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/login-blue.css"/>">
</head>
<body>
<div id="main">
    <div id="content">
        <div id="login">

            <div id="logo"><span>Great Admin</span></div>

            <form method="post" action="/login" id="form-login" class="formBox">
                <fieldset>
                    <div class="form-col">
                        <label for="username" class="lab">Username <span class="warning"></span></label>
                        <input type="text" name="username" class="input" id="username" />
                    </div>
                    <div class="form-col form-col-right">
                        <label for="password" class="lab">Password <span class="warning"></span></label>
                        <input type="password" name="password" class="input" id="password" />
                    </div>
                    <div class="form-col form-col-check">
                        <a href="/" id="link-guest">Use this site as guest</a>
                    </div>
                    <div class="form-col form-col-right">
                        <input type="submit" name="" value="Login" class="submit" />
                    </div>
                </fieldset>
            </form>
        </div>
    </div><!-- /content -->
</div><!-- /main -->
</body>
</html>
