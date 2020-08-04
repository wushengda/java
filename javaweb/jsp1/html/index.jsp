<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>第一个 JSP程序</title>
</head>
<body>

<%
	//页面重定向到main.jsp，地址栏会变
	//response.sendRedirect("base/main.jsp");

	//页面转发到main.jsp，地址栏不会变
	request.getRequestDispatcher("/base/main.jsp").forward(request, response);
%>

<%!
	//定义全局变量
	int myName = 111;
%>

<% int sum = 8; %>

<h3>
	<% out.print(sum++); %>
</h3>

<h3>
	<%= this.myName %>
</h3>


</body>
</html>
