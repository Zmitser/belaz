<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
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

                            <li class="breadcrumb-item current">
                                <a href="/category"><spring:message code="app.shopping_cart"/></a>
                            </li><!-- /.breadcrumb-item -->
                        </ul><!-- /.breadcrumb-nav-holder -->
                    </div><!-- .breadcrumb-nav-holder -->
                </div><!-- /.container -->
            </div><!-- /#breadcrumb-alt -->
            <!-- ========================================= BREADCRUMB : END ========================================= -->
        </div>
    </header>
    <!-- ============================================================= HEADER : END ============================================================= -->
    <section id="cart-page">
        <div class="container">
            <!-- ========================================= CONTENT ========================================= -->
            <div class="col-xs-12 col-md-9 items-holder no-margin">
                <c:set value="0" var="s"/>
                <c:choose>
                <c:when test="${sessionScope.cart.size() > 0}">
                <c:forEach var="it" items="${sessionScope.cart}" varStatus="timer">
                    <c:set value="${s + it.quantity * it.miningMachinery.price}" var="s"/>
                    <div class="row no-margin cart-item">
                        <div class="col-xs-12 col-sm-2 no-margin">
                            <a href="#" class="thumb-holder">
                                <img class="lazy" alt="" src="http://placehold.it/73x73"/>
                            </a>
                        </div>

                        <div class="col-xs-12 col-sm-5 ">
                            <div class="title">
                                <a href="<c:url value="/single-product/${it.miningMachinery.id}"/>">${it.miningMachinery.model.name}</a>
                            </div>
                            <div class="brand">${it.miningMachinery.manufacturer.name}</div>
                        </div>

                        <div class="col-xs-12 col-sm-3 no-margin">
                            <div class="quantity">
                                <div class="le-quantity">
                                    <form>
                                        <a class="minus" href="/shopping-cart/reduce/${timer.index}"></a>
                                        <input name="quantity" readonly="readonly" type="text"
                                               value="${it.quantity}"/>
                                        <a class="plus" href="/shopping-cart/add/${timer.index}"></a>
                                    </form>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-12 col-sm-2 no-margin">
                            <div class="price">
                                    ${it.miningMachinery.price} x ${it.quantity}
                                = ${it.quantity * it.miningMachinery.price}
                            </div>
                            <a class="close-btn" href="/shopping-cart/remove/${timer.index}"></a>
                        </div>
                    </div>
                    <!-- /.cart-item -->
                </c:forEach>
            </div>
            <!-- ========================================= SIDEBAR ========================================= -->
            <div class="col-xs-12 col-md-3 no-margin sidebar ">
                <div class="widget cart-summary">
                    <h1 class="border">shopping cart</h1>
                    <div class="body">
                        <ul class="tabled-data no-border inverse-bold">
                            <li>
                                <label>cart subtotal</label>
                                <div class="value pull-right">$${s}</div>
                            </li>
                            <li>
                                <label>shipping</label>
                                <div class="value pull-right">free shipping</div>
                            </li>
                        </ul>
                        <ul id="total-price" class="tabled-data inverse-bold no-border">
                            <li>
                                <label>order total</label>
                                <div class="value pull-right">$${s}</div>
                            </li>
                        </ul>
                        <div class="buttons-holder">
                            <a class="le-button big"
                               href="/order/checkout">checkout</a>
                            <a class="simple-link block"
                               href="http://localhost/~ibrahim/themeforest/HTML/mediacenter/upload/PHP/home">continue
                                shopping</a>
                        </div>
                    </div>
                </div><!-- /.widget -->

                <div id="cupon-widget" class="widget">
                    <h1 class="border">use coupon</h1>
                    <div class="body">
                        <form>
                            <div class="inline-input">
                                <input data-placeholder="enter coupon code" type="text"/>
                                <button class="le-button" type="submit">Apply</button>
                            </div>
                        </form>
                    </div>
                </div><!-- /.widget -->
            </div>
            <!-- /.sidebar -->

            <!-- ========================================= SIDEBAR : END ========================================= -->
            </c:when>


            <c:otherwise>
                <p>Your shopping cart is empty</p>
            </c:otherwise>
            </c:choose>

        </div>
        <!-- ========================================= CONTENT : END ========================================= -->


</div>
</section>
<!-- ============================================================= FOOTER ============================================================= -->
<c:import url="fragments/footer.jsp"/>
<!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>
