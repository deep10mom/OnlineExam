<%-- 
    Document   : questionPaper
    Created on : Jul 3, 2017, 3:07:23 PM
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
        <title>JSP Page</title>
    </head>
    <body style="background-color: papayawhip;">
    <center>
        <h1>QUESTION PAPER </h1>
        <h2 style="color: red;">NOTE: DON'T REFRESH THE PAGE</h2>
    </center>
    
    
    
    
    
    <h2><pre>    SUBJECT:<%= request.getParameter("course")%>                                    MARKS: 100                                    TIME:</pre></h2>
    <br><br><br>
    
    
    <form action="evaluationServlet">
        
    <% Connection con=Dbconnection.getDbConnection();
    try
    {
      
    
    String course=(String)request.getParameter("course");
    int i=0;
    System.out.println(course);  
    %><input type="hidden" name="course" value="<%= course %>"><%
    PreparedStatement ps1=con.prepareStatement("select * from question_master where course=? order by RAND() LIMIT 11");
    
            ps1.setString(1, course);
            ResultSet rs=ps1.executeQuery();
           System.out.println(rs.next());
            while(rs.next()){
                i++;
                //String q="qu"+i;
                 
            
             %>
             <h3><pre><%= i %>)  <%= rs.getString(2) %></pre></h3>
             
             <input type="hidden" name="ques<%=i%>" value="<%= rs.getString(2) %>" /><br>
             <input type="radio" name="radio<%= i%>" value=<%= rs.getString(3) %>><%= rs.getString(3) %><br>
             <input type="radio" name="radio<%= i%>" value=<%= rs.getString(4) %> ><%= rs.getString(4) %><br>
             <input type="radio" name="radio<%= i%>" value=<%= rs.getString(5) %> ><%= rs.getString(5) %><br>
             <input type="radio" name="radio<%= i%>" value=<%= rs.getString(6) %> ><%= rs.getString(6) %><br>
             
             <% } 
             } catch(Exception e)
             {
                 System.out.println(e);
             }
            %>
            <input type="submit" value="Submit"/>    
    
    
    
    </form>
        
    
    </body>
</html>
