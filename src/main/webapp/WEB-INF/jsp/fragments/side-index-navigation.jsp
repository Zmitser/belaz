<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="side-menu animate-dropdown">
    <div class="head"><i class="fa fa-list"></i> Все категории</div>
    <nav class="yamm megamenu-horizontal" role="navigation">
        <ul class="nav">
            <li>
                <a href="/truck-mining/category"><spring:message code="app.dump_trucks"/></a>
            </li>
            <li>
                <a href="/dump-trucks-capacity/category"><spring:message
                        code="app.trucks_with_enchanced_capacity"/> </a>
            </li>
        </ul><!-- /.nav -->
    </nav><!-- /.megamenu-horizontal -->
</div>
<!-- /.side-menu -->
