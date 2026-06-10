<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
      <%--Include the resource : background.html --%>
      <%@ include file ="background.html" %>
      
      <%-- defining some variable and a method --%>
      <%!
      int myAge =25;
      public String greetme(String name){
    	  return "Welcome" + name;
      }
      
      %>
      
      <%--Displaying my age and greeting message in H1 tag --%>
      <h1>My Age : <%=myAge %></h1>
      
         <h1>My Age After 50 year : <%=(myAge+50)  %></h1>
         
         
</body>
</html>