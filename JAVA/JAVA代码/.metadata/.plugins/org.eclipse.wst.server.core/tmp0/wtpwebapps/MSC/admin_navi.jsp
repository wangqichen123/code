<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="image/mystyle2.css">
    <title></title>
  </head>
  
  <body>
   <%
  request.setCharacterEncoding("utf-8");
  String id=(String)session.getAttribute("id");
  String kind=(String)session.getAttribute("kind");
 if(id!=null&&kind!="admin")
		{
	%>
    <table width="1024"  align="center" border="0" cellspacing="0" cellpadding="0">
    <tr><td><table border="0" cellpadding="0" cellspacing="0"  bgcolor="#a1e3f9">
    <tr><td width="1024" height="110" background="image/admin.jpg" align="center">
    <table><tr><td width="624" height="85" ></td><td></td></tr>
    <tr><td width="624" ></td><td><%@include file="time.jsp" %></td></tr>
    </table>
    </td></tr>
    <tr><td>
    <table width="1024"  height="20"  align="center">
	<tr><td>
	<div id="Whatever">
	<ul class="TabBarLevel1" id="TabPage1">
	    <li id="Tab0" class="Selected"><a target="mainframe" href="admin_main.jsp" onclick="javascript:switchTab('TabPage1','Tab0');">&nbsp;&nbsp;<strong> 首&nbsp;页</strong>&nbsp;&nbsp;</a></li>
		<li id="Tab1"><a target="mainframe" href="admin_stu.jsp" onclick="javascript:switchTab('TabPage1','Tab1');">&nbsp; <strong>学 生 管 理</strong>&nbsp;</a></li>
		<li id="Tab2"><a target="mainframe" href="admin_tea.jsp" onclick="javascript:switchTab('TabPage1','Tab2');">&nbsp; <strong>教 师 管 理</strong>&nbsp;</a></li>
		<li id="Tab3"><a target="mainframe" href="admin_cou.jsp" onclick="javascript:switchTab('TabPage1','Tab3');">&nbsp; <strong>课 程 管 理</strong>&nbsp;</a></li>
		<li id="Tab5"><a target="mainframe" href="admin_menu.jsp" onclick="javascript:switchTab('TabPage1','Tab5');">&nbsp;<strong>修 改 密 码</strong>&nbsp;</a></li>
		<li id="Tab6"><a target="_parent" href="menu_slt?action=quit" onclick="javascript:switchTab('TabPage1','Tab6');">&nbsp;<strong>退 出</strong>&nbsp;</a></li>
	</ul>
</div>
<script language="JavaScript"> 
//Switch Tab Effect
function switchTab(tabpage,tabid){
        var oItem = document.getElementById(tabpage);   
	for(var i=0;i<oItem.children.length;i++){
		var x = oItem.children(i);	
		x.className = "";
		var y = x.getElementsByTagName('a');
		y[0].style.color="#333333";
	}	
	document.getElementById(tabid).className = "Selected";
}
</script>
</td></tr>
</table>
</td></tr>
</table></td></tr></table>
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
