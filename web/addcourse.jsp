<%-- 
    Document   : addcourse
    Created on : Jul 1, 2017, 8:27:29 PM
    Author     : Win 8.1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mastering an Education Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mastering Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //custom-theme -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/JiSlider.css" rel="stylesheet"> 
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />

<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<link href="//fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>

  
    </head>
    <body>
        <jsp:include page="adminHeader.jsp"/> <hr>
    <center><h2>ADD NEW COURSE</h2></center>
        
    <h4 style="color: red;margin-left: 10px;">   <%if(request.getAttribute("msg")!=null)
        out.println(request.getAttribute("msg"));%></h4>
        <br>
        <form action="addcourseServlet" style="margin-left: 10px;">
  <div class="form-group">
    <label for="course">Course Name:</label>
    <input type="text" class="form-control" name="course"/>
  </div>
  <div class="form-group">
    <label for="desc">Add Description:</label>
    <input type="text" class="form-control" name="desc"/>
  </div>
  
  <button type="submit" class="btn btn-success">Submit</button>
</form>
        <br>
            <jsp:include page="Footer.jsp"/>
            <jsp:include page="javascript.jsp"/>
    </body>
</html>
