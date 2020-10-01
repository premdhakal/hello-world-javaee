<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h1>Welcome</h1>
	<h2><%=request.getAttribute("userName")%></h2>
	<br/>
	<h2><bean:message key="index.title"/></h2> 
	<img src="pics/soccer_logo.png" alt="Logo" />
	<br />
	<br />
	<bean:message key="general.copyright"/><br/>
	<% out.println(request.getHeader("User-Agent")); %>
</body>
</html>