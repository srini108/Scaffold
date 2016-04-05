/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
 
import com.services.ContractService;
import com.model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 *
 * @author Administrator
 */
@WebServlet(name = "updateContractController", urlPatterns = {"/updateContractController"})
public class UpdateContractController extends HttpServlet {
 
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
         ContractService cs=new ContractService();
         System.out.println(request.getParameter("contractId"));
         System.out.println(request.getParameter("description"));
         System.out.println(request.getParameter("budget"));
         System.out.println(request.getParameter("committedcost"));
         System.out.println(request.getParameter("forecast"));
         System.out.println(request.getParameter("paid"));
         System.out.println(request.getParameter("completePercentage"));
         
         int contractId=Integer.parseInt(request.getParameter("contractId"));
         String description=request.getParameter("description");
         double budget=Double.parseDouble(request.getParameter("budget"));
         double committedcost=Double.parseDouble(request.getParameter("committedcost"));
         double forecast=Double.parseDouble(request.getParameter("forecast"));
         double paid=Double.parseDouble(request.getParameter("paid"));
         double completePercentage=Double.parseDouble(request.getParameter("completePercentage"));
         
         
	     Contract contr=new Contract();
	     
	     ContractService contrServ=new ContractService();
	     Contract existingContract = contrServ.getContractDetails(contractId);
	     existingContract.setDescription(description);
	     existingContract.setBudget(budget);
	     existingContract.setCost(committedcost);
	     existingContract.setCompletePercentage(completePercentage);
	     existingContract.setForecast(forecast);
	     existingContract.setPaid(paid);
	     System.out.println("Before update contract call");
	     String resultMessage=contrServ.updateContract(existingContract);
	     System.out.println("Return Message "+resultMessage);
         List<Project> cont_obj= cs.listProjectContracts();
         RequestDispatcher rd =request.getRequestDispatcher("index.jsp?message="+resultMessage); 
         request.setAttribute("projectContracts", cont_obj);
	     rd.forward(request, response);
        } finally {            
            out.close();
        }
    }
 
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}