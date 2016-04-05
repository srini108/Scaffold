package com.services;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;
import com.model.Contract;
import com.model.Project;
import com.util.ContractUtil;
import org.hibernate.Query;
/**
 *
 * @author Administrator
 */
public class ContractService {
 
    public String updateContract(Contract contract)
    {
         String message=null;
        Session s=null;
        try
        {
        	System.out.println("Description == "+contract.getDescription());
            s=ContractUtil.getSessionFactory().openSession();
            Transaction tr=s.getTransaction();
            tr.begin();
            s.saveOrUpdate(contract);
            tr.commit();
            message="Saved Contract Data";  
            return message; 
        }
        catch (Exception e)
        {
        	System.out.println("Exception during Save or Update "+e);
            return (e.getMessage());
        }
        finally 
                {
        	System.out.println("In finally");
                    s.close();
                }
    }
    
    public List<Project> listProjectContracts()
    {
          String message=null;
          Session session=null;
          Transaction tx = null;
          Contract contract = null;
		 try {
	         session=ContractUtil.getSessionFactory().openSession();
			 tx = session.getTransaction();
			 tx.begin();
			 List<Project> projectContractList = session.createQuery("from Project").list();
			 tx.commit();
			 return projectContractList;
		 } catch (Exception e) {
			 if (tx != null) {
				 tx.rollback();
			 }
			 e.printStackTrace();
		 } finally {
		 session.close();
		 }
		 return null;
    }
    
    public Contract getContractDetails(int contractId)
    {
          String message=null;
          Session session=null;
          Transaction tx = null;
          Contract contract = null;
		 try {
	         session=ContractUtil.getSessionFactory().openSession();
			 tx = session.getTransaction();
			 tx.begin();
			 Query query = session.createQuery("from Contract WHERE project_contract_id="+contractId);
			 contract = (Contract)query.uniqueResult();
			 tx.commit();
			 return contract;
		 } catch (Exception e) {
			 if (tx != null) {
				 tx.rollback();
			 }
			 e.printStackTrace();
		 } finally {
		 session.close();
		 }
		 return null;
    }    
}