<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-xs-12 col-sm-12 col-md-3 top-cart-row no-margin">
    <div class="top-cart-row-container">
        <div class="wishlist-compare-holder">
            <div class="wishlist ">
                <a href="#"><i class="fa fa-heart"></i> Избранное <span class="value">(21)</span> </a>
            </div>
            <div class="compare">
                <a href="#"><i class="fa fa-exchange"></i> Сравнить <span class="value">(2)</span> </a>
            </div>
        </div>
        <div class="top-cart-holder dropdown animate-dropdown">
            <div class="basket">

                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <div class="basket-item-count">
                        <span class="count">3</span>
                        <img src="<c:url value="/resources/assets/images/icon-cart.png"/>" alt=""/>
                    </div>

                    <div class="total-price-basket">
                        <span class="lbl">Ваша корзина:</span>
                    <span class="total-price">
                        <span class="sign">$</span><span class="value">3219,00</span>
                    </span>
                    </div>
                </a>

                <ul class="dropdown-menu">
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
                                    <div class="title">Blueberry</div>
                                    <div class="price">$270.00</div>
                                </div>
                            </div>
                            <a class="close-btn" href="#"></a>
                        </div>
                    </li>

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
                                    <div class="title">Blueberry</div>
                                    <div class="price">$270.00</div>
                                </div>
                            </div>
                            <a class="close-btn" href="#"></a>
                        </div>
                    </li>

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
                                    <div class="title">Blueberry</div>
                                    <div class="price">$270.00</div>
                                </div>
                            </div>
                            <a class="close-btn" href="#"></a>
                        </div>
                    </li>


                    <li class="checkout">
                        <div class="basket-item">
                            <div class="row">
                                <div class="col-xs-12 col-sm-6">
                                    <a href="index.php?page=cart" class="le-button inverse">View cart</a>
                                </div>
                                <div class="col-xs-12 col-sm-6">
                                    <a href="checkout.html" class="le-button">Checkout</a>
                                </div>
                            </div>
                        </div>
                    </li>

                </ul>
            </div><!-- /.basket -->
        </div><!-- /.top-cart-holder -->
    </div><!-- /.top-cart-row-container -->
</div>
<!-- /.top-cart-row -->
