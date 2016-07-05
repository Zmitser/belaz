<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dimka
  Date: 06.05.2016
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<c:set var="item" value="${item}" scope="session"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>${item.model.name}</title>
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
                                <a href="/category"><spring:message code="app.dump_trucks"/></a>
                            </li><!-- /.breadcrumb-item -->

                            <li class="breadcrumb-item current">
                                <a href="#">${item.model.name}</a>
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
                        <c:forEach items="${item.photos}" var="photo" varStatus="loop">
                            <div class="single-product-gallery-item" id="slide${loop.index}">
                                <a data-rel="prettyphoto"
                                   href="<c:url value="/resources/assets/images/${photo.name}"/>">
                                    <img class="img-responsive" alt=""
                                         src="<c:url value="/resources/assets/images/${photo.name}"/>"/>
                                </a>
                            </div>
                            <!-- /.single-product-gallery-item -->
                        </c:forEach>
                    </div><!-- /.single-product-slider -->


                    <div class="single-product-gallery-thumbs gallery-thumbs">

                        <div id="owl-single-product-thumbnails">
                            <c:forEach items="${item.photos}" var="photo" varStatus="loop">
                                <a class="horizontal-thumb active" data-target="#owl-single-product"
                                   data-slide="${loop.index}"
                                   href="#slide${loop.index}">
                                    <img width="67" alt=""
                                         src="<c:url value="/resources/assets/images/${photo.name}"/>"/>
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


                    <div class="title"><a href="#">${item.model.name}</a></div>
                    <div class="brand">${item.model.series.name}</div>

                    <div class="social-row">
                        <span class="st_facebook_hcount"></span>
                        <span class="st_twitter_hcount"></span>
                        <span class="st_pinterest_hcount"></span>
                    </div>

                    <div class="buttons-holder">
                        <a class="btn-add-to-compare" href="#"><spring:message code="app.add_compare"/></a>
                    </div>

                    <div class="excerpt">
                        <p>${item.application}</p>
                    </div>

                    <div class="prices">
                        <div class="price-current">$${item.price}</div>
                    </div>

                    <div class="qnt-holder">
                        <a id="addto-cart" href="<c:url value="/shopping-cart/order-now/${item.id}"/>"
                           class="le-button huge"><spring:message code="app.add_cart"/></a>
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
                    <li><a href="#advantages" data-toggle="tab">Advatages</a></li>
                    <li><a href="#complete-set" data-toggle="tab">Complete Set</a></li>
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
                                <div class="value">${item.brakeType.name}</div>
                            </li>

                            <li>
                                <label>передних колес</label>
                                <div class="value">${item.frontWheels.name}</div>
                            </li>


                            <li>
                                <label>задних колес</label>
                                <div class="value">${item.rearWheels.name}</div>
                            </li>


                            <li>
                                <label>стояночный</label>
                                <div class="value">${item.parkingBrake.name}</div>
                            </li>


                            <li>
                                <label>вспомогательный</label>
                                <div class="value">${item.auxiliary.name}</div>
                            </li>

                        </ul><!-- /.tabled-data -->
                    </div><!-- /.tab-pane #additional-info -->


                    <div class="tab-pane" id="advantages">
                        <p>${item.advantages}</p>
                    </div><!-- /.tab-pane #reviews -->

                    <div class="tab-pane" id="complete-set">
                        <p>${item.completeSet}</p>
                    </div><!-- /.tab-pane #reviews -->
                </div><!-- /.tab-content -->

            </div><!-- /.tab-holder -->
        </div><!-- /.container -->
    </section><!-- /#single-product-tab -->
    <!-- ========================================= SINGLE PRODUCT TAB : END ========================================= -->

    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>
