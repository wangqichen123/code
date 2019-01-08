<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="msc.vo.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
  </head>
  <jsp:useBean id="scdao" scope="page" class="msc.dao.ScDAO"></jsp:useBean>
  <jsp:useBean id="sdao" scope="page" class="msc.dao.StudentDAO"></jsp:useBean>
  <body bgcolor="#8dd8f8">
  <%
request.setCharacterEncoding("utf-8");
String sid=request.getParameter("sid");
Vector student=sdao.Select(sid,"","");
Student stu=new Student();
if(student.size()!=0){
    stu=(Student)student.elementAt(0);
}
Vector all=scdao.SelectCourse(sid);
int n=all.size();
Sc cou[]=new Sc[n];
 %>
   <div align="center"><font size="5" color="#000080" face="华文楷体"><b><%=stu.getSname() %>课程信息如下：<br><br></b></font></div>
     <table border="1" cellspacing="0" cellpadding="0" align="center">
     <tr align="center"><td width="100">课序号</td><td width="150">课程名</td><td width="100">课程学分</td><td width="100">平时成绩</td><td width="100">期末成绩</td><td width="100">最终成绩</td></tr>
	<%
	for(int j=0;j<n;j++){
	cou[j]=(Sc)all.elementAt(j);
	String rcno = cou[j].getCno() ;
	String rcname = cou[j].getCname() ;
    double rcredit=cou[j].getCredit();
    double rpscore=cou[j].getPscore();
    double rlscore=cou[j].getLscore();
    double rescore=cou[j].getEscore();
	%>
            	<tr align="center">
		    		<td><%=rcno%></td>
		    		<td><%=rcname%></td>
		       		<td><%=rcredit%></td>
					<td><%=rpscore%></td>
					<td><%=rlscore%></td>
		    		<td><%=rescore%></td>
					
				</tr>
	<% 
	}
	if(n==0){	
	%>
	<tr><th colspan="7">无课程信息！</th></tr>
	<%} %>
	</table>
  </body>
</html>
