<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%-- retriving a bean of type person with id: pers from SESSION scope and fetching its property values... --%>
<jsp:useBean id ="pers" class ="example.bean.Person" scope="session"/> 

 <h1><jsp:getProperty property="name" name="pers"/></h1>
<h1><jsp:getProperty property="age" name="pers"/></h1>
<h1><jsp:getProperty property="weight" name="pers"/></h1>

</body>
</html>