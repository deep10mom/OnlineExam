/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcpl.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.pkcs11.wrapper.Functions;
import java.util.Date;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Win 8.1
 */
public class evaluationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=Dbconnection.getDbConnection();
        
        try {
            String q=null,ans=null;
            HttpSession session=request.getSession(true);
            String course=request.getParameter("course");
            System.out.println(course);
            String userid=(String)session.getAttribute("uname");
            Statement id=con.createStatement();
            String sql="update user_course_mapping set exam_status='true', approval_status='applied once' where course='"+course+"' and userid='"+userid+"'";
            System.out.println(sql);
            int s=id.executeUpdate(sql);
            /*PreparedStatement ps=con.prepareStatement("update user_course_mapping set exam_status=? where course=? and userid=?");
            ps.setString(1, "true");
           
             ps.setString(2, course);
             ps.setString(3, userid);
             int status=ps.executeUpdate();
             System.out.println(status);*/
             int j=1;int total=0;
             while(  j<=10)
                 
             {
                 q=request.getParameter("ques"+j);
                 System.out.println(q);
                 ans=request.getParameter("radio"+j);
                 System.out.println(ans);
                 PreparedStatement ps1=con.prepareStatement("select * from question_master where course=? and question=?");
                 ps1.setString(1, course);
           
                 ps1.setString(2, q);
                 ResultSet rs=ps1.executeQuery();
                 if(rs.next())
                 { 
                     
                     
                     if(rs.getString(7).equals(ans))
                     {
                         
                     
                         total=total+10;
                        
                     }
                 }
                 j++;
             }
                 
           
             DateFormat dateformat =new SimpleDateFormat("DD-MM-YY hh:mm:ss");
             Date d=new Date();
             PreparedStatement ps2=con.prepareStatement("insert into result(userid,course,date,marks) values (?,?,?,?)");
                // ps2.setString(1, );
           
                 ps2.setString(1, userid);
                 ps2.setString(2, course);
                 ps2.setString(3, dateformat.format(d));
                 ps2.setInt(4, total);
                 int status1=ps2.executeUpdate();
                 response.sendRedirect("startexam.jsp");
        }catch(Exception e)
        {
            System.err.println(e);
        }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
