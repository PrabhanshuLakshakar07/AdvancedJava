<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDate,java.time.LocalTime"%>
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
         <%--Displaying HELLO in H1 5 times --%> 
         
         <%
         for(int a=1;a<=5;a++){
        	 
   
         
         %> 
         <h1>HELLO</h1>
         <%
         }
         %>
         
         
         
         <%-- DIsplaying today's date (LocalDate) and current time (LocalTime)  packege is import java.time--%>
         
         <% 
         LocalDate today = LocalDate.now();
         LocalTime now = LocalTime.now();
         %>
         <h1>Today's Date : <%= today %></h1>
         
         <h1>Current Time : <%= now %></h1>
         
</body>
</html>