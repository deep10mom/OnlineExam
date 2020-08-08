package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.rcpl.project.Dbconnection;
import java.sql.Connection;

public final class questionPaper_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: papayawhip;\">\n");
      out.write("    <center>\n");
      out.write("        <h1>QUESTION PAPER </h1>\n");
      out.write("        <h2 style=\"color: red;\">NOTE: DON'T REFRESH THE PAGE</h2>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <h2><pre>    SUBJECT:");
      out.print( request.getParameter("course"));
      out.write("                                    MARKS: 100                                    TIME:</pre></h2>\n");
      out.write("    <br><br><br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <form action=\"evaluationServlet\">\n");
      out.write("        \n");
      out.write("    ");
 Connection con=Dbconnection.getDbConnection();
    try
    {
      
    
    String course=(String)request.getParameter("course");
    int i=0;
    System.out.println(course);  
    
      out.write("<input type=\"hidden\" name=\"course\" value=\"");
      out.print( course );
      out.write('"');
      out.write('>');

    PreparedStatement ps1=con.prepareStatement("select * from question_master where course=? order by RAND() LIMIT 11");
    
            ps1.setString(1, course);
            ResultSet rs=ps1.executeQuery();
           System.out.println(rs.next());
            while(rs.next()){
                i++;
                //String q="qu"+i;
                 
            
             
      out.write("\n");
      out.write("             <h3><pre>");
      out.print( i );
      out.write(")  ");
      out.print( rs.getString(2) );
      out.write("</pre></h3>\n");
      out.write("             \n");
      out.write("             <input type=\"hidden\" name=\"ques");
      out.print(i);
      out.write("\" value=\"");
      out.print( rs.getString(2) );
      out.write("\" /><br>\n");
      out.write("             <input type=\"radio\" name=\"radio");
      out.print( i);
      out.write("\" value=");
      out.print( rs.getString(3) );
      out.write('>');
      out.print( rs.getString(3) );
      out.write("<br>\n");
      out.write("             <input type=\"radio\" name=\"radio");
      out.print( i);
      out.write("\" value=");
      out.print( rs.getString(4) );
      out.write(' ');
      out.write('>');
      out.print( rs.getString(4) );
      out.write("<br>\n");
      out.write("             <input type=\"radio\" name=\"radio");
      out.print( i);
      out.write("\" value=");
      out.print( rs.getString(5) );
      out.write(' ');
      out.write('>');
      out.print( rs.getString(5) );
      out.write("<br>\n");
      out.write("             <input type=\"radio\" name=\"radio");
      out.print( i);
      out.write("\" value=");
      out.print( rs.getString(6) );
      out.write(' ');
      out.write('>');
      out.print( rs.getString(6) );
      out.write("<br>\n");
      out.write("             \n");
      out.write("             ");
 } 
             } catch(Exception e)
             {
                 System.out.println(e);
             }
            
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Submit\"/>    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
