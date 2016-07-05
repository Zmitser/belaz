<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name='robots' content='all, follow'/>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <title>Great admin</title>
    <link rel="stylesheet" href="<c:url value="/resources/public/css/default.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/blue.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/datePicker.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/wysiwyg.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/fancybox-1.3.1.css"/> " media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/visualize.css"/>" media="screen">
    <script src="<c:url value="/webjars/jquery/2.2.1/jquery.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/public/js/jquery.dimensions.min.js"/>"></script>
    <!-- // Tabs // -->
    <script type="text/javascript" src="<c:url value="/resources/public/js/ui.core.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/public/js/jquery.ui.tabs.min.js"/>"></script>

    <!-- // Table drag and drop rows // -->
    <script type="text/javascript" src="<c:url value="/resources/public/js/tablednd.js"/>"></script>
    <!-- // Date Picker // -->
    <script src="<c:url value="/resources/public/js/date.js"/>"></script>
    <!--[if IE]>
    <script src="/resources/public/js/jquery.bgiframe.js"></script>
    <![endif]-->
    <script src="<c:url value="/resources/public/js/jquery.datePicker.js"/>"></script>

    <!-- // Wysiwyg // -->
    <script src="<c:url value="/resources/public/js/jquery.wysiwyg.js"/>"></script>

    <!-- // Graphs // -->
    <script src="<c:url value="/resources/public/js/excanvas.js"/>"></script>
    <script src="<c:url value="/resources/public/js/jquery.visualize.js"/>"></script>
    <!-- // Fancybox // -->
    <script src="<c:url value="/resources/public/js/jquery.fancybox-1.3.1.js"/>"></script>

    <!-- // File upload // -->
    <script src="<c:url value="/resources/public/js/jquery.filestyle.js"/>"></script>


    <script src="<c:url value="/resources/public/js/init.js"/>"></script>

</head>
<body>
<div id="main">
    <!-- #header -->
    <div id="header">
        <!-- #logo -->
        <div id="logo">
            <a href="index.html" title="Go to Homepage"><span>Great Admin</span></a>
        </div>
        <!-- /#logo -->
        <!-- #user -->
        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <div id="user">
                <h2><sec:authentication property="principal.username"/> <span><sec:authentication
                        property="principal.authorities"/></span></h2>
                <a href="">7 messages</a> - <a href="">settings</a> - <a href="/logout">logout</a>
            </div>
        </sec:authorize>
        <!-- /#user -->
    </div>
    <!-- /header -->
    <!-- #content -->
    <div id="content">

        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <ul>
                <li class="home"><a href="">Homepage</a></li>
                <li><a href="">Category</a></li>
                <li>Page</li>
            </ul>
        </div>
        <!-- /breadcrumbs -->
        <!-- table -->
        <!-- box -->
        <div class="box">
            <div class="headlines">
                <h2><span>Table list</span></h2>
            </div>
            <!-- filter -->
            <div class="filter">
                <input type="text" value="column one" title="column one" class="input"/>
                <input type="text" value="column two" title="column two" class="input"/>
                <input type="text" value="column three" title="column three" class="input"/>
                <input type="submit" value="Use filter" class="submit"/>
            </div>
            <!-- /filter -->

            <!-- table -->
            <table class="tab tab-drag">
                <tr class="top nodrop nodrag">
                    <th>Fullname</th>
                    <th>Lastname</th>
                    <th>Company Name</th>
                    <th>Street Address</th>
                    <th>Town</th>
                    <th>Country</th>
                    <th>Email Address</th>
                    <th>Phone Number</th>
                    <th>Date</th>
                    <th class="action">Action</th>
                </tr>
                <c:choose>
                    <c:when test="${orders.size() > 0}">
                        <c:forEach items="${orders}" var="order">
                            <tr>
                                <td><a href="#">${order.fullname}</a></td>
                                <td>${order.lastname}</td>
                                <td>${order.companyName}</td>
                                <td>${order.streetAddress}</td>
                                <td>${order.town}</td>
                                <td>${order.country}</td>
                                <td>${order.emailAddress}</td>
                                <td>${order.phoneNumber}</td>
                                <td>${order.date}</td>
                                <td class="action">
                                    <a href="/delete/${order.id}" class="ico ico-delete">Delete</a>
                                    <a href="/edit/${order.id}" class="ico ico-edit">Edit</a>
                                    <a href="/dump-trucks-capacity/pdf/${order.id}" class="ico ico-pdf">Pdf</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <tbody>
                        <tr>
                            Order list is empty
                        </tr>
                        </tbody>
                    </c:otherwise>
                </c:choose>


            </table>
            <!-- /table -->

            <!-- /box-action -->
        </div>
        <!-- /box -->
        <!-- /table -->
    </div>
    <!-- /#content -->
    <!-- #sidebar -->
    <c:import url="fragments/admin-sidebar.jsp"/>
    <!-- /#sidebar -->
    <!-- #footer -->
    <div id="footer">
        <p>© 2010 Great Admin | <a href="#main">Top</a></p>
    </div>
    <!-- /#footer -->
</div>
<!-- /#main -->
<script src="<c:url value="/resources/assets/js/dmuploader.min.js"/>"></script>
</body>
</html>