<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title><spring:message code="app.dump_trucks"/>: <spring:message code="app.compare"/></title>
    <c:import url="fragments/head.jsp"/>
</head>
<c:set value="${sessionScope.compare}" var="compareList"/>
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
                        <c:forEach items="${compareList}" var="item" varStatus="loop">
                            <td class="text-center">
                                <div class="image-wrap">
                                    <a data-product_id="39" href="<c:url value="/compare/compare-list/remove/${loop.index}"/>" class="remove-link"><i class="fa fa-times-circle"></i></a>
                                    <img width="220" height="154" alt="Iconia W700" class="attachment-yith-woocompare-image"
                                         src="<c:url value="/resources/assets/images/${item.photos[0].name}"/>">
                                </div>
                                <p><strong>${item.model.name}</strong></p>
                            </td>
                        </c:forEach>
                    </tr>
                    </thead>


                    <tbody>
                    <tr class="comparison-item price">
                        <th>Price</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">$${item.price}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Manufacturer country</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.manufacturerCountry.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Year</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.year}</span>
                            </td>
                        </c:forEach>
                    </tr>



                    <tr class="comparison-item price">
                        <th>Machine Condition</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.machineCondition.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Machine location</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.machineLocation.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Series</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.model.series.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Payload Capacity</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.payloadCapacity}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Engine</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.engine.name}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Power</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.power}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Fuel Rate</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.fuelRate}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Transmission</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.transmission.name}</span>
                            </td>
                        </c:forEach>
                    </tr>
                    <tr class="comparison-item price">
                        <th>Suspension</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.suspension.name}</span>
                            </td>
                        </c:forEach>
                    </tr>
                    <tr class="comparison-item price">
                        <th>Torque</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.torque}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Brake Type</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.brakeType.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Front Wheels</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.frontWheels.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Rear Wheels</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.rearWheels.name}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Parking Brake</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.parkingBrake.name}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Auxiliary</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.auxiliary.name}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Turning Radius</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.turningRadius}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Length</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.length}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Width</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.width}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Height</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.height}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Operational Weight</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.operationalWeight}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Gross Weight </th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.grossWeight}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Max Speed</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.maxSpeed}</span>
                            </td>
                        </c:forEach>
                    </tr>


                    <tr class="comparison-item price">
                        <th>Application</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.application}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Advantages</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.advantages}</span>
                            </td>
                        </c:forEach>
                    </tr>

                    <tr class="comparison-item price">
                        <th>Complete set</th>
                        <c:forEach items="${compareList}" var="item">
                            <td class="comparison-item-cell even product_34">
                                <span class="amount">${item.completeSet}</span>
                            </td>
                        </c:forEach>
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