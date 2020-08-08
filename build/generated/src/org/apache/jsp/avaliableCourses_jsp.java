package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.rcpl.project.Dbconnection;
import java.sql.Connection;

public final class avaliableCourses_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mastering an Education Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>\n");
      out.write("<!-- custom-theme -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Mastering Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //custom-theme -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/JiSlider.css\" rel=\"stylesheet\"> \n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\n");
      out.write("\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\n");
      out.write("<!-- font-awesome-icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!-- //font-awesome-icons -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800\" rel=\"stylesheet\">\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "userHeader.jsp", out, false);
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h4><b>");
if(request.getAttribute("msg")!=null)
            out.println(request.getAttribute("msg")); 
      out.write("</b></h4>\n");
      out.write("            <br>\n");
      out.write("        <center>\n");
      out.write("            <h2 style=\"color: purple;\"><b>COURSES AVALIABLE</b></h2>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("              \n");
      out.write("  <table class=\"table table-hover\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("          <th></th>\n");
      out.write("          <th style=\"color:red;\">COURSE</th>\n");
      out.write("        <th style=\"color:red;\">DESCRIPTION</th>\n");
      out.write("        <th style=\"color:red;\">APPLICATION STATUS</th>\n");
      out.write("        \n");
      out.write("        <th style=\"color:red;\">OPERATION</th>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 Connection con=Dbconnection.getDbConnection();
        try
        {
            String userid=(String)session.getAttribute("uname");
            
            PreparedStatement ps=con.prepareStatement("select * from course_master");
            
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
if(rs.getString(3).equals("Applied")){
      out.write("\n");
      out.write("           <form action=\"\">    <tr>\n");
      out.write("                   <td><input type=\"hidden\" name=\"course\" value=");
      out.print( rs.getString(1) );
      out.write("></td><td style=\"color: green;\">");
      out.print( rs.getString(1) );
      out.write("</td><td style=\"color: green;\">");
      out.print( rs.getString(2) );
      out.write("</td><td style=\"color: green;\">");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                   \n");
      out.write("                 \n");
      out.write("                   <td><button type=\"submit\" class=\"btn btn-success\">Apply</button></td>\n");
      out.write("                   \n");
      out.write("               </tr>\n");
      out.write("           </form> ");
 } else
{
      out.write("  \n");
      out.write("\n");
      out.write("              <form action=\"avaliableServlet\">    <tr>\n");
      out.write("                   <td><input type=\"hidden\" name=\"course\" value=");
      out.print( rs.getString(1) );
      out.write("></td><td style=\"color: green;\">");
      out.print( rs.getString(1) );
      out.write("</td><td style=\"color: green;\">");
      out.print( rs.getString(2) );
      out.write("</td><td style=\"color: green;\">");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                   \n");
      out.write("                 \n");
      out.write("                   <td><button type=\"submit\" class=\"btn btn-success\">Apply</button></td>\n");
      out.write("                   \n");
      out.write("               </tr>\n");
      out.write("           </form> \n");
      out.write("                   ");
 }
        }
        }catch(Exception e)
        {
            System.out.println(e) ; 
        }
        
      out.write("  \n");
      out.write("           \n");
      out.write("            \n");
      out.write("\n");
      out.write("         \n");
      out.write("    \n");
      out.write("       \n");
      out.write("     \n");
      out.write("      \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("           \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("<br><br><br>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </center>\n");
      out.write("   \n");
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
