<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name='robots' content='all, follow'/>
    <meta name="description" content=""/>
    <meta name="keywords" content=""/>
    <title>Great admin</title>
    <link rel="stylesheet" href="<c:url value="/resources/public/css/default.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/blue.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/datePicker.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/wysiwyg.css"/>" media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/fancybox-1.3.1.css"/> " media="screen">
    <link rel="stylesheet" href="<c:url value="/resources/public/css/visualize.css"/>" media="screen">
    <script src="<c:url value="/webjars/jquery/2.2.1/jquery.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/public/js/jquery.dimensions.min.js"/>"></script>
    <!-- // Tabs // -->
    <script type="text/javascript" src="<c:url value="/resources/public/js/ui.core.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/public/js/jquery.ui.tabs.min.js"/>"></script>

    <!-- // Table drag and drop rows // -->
    <script type="text/javascript" src="<c:url value="/resources/public/js/tablednd.js"/>"></script>
    <!-- // Date Picker // -->
    <script src="<c:url value="/resources/public/js/date.js"/>"></script>
    <!--[if IE]>
    <script src="/resources/public/js/jquery.bgiframe.js"></script>
    <![endif]-->
    <script src="<c:url value="/resources/public/js/jquery.datePicker.js"/>"></script>

    <!-- // Wysiwyg // -->
    <script src="<c:url value="/resources/public/js/jquery.wysiwyg.js"/>"></script>

    <!-- // Graphs // -->
    <script src="<c:url value="/resources/public/js/excanvas.js"/>"></script>
    <script src="<c:url value="/resources/public/js/jquery.visualize.js"/>"></script>
    <!-- // Fancybox // -->
    <script src="<c:url value="/resources/public/js/jquery.fancybox-1.3.1.js"/>"></script>

    <!-- // File upload // -->
    <script src="<c:url value="/resources/public/js/jquery.filestyle.js"/>"></script>


    <script src="<c:url value="/resources/public/js/init.js"/>"></script>

</head>
<body>
<div id="main">
    <!-- #header -->
    <div id="header">
        <!-- #logo -->
        <div id="logo">
            <a href="index.html" title="Go to Homepage"><span>Great Admin</span></a>
        </div>
        <!-- /#logo -->
        <!-- #user -->
        <div id="user">
            <h2>Forest Gump <span>(admin)</span></h2>
            <a href="">7 messages</a> - <a href="">settings</a> - <a href="index.html">logout</a>
        </div>
        <!-- /#user -->
    </div>
    <!-- /header -->
    <!-- #content -->
    <div id="content">

        <!-- breadcrumbs -->
        <div class="breadcrumbs">
            <ul>
                <li class="home"><a href="">Homepage</a></li>
                <li><a href="">Category</a></li>
                <li>Page</li>
            </ul>
        </div>
        <!-- /breadcrumbs -->
        <!-- /box -->
        <div class="box">
            <div class="headlines">
                <h2><span>Save information</span></h2>
                <a href="#help" class="help"></a>
            </div>
            <div class="box-content">
                <form class="formBox" method="post" action="/admin/export" enctype="multipart/form-data">
                    <fieldset>
                        <div class="clearfix file">
                            <div class="lab"><label for="dropzone-excel">Upload file</label></div>
                            <div class="file-field input-field" id="dropzone-excel">
                                <div class="clearfix file">
                                    <div class="con">
                                        <input type="file" name="file" class="upload-file" id="excel"/>
                                    </div>
                                    <p class="output-excel"></p>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div><!-- /box-content -->
        </div>


        <div class="box">
            <div class="headlines">
                <h2><span>Save Images</span></h2>
                <a href="#help" class="help"></a>
            </div>
            <div class="box-content">
                <form class="formBox form-cols" method="post" action="/admin/upload-photo"
                      enctype="multipart/form-data">
                        <div class="form-cols"><!-- two form cols -->
                            <div class="col1">
                                <div class="clearfix file">
                                    <div class="lab"><label for="dropzone-photo">Upload file</label></div>
                                    <div class="file-field input-field" id="dropzone-photo">
                                        <div class="clearfix file">
                                            <div class="con">
                                                <input type="file" name="file" class="upload-file" id="photo"/>
                                            </div>
                                            <p class="output-photo"></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                </form>
            </div><!-- /box-content -->
        </div>
    </div>
    <!-- /#content -->
    <!-- #sidebar -->
    <div id="sidebar">

        <!-- mainmenu -->
        <ul id="floatMenu" class="mainmenu">
            <li class="first"><a href="#">Dashboard</a></li>
            <li><a href="#">Pages</a>
                <ul class="submenu">
                    <li><a href="#">New Pages</a></li>
                    <li><a href="#">List Pages</a></li>
                </ul>
            </li>
            <li><a href="#">News</a></li>
            <li><a href="#">Articles</a>
                <ul class="submenu">
                    <li><a href="">New Article</a></li>
                    <li><a href="#">List Article</a></li>
                </ul>
            </li>
            <li><a href="#">Color skin</a>
                <ul class="submenu">
                    <li><a href="../blue/">Blue</a></li>
                    <li><a href="../green/">Green</a></li>
                    <li><a href="../red/">Red</a></li>
                    <li><a href="../gray/">Gray</a></li>
                </ul>
            </li>
            <li><a href="">Settings</a></li>
            <li class="last"><a href="http://themeforest.net/item/great-admin-theme/114528?ref=ClearHead" class="link">ThemeForest</a>
            </li>
        </ul>
        <!-- /.mainmenu -->

    </div>
    <!-- /#sidebar -->
    <!-- #footer -->
    <div id="footer">
        <p>© 2010 Great Admin | <a href="#main">Top</a></p>
    </div>
    <!-- /#footer -->
</div>
<!-- /#main -->
<script src="<c:url value="/resources/assets/js/dmuploader.min.js"/>"></script>
<script>

    $('#dropzone-photo').dmUploader({
        url: "/admin/rest/upload-photo",
        dataType: 'json',
        allowedTypes: 'image/*',
        onUploadSuccess: function (id, response) {
            $(".output-photo").html("photo " + response + " uploaded!");
        }
    });
    $('#dropzone-excel').dmUploader({
        url: "/admin/rest/export",
        dataType: 'json',
        onUploadSuccess: function (id, response) {
            $(".output-excel").html("excel " + response + " uploaded!");
        }
    });
</script>
</body>
</html>