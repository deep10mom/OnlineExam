package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"main_section_agile\">\n");
      out.write("\t\t<div class=\"w3_agile_banner_top\">\n");
      out.write("\t\t\t<div class=\"agile_phone_mail\">\n");
      out.write("\t\t\t\t<ul class=\"agile_forms\">\n");
      out.write("\t\t\t\t\t<li><a class=\"active\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal2\"><i class=\"fa fa-sign-in\" aria-hidden=\"true\"></i> Sign In</a> </li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal3\"><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Sign Up</a> </li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>+(000) 123 456 232</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:education@w3layouts.com\">Education@w3layouts.com</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"agileits_w3layouts_banner_nav\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header navbar-left\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h1><a class=\"navbar-brand\" href=\"index.html\"><i>O</i><span>line Exam</span></a></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<nav class=\"menu--iris\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav menu__list\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu__item menu__item--current\"><a href=\"index.html\" class=\"menu__link\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu__item\"><a href=\"services.html\" class=\"menu__link\">Mydetails</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu__item\"><a href=\"gallery.html\" class=\"menu__link\">Update</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown menu__item\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\">Short Codes <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu agile_short_dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"icons.html\">Icons</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"typography.html\">Typography</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu__item\"><a href=\"mail.html\" class=\"menu__link\">Mail Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3_agileits_search\">\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"search\" name=\"Search\" placeholder=\"Search here...\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\" \">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("</div>");
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
