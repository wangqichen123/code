/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2018-03-12 09:20:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import msc.vo.*;

public final class teacher_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("msc.vo");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    ");
      msc.dao.TeacherDAO tdao = null;
      tdao = (msc.dao.TeacherDAO) _jspx_page_context.getAttribute("tdao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (tdao == null){
        tdao = new msc.dao.TeacherDAO();
        _jspx_page_context.setAttribute("tdao", tdao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("    <title></title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"image/mystyle1.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  ");

request.setCharacterEncoding("utf-8");
String name=(String)session.getAttribute("na");
String id=(String)session.getAttribute("id");
 String kind=(String)session.getAttribute("kind");
if(id!=null&&kind!="teacher")
		{
String message=null;
message="你可以开设课程或信息查询。";
Vector vector=tdao.Select(id,name);
int i=vector.size();
Teacher tea=new Teacher();
if(i!=0){
tea=(Teacher)vector.elementAt(0);
}
 
      out.write("\r\n");
      out.write("    <table width=\"1024\" height=\"661\" bgcolor=\"#1fa0eb\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr><td><table width=\"1022\" height=\"660\" bgcolor=\"#ffffff\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr><td><table width=\"1014\" height=\"652\" bgcolor=\"#8dd8f8\" align=\"center\">\r\n");
      out.write("    <tr><td><table align=\"center\">\r\n");
      out.write("    <tr><td width=\"724\" height=\"80\" style=\"FILTER: blur(direction=135,strength=8)\" align=\"center\"><i><font size=\"7\" face=\"华文行楷\" color=\"#2e0df7\">欢迎使用学生成绩管理系统！</font></i></td></tr>\r\n");
      out.write("    </table></td></tr>\r\n");
      out.write("     <tr><td><table background=\"image/tips.gif\" align=\"center\" width=\"598\" height=\"169\">\r\n");
      out.write("    <tr><td width=\"30\"></td><td height=\"50\"></td></tr>\r\n");
      out.write("    <tr ><td width=\"30\"></td><td height=\"20\" align=\"left\"><font color=\"#48f9f9\"><font size=\"3\"><strong>欢迎你");
out.print(name); 
      out.write("</strong></font></font></td></tr>\r\n");
      out.write("    <tr><td width=\"30\"></td><td><font color=\"#8000ff\"><strong>当前是<font color=\"red\">选课</font>时期，</strong></font><font size=\"3\" color=\"#8000ff\"><strong>");
      out.print(message );
      out.write("</strong></font></td></tr>\r\n");
      out.write("    <tr><td width=\"30\"></td><td height=\"40\"></td></tr>\r\n");
      out.write("    </table></td></tr>\r\n");
      out.write("    <tr><td><div align=\"center\"><font size=\"6\" color=\"#0000a0\"><br>个人基本信息<br></font></div><br/>\r\n");
      out.write("    <table width=\"600\" border=\"1\" align=\"center\">\r\n");
      out.write("    <tr ><td height=\"50\" width=\"200\"><strong><font size=\"5\">工号:</font></strong></td><td width=\"400\"><font size=\"5\">");
      out.print(tea.getTid() );
      out.write("</font></td></tr>\r\n");
      out.write("    <tr ><td height=\"50\" width=\"200\"><strong><font size=\"5\">姓名:</font></strong></td><td width=\"400\"><font size=\"5\">");
      out.print(tea.getTname() );
      out.write("</font></td></tr>\r\n");
      out.write("    </table></td></tr>\r\n");
      out.write("    <tr><td height=\"150\"></td></tr>\r\n");
      out.write("    </table></td></tr>\r\n");
      out.write("    </table></td></tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    ");

		}
		else
		{
	
      out.write("\r\n");
      out.write("\t<div align=\"center\"> \r\n");
      out.write("\t<font size=\"5\" color=\"#ff0000\">非法登录！！！<br> \r\n");
      out.write("\t点<a target=\"_parent\" href=\"login.jsp\">这里</a>转到登陆页面！<br></font>\r\n");
      out.write("\t</div>");

		}
	
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
