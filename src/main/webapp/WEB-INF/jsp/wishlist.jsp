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
                                    Media Center
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
                            <li class="breadcrumb-item">
                                <a href="index.php?page=home">Home</a>
                            </li>
                            <li class="breadcrumb-item current">
                                <a href="index.php?page=wishlist">Wishlist</a>
                            </li>
                        </ul>
                    </div><!-- /.breadcrumb-nav-holder -->
                </div><!-- /.container -->
            </div><!-- /#breadcrumb-alt -->
            <!-- ========================================= BREADCRUMB : END ========================================= -->
        </div>
    </header>
    <!-- ============================================================= HEADER : END ============================================================= -->
    <div class="main-content" id="main-content">
        <div class="row">
            <div class="col-lg-10 center-block page-wishlist style-cart-page inner-bottom-xs">

                <div class="inner-xs">
                    <div class="page-header">
                        <h2 class="page-title">My Wishlist</h2>
                    </div>
                </div><!-- /.section-page-title -->

                <div class="items-holder">
                    <div class="container-fluid wishlist_table">

                        <div class="row cart-item cart_item" id="yith-wcwl-row-1">

                            <div class="col-xs-12 col-sm-1 no-margin">
                                <a title="Remove this product" class="remove_from_wishlist remove-item" href="#">×</a>
                            </div>

                            <div class="col-xs-12 col-sm-1 no-margin">
                                <a href="index.php?page=single-product">
                                    <img width="73" height="73" alt="Canon PowerShot Elph 115 IS"
                                         class="attachment-shop_thumbnail wp-post-image"
                                         src="<c:url value="/resources/assets/images/products/product-small-03.jpg"/>">
                                </a>
                            </div>
                            <div class="col-xs-12 col-sm-4 no-margin">
                                <div class="title">
                                    <a href="index.php?page=single-product">Canon PowerShot Elph 115 IS</a>
                                </div><!-- /.title -->
                                <div>
                                    <span class="label label-success wishlist-in-stock">In Stock</span>
                                </div>
                            </div>

                            <div class="col-xs-12 col-sm-3 no-margin">
                                <div class="price">
                                    <span class="amount">$169.00</span>
                                </div>
                            </div>

                            <div class="col-xs-12 col-sm-3 no-margin">
                                <div class="text-right">
                                    <div class="add-cart-button">
                                        <a class="le-button add_to_cart_button product_type_simple"
                                           href="index.php?page=cart">Add to cart</a>
                                    </div>
                                </div>
                            </div>

                        </div><!-- /.cart-item -->


                        <div class="row cart-item cart_item" id="yith-wcwl-row-6">

                            <div class="col-xs-12 col-sm-1 no-margin">
                                <a title="Remove this product" class="remove_from_wishlist remove-item" href="#">×</a>
                            </div>

                            <div class="col-xs-12 col-sm-1 no-margin">
                                <a href="index.php?page=single-product">
                                    <img width="73" height="73" alt="I - Book Mini Laptop"
                                         class="attachment-shop_thumbnail wp-post-image"
                                         src="<c:url value="/resources/assets/images/products/product-small-02.jpg"/>">
                                </a>
                            </div>
                            <div class="col-xs-12 col-sm-4 no-margin">
                                <div class="title">
                                    <a href="index.php?page=single-product">I - Book Mini Laptop</a>
                                </div><!-- /.title -->
                                <div>
                                    <span class="label label-danger wishlist-out-of-stock">Out of Stock</span>
                                </div>
                            </div>

                            <div class="col-xs-12 col-sm-3 no-margin">
                                <div class="price">
                                    <span class="amount">$1,199.95</span>
                                </div>
                            </div>

                            <div class="col-xs-12 col-sm-3 no-margin">
                                <div class="text-right">
                                    <div class="add-cart-button">
                                        <a class="le-button disabled product_type_simple" href="index.php?page=cart">Add
                                            to cart</a>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.cart-item -->

                    </div><!-- /.wishlist-table -->
                </div><!-- /.items-holder -->

            </div><!-- .large-->
        </div><!-- .row-->
    </div>
    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>