<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dimka
  Date: 06.05.2016
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <c:import url="fragments/head.jsp"/>
</head>
<body>

<div class="wrapper">


    <!-- ============================================================= TOP NAVIGATION ============================================================= -->
    <c:import url="fragments/top-navigation.jsp"/>
    <!-- ============================================================= TOP NAVIGATION : END ============================================================= -->


    <!-- ============================================================= HEADER ============================================================= -->
    <header>
        <div class="container no-padding">

            <div class="col-xs-12 col-sm-12 col-md-3 logo-holder">
                <!-- ============================================================= LOGO ============================================================= -->
                <c:import url="fragments/logo.jsp"/>
                <!-- ============================================================= LOGO : END ============================================================= -->
            </div><!-- /.logo-holder -->

            <div class="col-xs-12 col-sm-12 col-md-6 top-search-holder no-margin">
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
    </header>
    <!-- ============================================================= HEADER : END ============================================================= -->
    <div id="top-banner-and-menu">
        <div class="container">
            <div class="col-xs-12 col-sm-4 col-md-3 sidemenu-holder">
                <!-- ================================== TOP NAVIGATION ================================== -->
                <c:import url="fragments/side-index-navigation.jsp"/>
                <!-- ================================== TOP NAVIGATION : END ================================== -->
            </div><!-- /.sidemenu-holder -->

            <div class="col-xs-12 col-sm-8 col-md-9 homebanner-holder">
                <!-- ========================================== SECTION – HERO ========================================= -->

                <div id="hero">
                    <div id="owl-main" class="owl-carousel owl-inner-nav owl-ui-sm">

                        <div class="item" style="background-image: url(<c:url
                                value="/resources/assets/images/sliders/slider01.jpg"/>);">
                            <div class="container-fluid">
                                <div class="caption vertical-center text-left">
                                    <div class="big-text fadeInDown-1">
                                        Save up to a<span class="big"><span class="sign">$</span>400</span>
                                    </div>

                                    <div class="excerpt fadeInDown-2">
                                        on selected laptops<br>
                                        & desktop pcs or<br>
                                        smartphones
                                    </div>
                                    <div class="small fadeInDown-2">
                                        terms and conditions apply
                                    </div>
                                    <div class="button-holder fadeInDown-3">
                                        <a href="#" class="big le-button ">shop now</a>
                                    </div>
                                </div><!-- /.caption -->
                            </div><!-- /.container-fluid -->
                        </div><!-- /.item -->

                        <div class="item" style="background-image: url(assets/images/sliders/slider03.jpg);">
                            <div class="container-fluid">
                                <div class="caption vertical-center text-left">
                                    <div class="big-text fadeInDown-1">
                                        Want a<span class="big"><span class="sign">$</span>200</span>Discount?
                                    </div>

                                    <div class="excerpt fadeInDown-2">
                                        on selected <br>desktop pcs<br>
                                    </div>
                                    <div class="small fadeInDown-2">
                                        terms and conditions apply
                                    </div>
                                    <div class="button-holder fadeInDown-3">
                                        <a href="#" class="big le-button ">shop now</a>
                                    </div>
                                </div><!-- /.caption -->
                            </div><!-- /.container-fluid -->
                        </div><!-- /.item -->

                    </div><!-- /.owl-carousel -->
                </div>

                <!-- ========================================= SECTION – HERO : END ========================================= -->
            </div><!-- /.homebanner-holder -->

        </div><!-- /.container -->
    </div><!-- /#top-banner-and-menu -->

    <div id="products-tab" class="wow fadeInUp">
        <div class="container">
            <div class="tab-holder">
                <!-- Nav tabs -->
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#featured" data-toggle="tab">featured</a></li>
                    <li><a href="#new-arrivals" data-toggle="tab">new arrivals</a></li>
                    <li><a href="#top-sales" data-toggle="tab">top sales</a></li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane active" id="featured">
                        <div class="product-grid-holder">
                            <div class="col-sm-4 col-md-3  no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon red"><span>sale</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="<c:url value="/resources/assets/images/products/product-01.jpg"/>"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount green">-50% sale</div>
                                        <div class="title">
                                            <a href="#">VAIO Fit Laptop - Windows 8 SVF14322CXW</a>
                                        </div>
                                        <div class="brand">sony</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>

                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">Добавить в корзину</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon blue"><span>new!</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="<c:url value="/resources/assets/images/products/product-02.jpg"/>"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">White lumia 9001</a>
                                        </div>
                                        <div class="brand">nokia</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">

                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="<c:url value="/resources/assets/images/products/product-03.jpg"/>"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">POV Action Cam</a>
                                        </div>
                                        <div class="brand">sony</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon red"><span>sale</span></div>
                                    <div class="ribbon green"><span>bestseller</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-04.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">Netbook Acer TravelMate
                                                B113-E-10072</a>
                                        </div>
                                        <div class="brand">acer</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="tab-pane" id="new-arrivals">
                        <div class="product-grid-holder">

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon blue"><span>new!</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-02.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">White lumia 9001</a>
                                        </div>
                                        <div class="brand">nokia</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon red"><span>sale</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-01.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount green">-50% sale</div>
                                        <div class="title">
                                            <a href="#">VAIO Fit Laptop - Windows 8 SVF14322CXW</a>
                                        </div>
                                        <div class="brand">sony</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>

                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon red"><span>sale</span></div>
                                    <div class="ribbon green"><span>bestseller</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value="/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-04.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">Netbook Acer TravelMate
                                                B113-E-10072</a>
                                        </div>
                                        <div class="brand">acer</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">

                                    <div class="image">
                                        <img alt="" src="<c:url value ="resources/assets/images/blank.gif "/>"
                                             data-echo="assets/images/products/product-03.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">POV Action Cam</a>
                                        </div>
                                        <div class="brand">sony</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="tab-pane" id="top-sales">
                        <div class="product-grid-holder">

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon red"><span>sale</span></div>
                                    <div class="ribbon green"><span>bestseller</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value = "/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-04.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">Netbook Acer TravelMate
                                                B113-E-10072</a>
                                        </div>
                                        <div class="brand">acer</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">

                                    <div class="image">
                                        <img alt="" src="<c:url value = "/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-03.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">POV Action Cam</a>
                                        </div>
                                        <div class="brand">sony</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon blue"><span>new!</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value = "/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-02.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount clear"></div>
                                        <div class="title">
                                            <a href="#">White lumia 9001</a>
                                        </div>
                                        <div class="brand">nokia</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>
                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-4 col-md-3 no-margin product-item-holder hover">
                                <div class="product-item">
                                    <div class="ribbon red"><span>sale</span></div>
                                    <div class="image">
                                        <img alt="" src="<c:url value = "/resources/assets/images/blank.gif"/>"
                                             data-echo="assets/images/products/product-01.jpg"/>
                                    </div>
                                    <div class="body">
                                        <div class="label-discount green">-50% sale</div>
                                        <div class="title">
                                            <a href="#">VAIO Fit Laptop - Windows 8 SVF14322CXW</a>
                                        </div>
                                        <div class="brand">sony</div>
                                    </div>
                                    <div class="prices">
                                        <div class="price-prev">$1399.00</div>
                                        <div class="price-current pull-right">$1199.00</div>
                                    </div>

                                    <div class="hover-area">
                                        <div class="add-cart-button">
                                            <a href="#" class="le-button">add to cart</a>
                                        </div>
                                        <div class="wish-compare">
                                            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
                                            <a class="btn-add-to-compare" href="#">compare</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ========================================= TOP BRANDS ========================================= -->
    <section id="top-brands" class="wow fadeInUp">
        <div class="container">
            <div class="carousel-holder">

                <div class="title-nav">
                    <h1>Top Brands</h1>
                    <div class="nav-holder">
                        <a href="#prev" data-target="#owl-brands" class="slider-prev btn-prev fa fa-angle-left"></a>
                        <a href="#next" data-target="#owl-brands" class="slider-next btn-next fa fa-angle-right"></a>
                    </div>
                </div><!-- /.title-nav -->

                <div id="owl-brands" class="owl-carousel brands-carousel">

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-01.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-02.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-03.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-04.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-01.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-02.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-03.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                    <div class="carousel-item">
                        <a href="#">
                            <img alt="" src="<c:url value="/resources/assets/images/brands/brand-04.jpg"/>"/>
                        </a>
                    </div><!-- /.carousel-item -->

                </div><!-- /.brands-caresoul -->

            </div><!-- /.carousel-holder -->
        </div><!-- /.container -->
    </section><!-- /#top-brands -->
    <!-- ========================================= TOP BRANDS : END ========================================= -->
    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>

