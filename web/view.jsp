
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.model.Contract" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div style="background-color: #FFBBCC; width:40%;"> 
           <br />
        <% Contract contract= (Contract) request.getAttribute("contractDetails"); 
 
        if (contract !=null) 
                {
 
               %>
			            <h2>Contract update Form</h2>
			        <form name="updateForm" action="updateContractController"><br />
			            <table>
			            
			            <input type="hidden" name="contractId" value="<%=contract.getProjectContractId()%>">
			            <tr> <td>Project Code : <% out.println(contract.getCode()); %></td> </tr>
			            <tr><td>Description :</td><td><input type="text" name="description" value="<%=contract.getDescription()%>" /></td></tr>
			            <tr><td>Budget:<td><input type="text" name="budget" value="<%=contract.getBudget()%>" /></td></tr>
			            <tr><td>Committed Cost:<td><input type="text" name="committedcost" value="<%=contract.getCost()%>" /></td></tr>
			           <tr><td> Forecast: <td>  <input type="text" name="forecast" value="<%=contract.getForecast()%>" /></td></tr>
			           <tr><td> Paid: <td>  <input type="text" name="paid" value="<%=contract.getPaid()%>" /></td></tr>
			           <tr><td> Completed: <td>  <input type="text" name="completePercentage" value="<%=contract.getCompletePercentage()%>" /></td></tr>
			 
			             <tr><td></td><td><input type="submit" value="submitButton" /> </td></tr>
			            </table>
			          </form>

 
               <%
                       }
 
 
          %>
           <br /><br /><br />
        </div>
 
    </body>
</html>