<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'change.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  
  <p><font size="5" color="green">the information for car are  as flow：</font></p>
  <p><font size="5" color="blue">Speed :</font> <font size="5" color="red"><%=session.getAttribute("speed")%> </font></p>  
                                                    
  <p><font size="5" color="blue">Direction : </font><font size="5" color="red"><%=session.getAttribute("direction")%></font></p>
      
  <p> <input type="submit" value="change" /></p> 
           
    
    </body>
</html>
