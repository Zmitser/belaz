<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<nav class="top-bar animate-dropdown">
    <div class="container">
        <div class="col-xs-12 col-sm-6 no-margin">
            <ul>
                <li><a href="/">Главная</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#change-colors">Изменить цвет</a>
                    <ul class="dropdown-menu" role="menu">
                        <li role="presentation"><a role="menuitem" class="changecolor green-text" tabindex="-1" href="#"
                                                   title="Green color">Зеленый</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor blue-text" tabindex="-1" href="#"
                                                   title="Blue color">Синий</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor red-text" tabindex="-1" href="#"
                                                   title="Red color">Красный</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor orange-text" tabindex="-1"
                                                   href="#" title="Orange color">Оранжевый</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor navy-text" tabindex="-1" href="#"
                                                   title="Navy color">Морской</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor dark-green-text" tabindex="-1"
                                                   href="#" title="Darkgreen color">Серый</a></li>
                    </ul>
                </li>
                <sec:authorize access="isAnonymous()">
                    <li><a href="/admin"><spring:message code="app.login"/></a></li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li><a href="/logout">Logout</a></li>
                </sec:authorize>
            </ul>
        </div><!-- /.col -->

        <div class="col-xs-12 col-sm-6 no-margin">
            <ul class="right">
                <sec:authorize access="isAuthenticated()">
                    <li>You are logged in as <b><sec:authentication property="principal.username"/></b></li>
                </sec:authorize>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown"
                       href="#change-language">${pageContext.response.locale}</a>
                    <ul class="dropdown-menu" role="menu">
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=en">English</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="?lang=ru">Русский</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.col -->
    </div><!-- /.container -->
</nav>
<!-- /.top-bar -->
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->
