package com.model;

public class Contract  implements java.io.Serializable {


  private int projectContractId;
  private String code;
  private String description;
  private double budget;
  private double cost;
  private double forecast;
  private double paid;
  private double completePercentage;
  private String vendor;
  private Project project;
  
		public int getProjectContractId() {
			return projectContractId;
		}
		public void setProjectContractId(int projectContractId) {
			this.projectContractId = projectContractId;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getBudget() {
			return budget;
		}
		public void setBudget(double budget) {
			this.budget = budget;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public double getForecast() {
			return forecast;
		}
		public void setForecast(double forecast) {
			this.forecast = forecast;
		}
		public double getPaid() {
			return paid;
		}
		public void setPaid(double paid) {
			this.paid = paid;
		}
		public double getCompletePercentage() {
			return completePercentage;
		}
		public void setCompletePercentage(double completePercentage) {
			this.completePercentage = completePercentage;
		}
		public String getVendor() {
			return vendor;
		}
		public void setVendor(String vendor) {
			this.vendor = vendor;
		}
		public Project getProject() {
			return project;
		}
		public void setProject(Project project) {
			this.project = project;
		}
		  
}
