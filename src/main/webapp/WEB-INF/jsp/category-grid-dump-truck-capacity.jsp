<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title><spring:message code="app.dump_trucks"/></title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <c:import url="fragments/head.jsp"/>
</head>
<body>
<div class="wrapper">
    <!-- ============================================================= TOP NAVIGATION ============================================================= -->
    <c:import url="fragments/top-navigation.jsp"/>
    <!-- ============================================================= TOP NAVIGATION : END ============================================================= -->
    <!-- ============================================================= HEADER ============================================================= -->
    <header class="no-padding-bottom header-alt">
        <div class="container no-padding">

            <div class="col-xs-12 col-md-3 logo-holder">
                <!-- ============================================================= LOGO ============================================================= -->
                <c:import url="fragments/logo.jsp"/>
                <!-- ============================================================= LOGO : END ============================================================= -->
            </div><!-- /.logo-holder -->

            <div class="col-xs-12 col-md-6 top-search-holder no-margin">
                <div class="contact-row">
                    <div class="phone inline">
                        <i class="fa fa-phone"></i> (+800) 123 456 7890
                    </div>
                    <div class="contact inline">
                        <i class="fa fa-envelope"></i> contact@<span class="le-color">office@belaz.minsk.by</span>
                    </div>
                </div><!-- /.contact-row -->
                <!-- ============================================================= SEARCH AREA ============================================================= -->
                <c:import url="fragments/search-area.jsp"/>
                <!-- ============================================================= SEARCH AREA : END ============================================================= -->
            </div><!-- /.top-search-holder -->

            <!-- ============================================================= SHOPPING CART DROPDOWN ============================================================= -->
            <c:import url="fragments/shopping-cart-dropdown.jsp"/>
            <!-- ============================================================= SHOPPING CART DROPDOWN : END ============================================================= -->

        </div><!-- /.container -->
        <div class="animate-dropdown">
            <!-- ========================================= BREADCRUMB ========================================= -->
            <div id="breadcrumb-alt">
                <div class="container">
                    <div class="breadcrumb-nav-holder minimal">
                        <ul>
                            <li class="dropdown breadcrumb-item">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    shop by department
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="/truck-mining/category"><spring:message code="app.dump_trucks"/></a>
                                    </li>
                                    <li>
                                        <a href="/dump-trucks-capacity/category"><spring:message
                                                code="app.trucks_with_enchanced_capacity"/> </a>
                                    </li>
                                </ul>
                            </li>

                            <li class="breadcrumb-item">
                                <a href="/">Home</a>
                            </li><!-- /.breadcrumb-item -->

                            <li class="breadcrumb-item current">
                                <a href="/category"><spring:message code="app.trucks_with_enchanced_capacity"/></a>
                            </li><!-- /.breadcrumb-item -->
                        </ul><!-- /.breadcrumb-nav-holder -->
                    </div>
                </div><!-- /.container -->
            </div>
            <!-- ========================================= BREADCRUMB : END ========================================= -->
        </div>
    </header>
    <!-- ============================================================= HEADER : END ============================================================= -->
    <section id="category-grid">
        <div class="container">
            <!-- ========================================= SIDEBAR ========================================= -->
            <div class="col-xs-12 col-sm-3 no-margin sidebar narrow">
                <!-- ========================================= PRODUCT FILTER ========================================= -->
                <div class="widget">
                    <h1>Product Filters</h1>
                    <div class="body bordered">
                        <form:form role="form" commandName="filter" id="filter" action="/dump-trucks-capacity/category/filter" method="get">
                            <div class="category-filter">
                                <h2><spring:message code="app.manufacturer"/></h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${manufacturers}" var="manufacturer">
                                        <li><form:checkbox class="le-checkbox"  name="manufacturer"
                                                           value="${manufacturer.id}" path="manufacturer"/> <label>${manufacturer.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2><spring:message code="app.manufacturer_country"/></h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${manufacturerCountries}" var="manufacturerCountry">
                                        <li><form:checkbox class="le-checkbox"  name="manufacturerCountry"
                                                           value="${manufacturerCountry.id}" path="manufacturerCountry"/>
                                            <label>${manufacturerCountry.name}</label> <span class="pull-right"></span>
                                        </li>
                                    </c:forEach>
                                </ul>
                                <!-- /.category-filter -->
                            </div>
                            <div class="category-filter">
                                <h2><spring:message code="app.machine_location"/></h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${machineLocations}" var="machineLocation">
                                        <li><form:checkbox class="le-checkbox"  name="machineLocation"
                                                           value="${machineLocation.id}" path="machineLocation"/>
                                            <label>${machineLocation.name}</label> <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->
                            <div class="category-filter">
                                <h2><spring:message code="app.series"/></h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${serie}" var="serie">
                                        <li><form:checkbox class="le-checkbox"  name="serie"
                                                           value="${serie.id}" path="serie"/> <label>${serie.name}</label> <span
                                                class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2><spring:message code="app.engine"/></h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${engines}" var="engine">
                                        <li><form:checkbox class="le-checkbox"  name="engine"
                                                           value="${engine.id}" path="engine"/> <label>${engine.name}</label> <span
                                                class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2><spring:message code="app.suspension"/></h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${suspensions}" var="suspension">
                                        <li><form:checkbox class="le-checkbox"  name="suspension"
                                                           value="${suspension.id}" path="suspension"/> <label>${suspension.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2><spring:message code="app.transmission"/></h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${transmissions}" var="transmission">
                                        <li><form:checkbox class="le-checkbox"  name="transmission"
                                                           value="${transmission.id}" path="transmission"/> <label>${transmission.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->


                            <div class="category-filter">
                                <h2>Wheel Arrangement</h2>
                                <hr>
                                    <%--<ul class="front-wheels">--%>
                                <ul class="front-wheels">
                                    <c:forEach items="${wheelArrangements}" var="wheelArrangement">
                                        <li><form:checkbox class="le-checkbox"  name="wheelArrangement"
                                                           value="${wheelArrangement.id}" path="wheelArrangement"/> <label>${wheelArrangement.name}</label> <span
                                                class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->
                            <button class="filter-button" type="submit">Filter</button>
                        </form:form>

                    </div><!-- /.body -->
                </div><!-- /.widget -->
                <!-- ========================================= PRODUCT FILTER : END ========================================= -->
            </div>
            <!-- ========================================= SIDEBAR : END ========================================= -->

            <!-- ========================================= CONTENT ========================================= -->

            <div class="col-xs-12 col-sm-9 no-margin wide sidebar">

                <section id="gaming">
                    <div class="grid-list-products">
                        <h2 class="section-title"><spring:message code="app.dump_trucks"/></h2>

                        <div class="control-bar">
                            <div class="grid-list-buttons">
                                <ul>
                                    <li class="grid-list-button-item active"><a data-toggle="tab" href="#grid-view"><i
                                            class="fa fa-th-large"></i> Grid</a></li>
                                    <li class="grid-list-button-item "><a data-toggle="tab" href="#list-view"><i
                                            class="fa fa-th-list"></i> List</a></li>
                                </ul>
                            </div>
                        </div><!-- /.control-bar -->

                        <div class="tab-content">
                            <c:choose>
                                <c:when test="${list.size() > 0}">
                                    <div id="grid-view" class="products-grid fade tab-pane in active">
                                        <div class="product-grid-holder">
                                            <div class="row no-margin grid-no-margin">
                                                <c:forEach items="${list}" var="item">
                                                    <div class="col-xs-12 col-sm-4 no-margin product-item-holder hover">
                                                        <div class="product-item">
                                                            <div class="ribbon red"><span>sale</span></div>
                                                            <div class="image">
                                                                <a href="<c:url value="/dump-trucks-capacity/single-product/${item.id}"/>">
                                                                    <img width="246" height="186" alt="${item.model.name}"
                                                                         src="<c:url value="/resources/assets/images/${item.photos[0].name}"/>">
                                                                </a>
                                                            </div>
                                                            <div class="body">
                                                                <div class="title">
                                                                    <a href="<c:url value="/dump-trucks-capacity/single-product/${item.id}"/>">${item.model.name}</a>
                                                                </div>
                                                                <div class="brand">${item.model.series.name}</div>
                                                            </div>
                                                            <div class="prices">
                                                                <div class="price-current pull-right">$${item.price}</div>
                                                            </div>
                                                            <div class="hover-area">
                                                                <div class="add-cart-button">
                                                                    <a href="<c:url value="/shopping-cart/order-now/${item.id}"/>" class="le-button">add to
                                                                        cart</a>
                                                                </div>
                                                                <div class="wish-compare">
                                                                    <a class="btn-add-to-compare" href="<c:url value="/compare/compare-this/${item.id}"/>"><spring:message code="app.compare"/></a>
                                                                </div>
                                                            </div>
                                                        </div><!-- /.product-item -->
                                                    </div>
                                                    <!-- /.product-item-holder -->
                                                </c:forEach>

                                            </div><!-- /.row -->
                                        </div><!-- /.product-grid-holder -->
                                    </div><!-- /.products-grid #grid-view -->


                                    <div id="list-view" class="products-grid fade tab-pane ">
                                        <div class="products-list list-no-margin">

                                            <c:forEach items="${list}" var="item">
                                                <div class="product-item product-item-holder">
                                                    <div class="ribbon red"><span>sale</span></div>
                                                    <div class="row">
                                                        <div class="no-margin col-xs-12 col-sm-4 image-holder">
                                                            <div class="image">
                                                                <a href="<c:url value="/dump-trucks-capacity/single-product/${item.id}"/>">
                                                                    <img width="246" height="186" alt="${item.model.name}"
                                                                         src="<c:url value="/resources/assets/images/${item.photos[0].name}"/>">
                                                                </a>
                                                            </div>
                                                        </div><!-- /.image-holder -->
                                                        <div class="no-margin col-xs-12 col-sm-5 body-holder">
                                                            <div class="body">
                                                                <div class="title">
                                                                    <a href="<c:url value="/dump-trucks-capacity/single-product/${item.id}"/>">${item.model.name}</a>
                                                                </div>
                                                                <div class="brand">${item.model.series.name}</div>
                                                                <div class="excerpt">
                                                                    <p>${item.application}</p>
                                                                </div>
                                                                <div class="addto-compare">
                                                                    <a class="btn-add-to-compare" href="<c:url value="/compare/compare-this/${item.id}"/>"><spring:message code="app.add_compare"/></a>
                                                                </div>
                                                            </div>
                                                        </div><!-- /.body-holder -->
                                                        <div class="no-margin col-xs-12 col-sm-3 price-area">
                                                            <div class="right-clmn">
                                                                <div class="price-current">$${item.price}</div>
                                                                <a href="<c:url value="/shopping-cart/order-now/${item.id}"/>" class="le-button"><spring:message code="app.add_cart"/></a>
                                                            </div>
                                                        </div><!-- /.price-area -->
                                                    </div><!-- /.row -->
                                                </div>
                                                <!-- /.product-item -->
                                            </c:forEach>
                                        </div><!-- /.products-list -->
                                    </div><!-- /.products-grid #list-view -->
                                </c:when>
                                <c:otherwise>
                                    <p>                   <p>Information not found.
                                    Please change parameters.</p></p>
                                </c:otherwise>
                            </c:choose>


                        </div><!-- /.tab-content -->
                    </div><!-- /.grid-list-products -->

                </section><!-- /#gaming -->
            </div><!-- /.col -->
            <!-- ========================================= CONTENT : END ========================================= -->
        </div><!-- /.container -->
    </section><!-- /#category-grid -->
    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>
