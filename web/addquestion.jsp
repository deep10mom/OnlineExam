<%-- 
    Document   : addquestion
    Created on : Jul 1, 2017, 11:23:31 PM
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
        <jsp:include page="adminHeader.jsp"/>
        <br>
        <h4 style="color: green;margin-left: 10px;" ><b> <% if(request.getAttribute("msg")!=null)
            out.println(request.getAttribute("msg"));%></b></h4>
            <br><br>
        
                                            
  <div class="row">
        
    <form action="addquestionServlet" style="margin-left: 10px;">
        <div class="col-lg-6">
            <div class="form-group">
            
                <select class="form-control" name="course">
         <% Connection con=Dbconnection.getDbConnection();
          try{
              
          
             PreparedStatement ps=con.prepareStatement("select * from course_master");
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 
   %>
   
        
  
    
  

    
                    <option><%= rs.getString(1) %></option>
      
      <% }
          }
        catch(Exception e)
        {
            System.out.println(e);
}%>
               
   </select>        
  </div>
  <div class="form-group">
    <label for="question">Enter question:</label>
    <textarea class="form-control" name="question" rows="15"></textarea>
  </div>
        </div>
        <div class="col-lg-6">
  <div class="form-group">
    <label for="opt1">option 1:</label>
    <input type="text" class="form-control" name="opt1">
  </div>
        <div class="form-group">
    <label for="opt2">option 2:</label>
    <input type="text" class="form-control" name="opt2">
  </div>
        <div class="form-group">
    <label for="opt3">option 3:</label>
    <input type="text" class="form-control" name="opt3">
  </div>
        <div class="form-group">
    <label for="opt4">option 4:</label>
    <input type="text" class="form-control" name="opt4">
  </div>
        <div class="form-group">
    <label for="ans">Answer:</label>
    <input type="text" class="form-control" name="ans">
  </div>
  
  <button type="submit" class="btn btn-success">Submit</button>
        </div>
</form>
    </div>
    <br>
    <br>
    <jsp:include page="Footer.jsp"/>
    
    
    </body>
</html>
