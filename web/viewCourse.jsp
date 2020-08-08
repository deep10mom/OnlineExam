<%-- 
    Document   : viewCourse
    Created on : Jul 1, 2017, 10:25:18 PM
    Author     : Win 8.1
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.rcpl.project.Dbconnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
<style>
    
</style>
    </head>
    <body>
        <jsp:include page="adminHeader.jsp"/><hr>
        <br>
        <h4><b><%if(request.getAttribute("msg")!=null)
            out.println(request.getAttribute("msg")); %></b></h4>
            <br>
        <center>
            <h2 style="color: purple;"><b>COURSES</b></h2>
            
            <br><br>
        <div class="container">
          
  <table class="table table-hover">
    <thead>
      <tr>
          <th style="color:red;">COURSE</th>
        <th style="color:red;">DESCRIPTION</th>
        <th style="color:red;">OPERATION</th>
        
      </tr>
    </thead>
    <tbody>
      
          <% Connection con=Dbconnection.getDbConnection();
          try{
              
          
             PreparedStatement ps=con.prepareStatement("select * from course_master");
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 
   %>
   <tr>
   <td style="color: green;"><b><%= rs.getString(1) %></b></td>
   <td style="color: green;"><b><%= rs.getString(2) %></b></td>
   
   <td><a href="delete?xyz=<%= rs.getString(1) %>">delete</a></td>
    </tr>
        <% }
          }
        catch(Exception e)
        {
            System.out.println(e);
}%>
        
     
      
        
      
    </tbody>
  </table>
</div>


    </center>
<br><br><br>
<jsp:include page="Footer.jsp"/>
    </body>
</html>
