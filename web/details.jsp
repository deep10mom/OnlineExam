<%-- 
    Document   : finalresult
    Created on : Jul 4, 2017, 6:02:30 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <jsp:include page="userHeader.jsp"/><br>
    <center>
        <h1 style="color: purple;"><b>DETAILS:</b></h1><br>
         <div class="container">
          
  <table class="table table-hover">
    <thead>
      <tr>
          
        <th style="color:red;">USERID</th>
        <th style="color:red;">NAME</th>
        <th style="color:red;">AGE</th>
        <th style="color:red;">ADDRESS</th>
        <th style="color:red;">EMAIL</th>
        <th style="color:red;">CONTACT</th>
      </tr>
    </thead>
    <tbody>
      
          <% Connection con=Dbconnection.getDbConnection();
          try{
              
          
          String userid=(String)session.getAttribute("uname");
             PreparedStatement ps=con.prepareStatement("select * from userinfo where userid=?");
             ps.setString(1, userid);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 
   %>
   <tr>
   <td style="color: green;"><b><%= rs.getString(1) %></b></td>
   <td style="color: green;"><b><%= rs.getString(2) %></b></td>
   <td style="color: green;"><b><%= rs.getString(3) %></b></td>
   <td style="color: green;"><b><%= rs.getString(4) %></b></td>
   <td style="color: green;"><b><%= rs.getString(5) %></b></td>
   <td style="color: green;"><b><%= rs.getString(6) %></b></td>
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
        
        
    <br><br>  
    <jsp:include page="Footer.jsp"/>   
    </body>
</html>
