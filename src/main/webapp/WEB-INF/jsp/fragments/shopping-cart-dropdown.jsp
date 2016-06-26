<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="${sessionScope.compare}" var="compareList"/>
<div class="col-xs-12 col-sm-12 col-md-3 top-cart-row no-margin">
    <div class="top-cart-row-container">
        <div class="wishlist-compare-holder">
            <div class="compare">
                <a href="/compare/compare-list"><i class="fa fa-exchange"></i><spring:message code="app.compare"/><span
                        class="value">(${compareList.size()})</span> </a>
            </div>
        </div>
        <div class="top-cart-holder dropdown animate-dropdown">
            <div class="basket">
                <ul class="dropdown-menu">
                    <c:set value="0" var="s"/>
                    <c:forEach var="it" items="${sessionScope.cart}" varStatus="timer">
                        <c:set value="${s + it.quantity * it.miningMachinery.price}" var="s"/>
                        <li>
                            <div class="basket-item">
                                <div class="row">
                                    <div class="col-xs-4 col-sm-4 no-margin text-center">
                                        <div class="thumb">
                                            <img alt=""
                                                 src="<c:url value="/resources/assets/images/products/product-small-01.jpg"/>"/>
                                        </div>
                                    </div>
                                    <div class="col-xs-8 col-sm-8 no-margin">
                                        <div class="title">${it.miningMachinery.model.name}</div>
                                        <div class="price">$${it.miningMachinery.price} x ${it.quantity} =
                                            $${it.quantity * it.miningMachinery.price}</div>
                                    </div>
                                </div>
                                <a class="close-btn" href="/shopping-cart/remove/${timer.index}"></a>
                            </div>
                        </li>
                    </c:forEach>

                    <li class="checkout">
                        <div class="basket-item">
                            <div class="row">
                                <div class="col-xs-12 col-sm-6">
                                    <a href="/shopping-cart/orders" class="le-button inverse">View
                                        cart</a>
                                </div>
                                <div class="col-xs-12 col-sm-6">
                                    <a href="checkout.html" class="le-button">Checkout</a>
                                </div>
                            </div>
                        </div>
                    </li>

                </ul>
                <c:set value="${sessionScope.cart}" var="it"/>
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <div class="basket-item-count">
                        <span class="count">${it.size()}</span>
                        <img src="<c:url value="/resources/assets/images/icon-cart.png"/>" alt=""/>
                    </div>

                    <div class="total-price-basket">
                        <span class="lbl">Ваша корзина:</span>
                    <span class="total-price">

                        <span class="sign">$</span><span class="value">${s}</span>
                    </span>
                    </div>
                </a>
            </div><!-- /.basket -->
        </div><!-- /.top-cart-holder -->
    </div>
    <!-- /.top-cart-row-container -->
</div>
<!-- /.top-cart-row -->

