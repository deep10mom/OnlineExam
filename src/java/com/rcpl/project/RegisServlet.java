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
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;

/**
 *
 * @author Win 8.1
 */
public class RegisServlet extends HttpServlet {

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
            String userid=request.getParameter("userid");
            String name=request.getParameter("name");
            String email =request.getParameter("email");
            String age=request.getParameter("age");
            int age1=Integer.parseInt(age);
            String address=request.getParameter("address");
            String contact=request.getParameter("contact");
            //String contact1=Long.parseLong(contact);
            String password=request.getParameter("password");
            // con=Dbconnection.getDbConnection();
            PreparedStatement pst=con.prepareStatement("insert into login_master values (?,?,?)");
            pst.setString(1, userid);
            pst.setString(2, password);
            pst.setString(3,"user");
            int status=pst.executeUpdate();
            PreparedStatement pst1=con.prepareStatement("insert into userinfo values (?,?,?,?,?,?)");
            pst1.setString(1, userid);
            pst1.setString(2, name);
            pst1.setInt(3, age1);
            pst1.setString(4, address);
            pst1.setString(5, email);
            pst1.setString(6, contact);
            int status1=pst1.executeUpdate();
            if((status>0)&&(status1>0))
            request.setAttribute("msg", "Registration done!");
            else
                request.setAttribute("msg", "Registration unsuccesful!");
            RequestDispatcher rd=request.getRequestDispatcher("front.jsp");
            rd.forward(request, response);
           
        }
        catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e1)
        {
            System.err.println("userid already exist!!");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        finally {
            /*try{
                con.close();
            }
            catch(SQLException e)
            {
                System.err.println(e);
            }*/
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
