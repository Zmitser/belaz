<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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

    </header>
    <!-- ============================================================= HEADER : END ============================================================= -->
    <main id="contact-us" class="inner-bottom-md">
        <div class="container">
            <div class="row">

                <div class="col-md-8">
                    <section class="section leave-a-message">
                        <h2 class="bordered">Site Map</h2>
                        <h3 style="color:green;"></h3>


                        <div class="field-row">
                            <a href="<c:url value="/"/>">Home</a><br>
                            <br> <label> <a href="/truck-mining/category?lang=en"><spring:message code="app.dump_trucks"/></a></label>
                            <c:forEach items="${truckMinings}" var="truckMining">
                                <a href="<c:url value="/truck-mining/single-product/${truckMining.id}?lang=en"/>">${truckMining.model.name}</a> <br>
                            </c:forEach>
                            <br> <label> <a href="/dump-trucks-capacity/category?lang=en"><spring:message code="app.trucks_with_enchanced_capacity"/></a> </label>
                            <c:forEach items="${dumpTrucks}" var="dumpTruck">
                                <a href="<c:url value="/truck-mining/single-product/${dumpTruck.id}?lang=en"/>">${dumpTruck.model.name}</a> <br>
                            </c:forEach>
                            <div class="field-row">

                            </div>
                        </div><!-- /.field-row -->
                        <!--</form> /.contact-form -->
                    </section><!-- /.leave-a-message -->
                </div><!-- /.col -->


            </div><!-- /.row -->
        </div><!-- /.container -->
    </main>
    <!-- ============================================================= FOOTER ============================================================= -->
    <c:import url="fragments/footer.jsp"/>
    <!-- ============================================================= FOOTER : END ============================================================= -->
</div><!-- /.wrapper -->
<c:import url="fragments/scripts.jsp"/>
</body>
</html>