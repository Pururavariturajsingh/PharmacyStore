/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-05-17 06:04:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setDateHeader("Expires", 0);
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <title>ADMIN HOME </title>\r\n");
      out.write("    <!-- bootstrap.min css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage/adminhome/plugins/bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <!-- Icofont Css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage/adminhome/plugins/fontawesome/css/all.css\">\r\n");
      out.write("    <!-- animate.css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage/adminhome/plugins/animate-css/animate.css\">\r\n");
      out.write("    <!-- Icofont -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage/adminhome/plugins/icofont/icofont.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main Stylesheet -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage/adminhome/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#container {\r\n");
      out.write("    background-color: rgba(0, 0, 0, 0.8);\r\n");
      out.write("    color: white;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("}\r\n");
      out.write("#container #navbar-brand {\r\n");
      out.write("    margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");

			if(!session.isNew() || session.getAttribute("ADMIN") != null)
			{
		
      out.write("		\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg fixed-top trans-navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"adminhome.jsp\r\n");
      out.write("            1\">\r\n");
      out.write("		\r\n");
      out.write("                <h3 style=\"color:white;\">ADMIN HOME</h3>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#mainNav\" aria-controls=\"mainNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\">\r\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </span>\r\n");
      out.write("              </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-end\" id=\"mainNav\">\r\n");
      out.write("                <ul class=\"navbar-nav \">\r\n");
      out.write("                	<li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link smoth-scroll\" href=\"addcategoryform.jsp\">Add Category</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link smoth-scroll\" href=\"deletecategoryform.jsp\">Delete Category</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link smoth-scroll\" href=\"vieworders.jsp\">View Unconfirmed Orders</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link smoth-scroll\" href=\"additemtoproduct.jsp\">Add Products</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link smoth-scroll\" href=\"viewallproductsadmin.jsp\">View Available Products</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("		\r\n");
      out.write("			<ul class=\"navbar-nav-right\">\r\n");
      out.write("      			\r\n");
      out.write("					<li><a class=\"nav-link smoth-scroll\" href=\"logoutadmin.jsp\"><span\r\n");
      out.write("					class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("<!--MAIN BANNER AREA START -->\r\n");
      out.write("<div class=\"banner-area banner-3\">\r\n");
      out.write("    <div class=\"overlay dark-overlay\"></div>\r\n");
      out.write("    <div class=\"d-table\">\r\n");
      out.write("        <div class=\"d-table-cell\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-8 m-auto text-center col-sm-12 col-md-12\">\r\n");
      out.write("                        <div class=\"banner-content content-padding\">\r\n");
      out.write("                            <h5 class=\"subtitle\">...</h5>\r\n");
      out.write("                         <h1 class=\"banner-title\">Admin operations are done through this page.</h1>\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-white btn-circled\">Get started</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--MAIN HEADER AREA END -->\r\n");
      out.write("<!--  ABOUT AREA START  -->\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  FOOTER AREA START  -->\r\n");
      out.write("<section id=\"footer\" class=\"section-padding\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                <div class=\"footer-copy\">\r\n");
      out.write("                  2021  ©  All Rights Reserved.\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!--  FOOTER AREA END  -->\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <!-- \r\n");
      out.write("    Essential Scripts\r\n");
      out.write("    =====================================-->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Main jQuery -->\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap 4.3.1 -->\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/bootstrap/js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("   <!-- Woow animtaion -->\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/counterup/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/counterup/jquery.easing.1.3.js\"></script>\r\n");
      out.write("     <!-- Counterup -->\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/counterup/jquery.waypoints.js\"></script>\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/counterup/jquery.counterup.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Map -->\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/google-map/gmap3.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAkeLMlsiwzp6b3Gnaxd86lvakimwGA6UA&callback=initMap\"></script>   \r\n");
      out.write("    <!-- Contact Form -->\r\n");
      out.write("    <script src=\"Homepage/adminhome/plugins/jquery/contact.js\"></script>\r\n");
      out.write("    <script src=\"Homepage/adminhome/js/custom.js\"></script>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		");

			}
			else{
		
      out.write("\r\n");
      out.write("			<p style=color:red> You need to login first !!! </p>\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminlogin.html", out, false);
      out.write("\r\n");
      out.write("		");
				
			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
