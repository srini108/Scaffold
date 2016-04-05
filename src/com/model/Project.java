package com.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Project  implements java.io.Serializable {


  private int id;
  private String projectName;
  private Set<Contract> contracts = 
		new HashSet<Contract>();
  
  	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Set<Contract> getContracts() {
		return contracts;
	}
	public void setContracts(Set<Contract> contracts) {
		this.contracts = contracts;
	}

	  
	  
}
