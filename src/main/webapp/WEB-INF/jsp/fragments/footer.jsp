<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer id="footer" class="color-bg">

    <div class="container">
    </div><!-- /.container -->
    <div class="link-list-row">
        <div class="container no-padding">
            <div class="col-xs-12 col-md-4 ">
                <!-- ============================================================= CONTACT INFO ============================================================= -->
                <div class="contact-info">
                    <div class="footer-logo">
                        <a href="<c:url value="/"/>">
                            <img alt="logo" src="<c:url value="/resources/assets/images/Belaz_logo.png"/>" width="233"
                                 height="54"/>
                        </a>
                    </div><!-- /.footer-logo -->

                    <p class="regular-bold">OJSC «BELAZ» - Management Company of Holding «BELAZ-HOLDING»</p>

                    <p>
                        <strong>Address:</strong> 40 let Octyabrya str. 4, 222161, Zhodino, Minsk region, Republic of
                        Belarus
                    </p>

                    <div class="social-icons">
                        <h3>Get in touch</h3>
                        <ul>
                            <%--<li><a href="http://facebook.com/transvelo" class="fa fa-facebook"></a></li>--%>
                            <li><a href="https://twitter.com/hashtag/belaz" class="fa fa-twitter" target="_blank"></a></li>
                            <li><a href="https://www.pinterest.com/pin/506514289319291998/" class="fa fa-pinterest"
                                   target="_blank"></a></li>
                            <li><a href="https://www.flickr.com/photos/belaz" class="fa fa-flickr" target="_blank"></a>
                            </li>
                            <li><a href="http://www.youtube.com/belazjsc" class="fa fa-youtube" target="_blank"></a>
                            </li>
                        </ul>
                    </div><!-- /.social-icons -->

                </div>
                <!-- ============================================================= CONTACT INFO : END ============================================================= -->
            </div>

            <div class="col-xs-12 col-md-8 no-margin">
                <!-- ============================================================= LINKS FOOTER ============================================================= -->
                <div class="link-widget">
                    <div class="widget">
                        <h3>Information</h3>
                        <ul>
                            <li><a href="/"><spring:message code="app.home"/></a></li>
                            <li><a href="/truck-mining/category"><spring:message code="app.dump_trucks"/></a></li>
                            <li><a href="/dump-trucks-capacity/category"><spring:message code="app.trucks_with_enchanced_capacity"/></a></li>
                            <li><a href="/sitemap"><spring:message code="app.sitemap"/></a></li>
                        </ul>
                    </div><!-- /.widget -->
                </div><!-- /.link-widget -->
                <!-- ============================================================= LINKS FOOTER : END ============================================================= -->
            </div>
        </div><!-- /.container -->
    </div><!-- /.link-list-row -->

    <div class="copyright-bar">
        <div class="container">
            <div class="col-xs-12 col-sm-6 no-margin">
                <div class="copyright">
                    &copy; <a href="index.php?page=home">BELAZ</a> - all rights reserved
                </div><!-- /.copyright -->
            </div>
        </div><!-- /.container -->
    </div><!-- /.copyright-bar -->

</footer>
<!-- /#footer -->
