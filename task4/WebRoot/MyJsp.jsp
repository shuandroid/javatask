<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
    <form action="Mychange.jsp"  method="post">    
   <p><font size="5" color="blue">Control the information of car</font></p>  
  <p><font size="5" color="blue">Speed:<input type="text" name="speed" /></font></p>      
                                                    
  <p><font size="5" color="blue">Direction:<input type="text" name="direction" /></font></p>
      
  <p><font size="5" color="blue"><input type="submit" value="submit"> </font></p>           
    </form>
  </body>
</html>
