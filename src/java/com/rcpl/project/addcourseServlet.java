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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Win 8.1
 */
public class addcourseServlet extends HttpServlet {

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
            String course = request.getParameter("course");
            String desc = request.getParameter("desc");
            
             
            PreparedStatement ps = con.prepareStatement("select * from course_master where course=?");
            ps.setString(1, course);
           
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                request.setAttribute("msg","course already added!!");
                RequestDispatcher rd=request.getRequestDispatcher("addcourse.jsp");
                rd.forward(request, response);
               
            }
            else
               
            {
                PreparedStatement ps1 = con.prepareStatement("insert into course_master values (?,?,?)");
            ps1.setString(1, course);
            ps1.setString(2, desc);
            ps1.setString(3, "false");
            
            int status=ps1.executeUpdate();
            if(status>0)
             request.setAttribute("msg","course  added succesfully!!");
            else
              request.setAttribute("msg","course not added !!");
            
                RequestDispatcher rd=request.getRequestDispatcher("addcourse.jsp");
                rd.forward(request, response);
            }
        } catch(Exception e)
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
