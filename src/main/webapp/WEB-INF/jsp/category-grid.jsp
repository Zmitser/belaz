<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<c:import url="fragments/head.jsp"/>
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
                        <i class="fa fa-envelope"></i> contact@<span class="le-color">oursupport.com</span>
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
                                    <li><a href="#">Computer Cases &amp; Accessories</a></li>
                                    <li><a href="#">CPUs, Processors</a></li>
                                    <li><a href="#">Fans, Heatsinks &amp; Cooling</a></li>
                                    <li><a href="#">Graphics, Video Cards</a></li>
                                    <li><a href="#">Interface, Add-On Cards</a></li>
                                    <li><a href="#">Laptop Replacement Parts</a></li>
                                    <li><a href="#">Memory (RAM)</a></li>
                                    <li><a href="#">Motherboards</a></li>
                                    <li><a href="#">Motherboard &amp; CPU Combos</a></li>
                                    <li><a href="#">Motherboard Components</a></li>
                                </ul>
                            </li>
                            <li class="dropdown breadcrumb-item">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">laptops &amp; computers </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">PDA</a>
                                        <a href="#">accesories</a>
                                        <a href="#">tablets</a>
                                        <a href="#">games</a>
                                        <a href="#">consoles</a>
                                    </li>
                                </ul>
                            </li><!-- /.breadcrumb-item -->

                            <li class="dropdown breadcrumb-item">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Desktop PC </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">PDA</a>
                                        <a href="#">accesories</a>
                                        <a href="#">tablets</a>
                                        <a href="#">games</a>
                                        <a href="#">consoles</a>
                                    </li>
                                </ul>
                            </li><!-- /.breadcrumb-item -->

                            <li class="breadcrumb-item">
                                <a href="#">Gaming</a>
                            </li><!-- /.breadcrumb-item -->

                            <li class="breadcrumb-item current">
                                <a href="#">VAIO Fit Laptop - Windows</a>
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
                        <form:form role="form" id="filter"  method="POST">
                            <div class="category-filter">
                                <h2>Manufacturer</h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${manufacturers}" var="manufacturer">
                                        <li><input class="le-checkbox" type="checkbox" name="manufacturer"
                                                   value="${manufacturer.id}"/> <label>${manufacturer.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Manufacturer Country</h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${manufacturerCountries}" var="manufacturerCountry">
                                        <li><input class="le-checkbox" type="checkbox" name="manufacturerCountry"
                                                   value="${manufacturerCountry.id}"/>
                                            <label>${manufacturerCountry.name}</label> <span class="pull-right"></span>
                                        </li>
                                    </c:forEach>
                                </ul>
                                <!-- /.category-filter -->
                            </div>
                            <div class="category-filter">
                                <h2>Machine Location</h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${machineLocations}" var="machineLocation">
                                        <li><input class="le-checkbox" type="checkbox" name="machineLocation"
                                                   value="${machineLocation.id}"/>
                                            <label>${machineLocation.name}</label> <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->
                            <div class="category-filter">
                                <h2>Series</h2>
                                <hr>
                                <ul>
                                    <c:forEach items="${series}" var="series">
                                        <li><input class="le-checkbox" type="checkbox" name="series"
                                                   value="${series.id}"/> <label>${series.name}</label> <span
                                                class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Engines</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${engines}" var="engine">
                                        <li><input class="le-checkbox" type="checkbox" name="engine"
                                                   value="${engine.id}"/> <label>${engine.name}</label> <span
                                                class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Suspensions</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${suspensions}" var="suspension">
                                        <li><input class="le-checkbox" type="checkbox" name="suspension"
                                                   value="${suspension.id}"/> <label>${suspension.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Transmissions</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${transmissions}" var="transmission">
                                        <li><input class="le-checkbox" type="checkbox" name="transmission"
                                                   value="${transmission.id}"/> <label>${transmission.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Brakes Type</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${brakeTypes}" var="brakeType">
                                        <li><input class="le-checkbox" type="checkbox" name="brakeType"
                                                   value="${brakeType.id}"/> <label>${brakeType.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->
                            <div class="category-filter">
                                <h2>Front Wheels</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${frontWheels}" var="frontWheel">
                                        <li><input class="le-checkbox" type="checkbox" name="frontWheel"
                                                   value="${frontWheel.id}"/> <label>${frontWheel.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Rear Wheels</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${rearWheels}" var="rearWheel">
                                        <li><input class="le-checkbox" type="checkbox" name="rearWheel"
                                                   value="${rearWheel.id}"/> <label>${rearWheel.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Parking Brakes</h2>
                                <hr>
                                <ul class="front-wheels">
                                    <c:forEach items="${parkingBrakes}" var="parkingBrake">
                                        <li><input class="le-checkbox" type="checkbox" name="parkingBrake"
                                                   value="${parkingBrake.id}"/> <label>${parkingBrake.name}</label>
                                            <span class="pull-right"></span></li>
                                    </c:forEach>
                                </ul>
                            </div><!-- /.category-filter -->

                            <div class="category-filter">
                                <h2>Auxiliaries</h2>
                                <hr>
                                <%--<ul class="front-wheels">--%>
                                <ul class="front-wheels">
                                    <c:forEach items="${auxiliaries}" var="auxiliary">
                                        <li><input class="le-checkbox" type="checkbox" name="auxiliary"
                                                   value="${auxiliary.id}"/> <label>${auxiliary.name}</label> <span
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
                        <h2 class="section-title">Dump Trucks</h2>

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
                            <div id="grid-view" class="products-grid fade tab-pane in active">

                                <div class="product-grid-holder">
                                    <div class="row no-margin grid-no-margin">
                                        <c:forEach items="${list}" var="item">
                                            <div class="col-xs-12 col-sm-4 no-margin product-item-holder hover">
                                                <div class="product-item">
                                                    <div class="ribbon red"><span>sale</span></div>
                                                    <div class="image">
                                                        <a href="<c:url value="/single-product/${item.id}"/>">
                                                            <img width="246" height="186" alt="${item.model.name}"
                                                                 src="<c:url value="/resources/assets/images/${item.photo[0].name}"/>">
                                                        </a>
                                                    </div>
                                                    <div class="body">
                                                        <div class="title">
                                                            <a href="<c:url value="/single-product/${item.id}"/>">${item.model.name}</a>
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
                                                            <a class="btn-add-to-wishlist" href="#">Добавить в
                                                                избранные</a>
                                                            <a class="btn-add-to-compare" href="<c:url value="/compare/compare-this/${item.id}"/>">Сравнить</a>
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
                                                        <a href="<c:url value="/single-product/${item.id}"/>">
                                                            <img width="246" height="186" alt="${item.model.name}"
                                                                 src="<c:url value="/resources/assets/images/${item.photo[0].name}"/>">
                                                        </a>
                                                    </div>
                                                </div><!-- /.image-holder -->
                                                <div class="no-margin col-xs-12 col-sm-5 body-holder">
                                                    <div class="body">
                                                        <div class="title">
                                                            <a href="<c:url value="/single-product/${item.id}"/>">${item.model.name}</a>
                                                        </div>
                                                        <div class="brand">${item.model.series.name}</div>
                                                        <div class="excerpt">
                                                            <p>${item.application}</p>
                                                        </div>
                                                        <div class="addto-compare">
                                                            <a class="btn-add-to-compare" href="<c:url value="/compare/compare-this/${item.id}"/>">add to compare
                                                                list</a>
                                                        </div>
                                                    </div>
                                                </div><!-- /.body-holder -->
                                                <div class="no-margin col-xs-12 col-sm-3 price-area">
                                                    <div class="right-clmn">
                                                        <div class="price-current">${item.price}</div>
                                                        <a href="<c:url value="/shopping-cart/order-now/${item.id}"/>" class="le-button">add to
                                                            cart</a>
                                                        <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                                    </div>
                                                </div><!-- /.price-area -->
                                            </div><!-- /.row -->
                                        </div>
                                        <!-- /.product-item -->
                                    </c:forEach>
                                </div><!-- /.products-list -->
                            </div><!-- /.products-grid #list-view -->

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