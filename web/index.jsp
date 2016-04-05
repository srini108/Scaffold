
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.model.Project,com.model.Contract, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Project Contract Data</h1>
       <div style="background-color: #FFBBCC; width:60%;"> 
           <br />
        
        <h2><% if(request.getParameter("message") !=null)
        		out.println(request.getParameter("message"));
        %>  
        </h2>
        <% List<Project> projectList= (List<Project>) request.getAttribute("projectContracts"); 
 
        if (projectList !=null) 
                {
 				for(Project project : projectList) {
               %>
               <table border="1">
 
                   <tbody>
                    <tr>
                           <td>&nbsp; </td>
                           <td>&nbsp;</td>
                       </tr>
                       <tr>
                           <td>Project : </td>
                           <td><% out.println(project.getProjectName()); %></td>
                       </tr>
                       <%
                       		Set<Contract> contractList = project.getContracts();
                       		if(contractList!=null) {
                       	%>	
		                       <tr>
		                           <td>Contract code</td>
		                           <td>Description</td>
		                           <td>Budget</td>
		                           <td>Committed Cost</td>
		                           <td>Forecast</td>
		                           <td>Paid</td>
		                           <td>Completed</td>
		                           <td>Vendor</td>
		                           <td>&nbsp;</td>
		                      </tr>     
                   		<%
                       			for(Contract contract : contractList) {
                       %>
					                       <tr>
					                           <td><% out.println(contract.getCode()); %></td>
					                           <td><% out.println(contract.getDescription()); %></td>
					                           <td><% out.println(contract.getBudget()); %></td>
					                           <td><% out.println(contract.getCost()); %></td>
					                           <td><% out.println(contract.getForecast()); %></td>
					                           <td><% out.println(contract.getPaid()); %></td>
					                           <td><% out.println(contract.getCompletePercentage()); %></td>
					                           <td><% out.println(contract.getVendor()); %></td>
					                           <td><a href="viewContractController?contractId=<%=contract.getProjectContractId()%>"> EDIT </a></td>
					                       </tr>
					  <%
					  				}
					  	  }			
					  %>		                               
                    </tbody>
               </table>
 
     <%
     		 }// For loop
           } // If
 
 
          %>
           <br /><br /><br />
        </div>
       </body>
</html>