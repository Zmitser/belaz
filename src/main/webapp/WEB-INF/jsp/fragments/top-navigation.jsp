<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<nav class="top-bar animate-dropdown">
    <div class="container">
        <div class="col-xs-12 col-sm-6 no-margin">
            <ul>
                <li><a href="<c:url value="/"/>">Главная</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#change-colors">Изменить цвет</a>

                    <ul class="dropdown-menu" role="menu" >
                        <li role="presentation"><a role="menuitem" class="changecolor green-text" tabindex="-1" href="#" title="Green color">Зеленый</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor blue-text" tabindex="-1" href="#" title="Blue color">Синий</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor red-text" tabindex="-1" href="#" title="Red color">Красный</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor orange-text" tabindex="-1" href="#" title="Orange color">Оранжевый</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor navy-text" tabindex="-1" href="#" title="Navy color">Морской</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor dark-green-text" tabindex="-1" href="#" title="Darkgreen color">Серый</a></li>
                    </ul>
                </li>
                <li><a href="contact.html">Contact</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#pages">Pages</a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="home.html">Home</a></li>
                        <li><a href="home-2.html">Home Alt</a></li>
                        <li><a href="category-grid.html">Category - Grid/List</a></li>
                        <li><a href="category-grid-2.html">Category 2 - Grid/List</a></li>
                        <li><a href="single-product.html">Single Product</a></li>
                        <li><a href="single-product-sidebar.html">Single Product with Sidebar</a></li>
                        <li><a href="cart.html">Shopping Cart</a></li>
                        <li><a href="checkout.html">Checkout</a></li>
                        <li><a href="about.html">About Us</a></li>
                        <li><a href="contact.html">Contact Us</a></li>
                        <li><a href="blog.html">Blog</a></li>
                        <li><a href="blog-fullwidth.html">Blog Full Width</a></li>
                        <li><a href="blog-post.html">Blog Post</a></li>
                        <li><a href="faq.html">FAQ</a></li>
                        <li><a href="terms.html">Terms & Conditions</a></li>
                        <li><a href="authentication.html">Login/Register</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.col -->

        <div class="col-xs-12 col-sm-6 no-margin">
            <ul class="right">
                <li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#change-language">English</a>
                    <ul class="dropdown-menu" role="menu" >
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Turkish</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Tamil</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">French</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Russian</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#change-currency">Dollar (US)</a>
                    <ul class="dropdown-menu" role="menu">
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Euro (EU)</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Turkish Lira (TL)</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Indian Rupee (INR)</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Dollar (US)</a></li>
                    </ul>
                </li>
                <li><a href="authentication.html">Регистрация</a></li>
                <li><a href="authentication.html">Авторизация</a></li>
            </ul>
        </div><!-- /.col -->
    </div><!-- /.container -->
</nav><!-- /.top-bar -->
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->
