<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%--Instantiating a bean of type Person ,putting it into SESSION scope and Setting value for all the properties --%>

<jsp:useBean id ="pers" 
class ="example.bean.Person"
 scope="session"/> 

<jsp:setProperty property="*" name="pers"/>

<h1>Person created. To view details <a href ="show_person.jsp">Click Here</a></h1>

</body>
</html>