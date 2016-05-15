<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dimka
  Date: 06.05.2016
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<c:import url="fragments/head.jsp"/>
<body>

<div class="wrapper">
    <c:set var="item" value="${item}" scope="session"/>

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
                            </li><!-- /.breadcrumb-item -->

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
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">desktop PC </a>
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
                                <a href="#">gaming</a>
                            </li><!-- /.breadcrumb-item -->

                            <li class="breadcrumb-item current">
                                <a href="#">VAIO Fit Laptop - Windows</a>
                            </li><!-- /.breadcrumb-item -->
                        </ul><!-- /.breadcrumb-nav-holder -->
                    </div>
                </div><!-- /.container -->
            </div><!-- /#breadcrumb-alt -->
            <!-- ========================================= BREADCRUMB : END ========================================= -->
        </div>
    </header>
    <!-- ============================================================= HEADER : END ============================================================= -->
    <div id="single-product">
        <div class="container">

            <div class="no-margin col-xs-12 col-sm-6 col-md-5 gallery-holder">
                <div class="product-item-holder size-big single-product-gallery small-gallery">

                    <div id="owl-single-product">
                        <c:forEach items="${item.photo}" var="photo" varStatus="loop">
                            <div class="single-product-gallery-item" id="slide${loop.index}">
                                <a data-rel="prettyphoto" href="<c:url value="${photo.path}"/> ">
                                    <img class="img-responsive" alt="" src="<c:url value="${photo.path}"/>"/>
                                </a>
                            </div>
                            <!-- /.single-product-gallery-item -->
                        </c:forEach>
                    </div><!-- /.single-product-slider -->


                    <div class="single-product-gallery-thumbs gallery-thumbs">

                        <div id="owl-single-product-thumbnails">
                            <c:forEach items="${item.photo}" var="photo" varStatus="loop">
                                <a class="horizontal-thumb active" data-target="#owl-single-product" data-slide="${loop.index}"
                                   href="#slide${loop.index}">
                                    <img width="67" alt="" src="<c:url value="${photo.path}"/>"/>
                                </a>
                            </c:forEach>
                        </div><!-- /#owl-single-product-thumbnails -->

                        <div class="nav-holder left hidden-xs">
                            <a class="prev-btn slider-prev" data-target="#owl-single-product-thumbnails"
                               href="#prev"></a>
                        </div><!-- /.nav-holder -->

                        <div class="nav-holder right hidden-xs">
                            <a class="next-btn slider-next" data-target="#owl-single-product-thumbnails"
                               href="#next"></a>
                        </div><!-- /.nav-holder -->

                    </div><!-- /.gallery-thumbs -->

                </div><!-- /.single-product-gallery -->
            </div><!-- /.gallery-holder -->
            <div class="no-margin col-xs-12 col-sm-7 body-holder">
                <div class="body">
                    <div class="star-holder inline">
                        <div class="star" data-score="4"></div>
                    </div>
                    <div class="availability"><label>Availability:</label><span class="available">  in stock</span>
                    </div>

                    <div class="title"><a href="#">${item.model.name}</a></div>
                    <div class="brand">${item.model.series.name}</div>

                    <div class="social-row">
                        <span class="st_facebook_hcount"></span>
                        <span class="st_twitter_hcount"></span>
                        <span class="st_pinterest_hcount"></span>
                    </div>

                    <div class="buttons-holder">
                        <a class="btn-add-to-wishlist" href="#">Добавить в избранные</a>
                        <a class="btn-add-to-compare" href="#">Добавить для сравнения</a>
                    </div>

                    <div class="excerpt">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ornare turpis non risus
                            semper dapibus. Quisque eu vehicula turpis. Donec sodales lacinia eros, sit amet auctor
                            tellus volutpat non.</p>
                    </div>

                    <div class="prices">
                        <div class="price-current">$1740.00</div>
                        <div class="price-prev">$2199.00</div>
                    </div>

                    <div class="qnt-holder">
                        <div class="le-quantity">
                            <form>
                                <a class="minus" href="#reduce"></a>
                                <input name="quantity" readonly="readonly" type="text" value="1"/>
                                <a class="plus" href="#add"></a>
                            </form>
                        </div>
                        <a id="addto-cart" href="cart.html" class="le-button huge">add to cart</a>
                    </div><!-- /.qnt-holder -->
                </div><!-- /.body -->

            </div><!-- /.body-holder -->
        </div><!-- /.container -->
    </div><!-- /.single-product -->

    <!-- ========================================= SINGLE PRODUCT TAB ========================================= -->
    <section id="single-product-tab">
        <div class="container">
            <div class="tab-holder">

                <ul class="nav nav-tabs simple">
                    <li class="active"><a href="#description" data-toggle="tab">Description</a></li>
                    <li><a href="#additional-info" data-toggle="tab">Additional Information</a></li>
                    <li><a href="#reviews" data-toggle="tab">Reviews (3)</a></li>
                </ul><!-- /.nav-tabs -->

                <div class="tab-content">
                    <div class="tab-pane active" id="description">
                        <p>${item.application}</p>
                    </div><!-- /.tab-pane #description -->

                    <div class="tab-pane" id="additional-info">
                        <ul class="tabled-data">
                            <li>
                                <label>Мощность</label>
                                <div class="value">${item.power} кВт</div>
                            </li>

                            <li>
                                <label>Грузоподъемность</label>
                                <div class="value">${item.payloadCapacity} т</div>
                            </li>

                            <li>
                                <label>Расход топлива</label>
                                <div class="value">${item.fuelRate} г/кВт*ч</div>
                            </li>
                            <li>
                                <label>Момент</label>
                                <div class="value">${item.torque} Н*м</div>
                            </li>
                            <li>
                                <label>Радиус поворота</label>
                                <div class="value">${item.turningRadius} м</div>
                            </li>

                            <li>
                                <label>Длина</label>
                                <div class="value">${item.length} м</div>
                            </li>
                            <li>
                                <label>Ширина</label>
                                <div class="value">${item.width} м</div>
                            </li>
                            <li>
                                <label>Высота</label>
                                <div class="value">${item.height} м</div>
                            </li>

                            <li>
                                <label>Эксплуатационная масса</label>
                                <div class="value">${item.operationalWeight} кг</div>
                            </li>


                            <li>
                                <label>Полная масса</label>
                                <div class="value">${item.grossWeight} кг</div>
                            </li>

                            <li>
                                <label>Максимальная скорость</label>
                                <div class="value">${item.maxSpeed} км/ч</div>
                            </li>

                            <li>
                                <label>Трансмиссия</label>
                                <div class="value">${item.transmission.name}</div>
                            </li>

                            <li>
                                <label>Двигатель</label>
                                <div class="value">${item.engine.name}</div>
                            </li>

                            <li>
                                <label>Эксплуатационная масса</label>
                                <div class="value">${item.operationalWeight} кг</div>
                            </li>

                            <li>
                                <label>Подвеска</label>
                                <div class="value">${item.suspension.name}</div>
                            </li>

                            <li>
                                <label>Тормоза</label>
                                <div class="value">${item.brakes.type}</div>
                            </li>

                            <li>
                                <label>передних колес</label>
                                <div class="value">${item.brakes.frontWheels}</div>
                            </li>


                            <li>
                                <label>задних колес</label>
                                <div class="value">${item.brakes.rearWheels}</div>
                            </li>


                            <li>
                                <label>стояночный</label>
                                <div class="value">${item.brakes.parkingBrake}</div>
                            </li>


                            <li>
                                <label>вспомогательный</label>
                                <div class="value">${item.brakes.auxiliary}</div>
                            </li>

                        </ul><!-- /.tabled-data -->
                    </div><!-- /.tab-pane #additional-info -->


                    <div class="tab-pane" id="reviews">
                        <div class="comments">
                            <div class="comment-item">
                                <div class="row no-margin">
                                    <div class="col-lg-1 col-xs-12 col-sm-2 no-margin">
                                        <div class="avatar">
                                            <img alt="avatar" src="assets/images/default-avatar.jpg">
                                        </div><!-- /.avatar -->
                                    </div><!-- /.col -->

                                    <div class="col-xs-12 col-lg-11 col-sm-10 no-margin">
                                        <div class="comment-body">
                                            <div class="meta-info">
                                                <div class="author inline">
                                                    <a href="#" class="bold">John Smith</a>
                                                </div>
                                                <div class="star-holder inline">
                                                    <div class="star" data-score="4"></div>
                                                </div>
                                                <div class="date inline pull-right">
                                                    12.07.2013
                                                </div>
                                            </div><!-- /.meta-info -->
                                            <p class="comment-text">
                                                Integer id purus ultricies nunc tincidunt congue vitae nec felis.
                                                Vivamus sit amet nisl convallis, faucibus risus in, suscipit sapien.
                                                Vestibulum egestas interdum tellus id venenatis.
                                            </p><!-- /.comment-text -->
                                        </div><!-- /.comment-body -->

                                    </div><!-- /.col -->

                                </div><!-- /.row -->
                            </div><!-- /.comment-item -->

                            <div class="comment-item">
                                <div class="row no-margin">
                                    <div class="col-lg-1 col-xs-12 col-sm-2 no-margin">
                                        <div class="avatar">
                                            <img alt="avatar" src="assets/images/default-avatar.jpg">
                                        </div><!-- /.avatar -->
                                    </div><!-- /.col -->

                                    <div class="col-xs-12 col-lg-11 col-sm-10 no-margin">
                                        <div class="comment-body">
                                            <div class="meta-info">
                                                <div class="author inline">
                                                    <a href="#" class="bold">Jane Smith</a>
                                                </div>
                                                <div class="star-holder inline">
                                                    <div class="star" data-score="5"></div>
                                                </div>
                                                <div class="date inline pull-right">
                                                    12.07.2013
                                                </div>
                                            </div><!-- /.meta-info -->
                                            <p class="comment-text">
                                                Integer id purus ultricies nunc tincidunt congue vitae nec felis.
                                                Vivamus sit amet nisl convallis, faucibus risus in, suscipit sapien.
                                                Vestibulum egestas interdum tellus id venenatis.
                                            </p><!-- /.comment-text -->
                                        </div><!-- /.comment-body -->

                                    </div><!-- /.col -->

                                </div><!-- /.row -->
                            </div><!-- /.comment-item -->

                            <div class="comment-item">
                                <div class="row no-margin">
                                    <div class="col-lg-1 col-xs-12 col-sm-2 no-margin">
                                        <div class="avatar">
                                            <img alt="avatar" src="assets/images/default-avatar.jpg">
                                        </div><!-- /.avatar -->
                                    </div><!-- /.col -->

                                    <div class="col-xs-12 col-lg-11 col-sm-10 no-margin">
                                        <div class="comment-body">
                                            <div class="meta-info">
                                                <div class="author inline">
                                                    <a href="#" class="bold">John Doe</a>
                                                </div>
                                                <div class="star-holder inline">
                                                    <div class="star" data-score="3"></div>
                                                </div>
                                                <div class="date inline pull-right">
                                                    12.07.2013
                                                </div>
                                            </div><!-- /.meta-info -->
                                            <p class="comment-text">
                                                Integer id purus ultricies nunc tincidunt congue vitae nec felis.
                                                Vivamus sit amet nisl convallis, faucibus risus in, suscipit sapien.
                                                Vestibulum egestas interdum tellus id venenatis.
                                            </p><!-- /.comment-text -->
                                        </div><!-- /.comment-body -->

                                    </div><!-- /.col -->

                                </div><!-- /.row -->
                            </div><!-- /.comment-item -->
                        </div><!-- /.comments -->

                        <div class="add-review row">
                            <div class="col-sm-8 col-xs-12">
                                <div class="new-review-form">
                                    <h2>Add review</h2>
                                    <form id="contact-form" class="contact-form" method="post">
                                        <div class="row field-row">
                                            <div class="col-xs-12 col-sm-6">
                                                <label>name*</label>
                                                <input class="le-input">
                                            </div>
                                            <div class="col-xs-12 col-sm-6">
                                                <label>email*</label>
                                                <input class="le-input">
                                            </div>
                                        </div><!-- /.field-row -->

                                        <div class="field-row star-row">
                                            <label>your rating</label>
                                            <div class="star-holder">
                                                <div class="star big" data-score="0"></div>
                                            </div>
                                        </div><!-- /.field-row -->

                                        <div class="field-row">
                                            <label>your review</label>
                                            <textarea rows="8" class="le-input"></textarea>
                                        </div><!-- /.field-row -->

                                        <div class="buttons-holder">
                                            <button type="submit" class="le-button huge">submit</button>
                                        </div><!-- /.buttons-holder -->
                                    </form><!-- /.contact-form -->
                                </div><!-- /.new-review-form -->
                            </div><!-- /.col -->
                        </div><!-- /.add-review -->

                    </div><!-- /.tab-pane #reviews -->
                </div><!-- /.tab-content -->

            </div><!-- /.tab-holder -->
        </div><!-- /.container -->
    </section><!-- /#single-product-tab -->
    <!-- ========================================= SINGLE PRODUCT TAB : END ========================================= -->
    <!-- ========================================= RECENTLY VIEWED ========================================= -->
    <section id="recently-reviewd" class="wow fadeInUp">
        <div class="container">
            <div class="carousel-holder hover">

                <div class="title-nav">
                    <h2 class="h1">Recently Viewed</h2>
                    <div class="nav-holder">
                        <a href="#prev" data-target="#owl-recently-viewed"
                           class="slider-prev btn-prev fa fa-angle-left"></a>
                        <a href="#next" data-target="#owl-recently-viewed"
                           class="slider-next btn-next fa fa-angle-right"></a>
                    </div>
                </div><!-- /.title-nav -->

                <div id="owl-recently-viewed" class="owl-carousel product-grid-holder">
                    <div class="no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon red"><span>sale</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-11.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">LC-70UD1U 70" class aquos 4K ultra HD</a>
                                </div>
                                <div class="brand">Sharp</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to Cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class="no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon blue"><span>new!</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-12.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">cinemizer OLED 3D virtual reality TV Video</a>
                                </div>
                                <div class="brand">zeiss</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">

                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-13.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">s2340T23" full HD multi-Touch Monitor</a>
                                </div>
                                <div class="brand">dell</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon blue"><span>new!</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-14.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">kardon BDS 7772/120 integrated 3D</a>
                                </div>
                                <div class="brand">harman</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon green"><span>bestseller</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-15.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">netbook acer travel B113-E-10072</a>
                                </div>
                                <div class="brand">acer</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">

                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-16.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">iPod touch 5th generation,64GB, blue</a>
                                </div>
                                <div class="brand">apple</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">

                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-13.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">s2340T23" full HD multi-Touch Monitor</a>
                                </div>
                                <div class="brand">dell</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->

                    <div class=" no-margin carousel-item product-item-holder size-small hover">
                        <div class="product-item">
                            <div class="ribbon blue"><span>new!</span></div>
                            <div class="image">
                                <img alt="" src="assets/images/blank.gif"
                                     data-echo="assets/images/products/product-14.jpg"/>
                            </div>
                            <div class="body">
                                <div class="title">
                                    <a href="single-product.html">kardon BDS 7772/120 integrated 3D</a>
                                </div>
                                <div class="brand">harman</div>
                            </div>
                            <div class="prices">
                                <div class="price-current text-right">$1199.00</div>
                            </div>
                            <div class="hover-area">
                                <div class="add-cart-button">
                                    <a href="single-product.html" class="le-button">Add to cart</a>
                                </div>
                                <div class="wish-compare">
                                    <a class="btn-add-to-wishlist" href="#">Add to Wishlist</a>
                                    <a class="btn-add-to-compare" href="#">Compare</a>
                                </div>
                            </div>
                        </div><!-- /.product-item -->
                    </div><!-- /.product-item-holder -->
                </div><!-- /#recently-carousel -->

            </div><!-- /.carousel-holder -->
        </div><!-- /.container -->
    </section><!-- /#recently-reviewd -->
    <!-- ========================================= RECENTLY VIEWED : END ========================================= -->
    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>