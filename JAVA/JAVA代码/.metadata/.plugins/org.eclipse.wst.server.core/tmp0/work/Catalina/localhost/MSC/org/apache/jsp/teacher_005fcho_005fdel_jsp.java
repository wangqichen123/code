/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2018-03-12 09:20:17 UTC
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

public final class teacher_005fcho_005fdel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("     ");
      msc.dao.TcDAO tcdao = null;
      tcdao = (msc.dao.TcDAO) _jspx_page_context.getAttribute("tcdao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (tcdao == null){
        tcdao = new msc.dao.TcDAO();
        _jspx_page_context.setAttribute("tcdao", tcdao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("    <title></title>\r\n");
      out.write(" <script language=\"JavaScript\">\r\n");
      out.write(" <!-- Hide \r\n");
      out.write("function delalert(value)\r\n");
      out.write(" { \r\n");
      out.write("    if (value == true) \r\n");
      out.write("       alert(\"打上勾表示删除,小心哟!\");  \r\n");
      out.write(" }\r\n");
      out.write("// -->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body bgcolor=\"#8dd8f8\">\r\n");
      out.write("  ");
 
  request.setCharacterEncoding("utf-8");
  String tid=(String)session.getAttribute("id");
  //String canchoose=(String)session.getAttribute("canchoose");
  String message=null;
//  if(canchoose.equals("选课")){
  Vector all=tcdao.SelectSelf(tid,"");
    int i=all.size();
    Tc cou[]=new Tc[i];
  
      out.write("\r\n");
      out.write("  <div align=\"center\"><font size=\"5\" color=\"#000080\" face=\"华文楷体\"><b>开设课程信息如下：<br><br></b></font></div>\r\n");
      out.write("     <form name=\"formdelcou\" action=\"tc_slt?n=");
      out.print(i );
      out.write("\" method=\"post\" onsubmit=\"return isValid(this);\">\r\n");
      out.write("     <table border=\"1\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("     \r\n");
      out.write("     <tr align=\"center\"><td width=\"100\">课序号</td><td width=\"150\">课程名</td><td width=\"100\">课程学分</td><td width=\"100\">删除</td></tr>\r\n");
      out.write("\t");

	for(int j=0;j<i;j++){
	cou[j]=(Tc)all.elementAt(j);
	String cno = cou[j].getCno() ;
	String cname = cou[j].getCname() ;
    double credit=cou[j].getCredit();
	
      out.write("\r\n");
      out.write("            \t<tr align=\"center\">\r\n");
      out.write("\t\t    \t\t<td>");
      out.print(cno);
      out.write("</td>\r\n");
      out.write("\t\t    \t\t<td>");
      out.print(cname);
      out.write("</td>\r\n");
      out.write("\t\t       \t\t<td>");
      out.print(credit);
      out.write("</td>\r\n");
      out.write("\t\t       \t\t<td><input type=\"checkbox\" name=\"cno");
      out.print(j );
      out.write("\" value=\"");
      out.print(cno );
      out.write("\" onClick=\"return delalert(this.checked)\"/> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t");
 
	}
	if(i==0){	
	
      out.write("\r\n");
      out.write("\t<tr><th colspan=\"10\">无课程信息！</th></tr>\r\n");
      out.write("\t");
}else{ 
      out.write("\r\n");
      out.write("    <tr height=\"15\" ><td colspan=\"4\"><input type=\"hidden\" name=\"action\" value=\"delete\"><input type=\"hidden\" name=\"tid\" value=");
      out.print(tid );
      out.write("></td></tr>\r\n");
      out.write("    <tr><td height=\"25\" colspan=\"2\"><input type=\"reset\" value=\"重&nbsp&nbsp置\"/></td><td colspan=\"2\"><input type=\"submit\" value=\"提&nbsp&nbsp交\"/></td></tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write(" \r\n");
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
