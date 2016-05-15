<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dimka
  Date: 06.05.2016
  Time: 20:20
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
                                <a href="#">Home</a>
                            </li>
                            <li class="breadcrumb-item current">
                                <a href="index.php?page=compaore">Product Comparison</a>
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
        <div class="container">
            <div class="inner-xs">
                <div class="page-header">
                    <h2 class="page-title">
                        Product Comparison
                    </h2>
                </div>
            </div><!-- /.section-page-title -->

            <div class="table-responsive inner-bottom-xs inner-top-xs">

                <table class="table table-bordered table-striped compare-list">
                    <thead>
                    <tr>
                        <td>&nbsp;</td>
                        <td class="text-center">
                            <div class="image-wrap">
                                <a data-product_id="39" href="#" class="remove-link"><i class="fa fa-times-circle"></i></a>
                                <img width="220" height="154" alt="Iconia W700" class="attachment-yith-woocompare-image"
                                     src="assets/images/products/product-01.jpg">
                            </div>
                            <p><strong>Iconia W700</strong></p>
                        </td>
                        <td class="text-center">
                            <div class="image-wrap">
                                <a data-product_id="34" href="#" class="remove-link"><i class="fa fa-times-circle"></i></a>
                                <img width="220" height="154" alt="POV Action Cam"
                                     class="attachment-yith-woocompare-image"
                                     src="assets/images/products/product-02.jpg">
                            </div>
                            <p><strong>AS100V Action Cam</strong></p>
                        </td>
                        <td class="text-center">
                            <div class="image-wrap">
                                <a data-product_id="30" href="#" class="remove-link"><i class="fa fa-times-circle"></i></a>
                                <img width="220" height="154" alt="PlayStation 4"
                                     class="attachment-yith-woocompare-image"
                                     src="assets/images/products/product-03.jpg">
                            </div>
                            <p><strong>PlayStation 4</strong></p>
                        </td>
                        <td class="text-center">
                            <div class="image-wrap">
                                <a data-product_id="20" href="#" class="remove-link"><i class="fa fa-times-circle"></i></a>
                                <img width="220" height="154" alt="Cyber-shot Digital Camera WX300"
                                     class="attachment-yith-woocompare-image"
                                     src="assets/images/products/product-04.jpg">
                            </div>
                            <p><strong>Cyber-shot Digital Camera WX300</strong></p>
                        </td>
                    </tr>
                    <tr class="tr-add-to-cart">
                        <td>&nbsp;</td>
                        <td class="text-center">
                            <div class="add-cart-button">
                                <a class="le-button add_to_cart_button  product_type_simple" href="index.php?page=cart">Add
                                    to cart</a>
                            </div>
                        </td>
                        <td class="text-center">
                            <div class="add-cart-button">
                                <a class="le-button add_to_cart_button  product_type_simple" href="index.php?page=cart">Add
                                    to cart</a>
                            </div>
                        </td>
                        <td class="text-center">
                            <div class="add-cart-button">
                                <a class="le-button add_to_cart_button  product_type_simple" href="index.php?page=cart">Add
                                    to cart</a>
                            </div>
                        </td>
                        <td class="text-center">
                            <div class="add-cart-button">
                                <a class="le-button add_to_cart_button  product_type_variable"
                                   href="index.php?page=cart">Add to cart</a>
                            </div>
                        </td>
                    </tr>
                    </thead>
                    <tbody>

                    <tr class="comparison-item price">
                        <th>Price</th>
                        <td class="comparison-item-cell odd product_39">
                            <span class="amount">$629.99</span>
                        </td>
                        <td class="comparison-item-cell even product_34">
                            <del><span class="amount">$299.99</span></del>
                            <ins><span class="amount">$269.99</span></ins>
                        </td>
                        <td class="comparison-item-cell odd product_30">
                            <span class="amount">$399.99</span>
                        </td>
                        <td class="comparison-item-cell even product_20">
                            <del><span class="amount">$329.99</span></del>
                            <ins><span class="amount">$249.99</span>&ndash;<span class="amount">$329.99</span></ins>
                        </td>
                    </tr>

                    <tr class="comparison-item description">
                        <th>Description</th>
                        <td class="comparison-item-cell odd product_39">
                            <p>Nulla sed sapien a ligula auctor maximus. Aliquam eget condimentum nunc. Maecenas
                                efficitur pretium nunc in semper. Nullam ac luctus nisl. </p>
                        </td>
                        <td class="comparison-item-cell even product_34">
                            <p>Nulla sed sapien a ligula auctor maximus. Aliquam eget condimentum nunc. Maecenas
                                efficitur pretium nunc in semper. Nullam ac luctus nisl. </p>
                        </td>
                        <td class="comparison-item-cell odd product_30">
                            <p>Nulla sed sapien a ligula auctor maximus. Aliquam eget condimentum nunc. Maecenas
                                efficitur pretium nunc in semper. Nullam ac luctus nisl. </p>
                        </td>
                        <td class="comparison-item-cell even product_20">
                            <p>Nulla sed sapien a ligula auctor maximus. Aliquam eget condimentum nunc. Maecenas
                                efficitur pretium nunc in semper. Nullam ac luctus nisl. </p>
                        </td>
                    </tr>

                    <tr class="comparison-item stock">
                        <th>Availability</th>

                        <td class="comparison-item-cell odd product_39">
                            <span class="label label-success"><span class="">In stock</span></span>
                        </td>
                        <td class="comparison-item-cell even product_34">
                            <span class="label label-success"><span class="">In stock</span></span>
                        </td>
                        <td class="comparison-item-cell odd product_30">
                            <span class="label label-success"><span class="">In stock</span></span>
                        </td>
                        <td class="comparison-item-cell even product_20">
                            <span class="label label-success"><span class="">In stock</span></span>
                        </td>
                    </tr>

                    <tr class="price repeated">
                        <th>Price</th>
                        <td class="odd product_39"><span class="amount">$629.99</span></td>
                        <td class="even product_34">
                            <del><span class="amount">$299.99</span></del>
                            <ins><span class="amount">$269.99</span></ins>
                        </td>
                        <td class="odd product_30"><span class="amount">$399.99</span></td>
                        <td class="even product_20">
                            <del><span class="amount">$329.99</span></del>
                            <ins><span class="amount">$249.99</span>&ndash;<span class="amount">$329.99</span></ins>
                        </td>
                    </tr>

                    </tbody>
                </table>
            </div><!-- /.table-responsive -->
        </div><!-- /.container -->
    </div>
    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>