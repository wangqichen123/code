<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>教师端</title>
    <link rel="stylesheet" type="text/css" href="image/mystyle1.css">

  </head>
  
  <body>
  <%
  request.setCharacterEncoding("utf-8");
  String id=(String)session.getAttribute("id");
  String kind=(String)session.getAttribute("kind");
		if(id!=null&&kind!="teacher")
		{
	%>
    <table width="1024" height="800" bgcolor="#1fa0eb" align="center">
    <tr><td align="center" nowrap="nowrap"><iframe name="topnavi" src="teacher_navi.jsp" width="1024" height="139" scrolling="no" frameborder="0"></iframe></td></tr>
    <tr><td width="1024" height="661">
    <iframe name="mainframe" src="teacher_main.jsp" width="1024" height="661" scrolling="no" frameborder="0"></iframe>
    </td></tr>
    </table>
    <table align="center" width="1030" height="30" bgcolor="#1fa0eb" cellspacing="0" cellpadding="0" border="0"><tr><td background="image/dibian.gif"><div align="center"> 
    <strong><font size="2" color="#808080">Copyright &copy; xxx</font></strong></div>
    </td></tr></table>
    <%
		}
		else
		{
			response.setHeader("refresh","2;URL=login.jsp") ;
	%>
	<div align="center"> 
	<font size="5" color="#ff0000">非法登录！！！<br> 
	两秒后自动跳转到登陆窗口！！！<br></font>
	</div><%
		}
	%>
  </body>
</html>
