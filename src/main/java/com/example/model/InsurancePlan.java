package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InsurancePlan {
	
	@Id
	private int id;
	private String PlanName;
	private String PlanCategory;
	private String PlanStartDate;
	private String PlanValidity;
	
	//Getters & Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public String getPlanCategory() {
		return PlanCategory;
	}
	public void setPlanCategory(String planCategory) {
		PlanCategory = planCategory;
	}
	public String getPlanStartDate() {
		return PlanStartDate;
	}
	public void setPlanStartDate(String planStartDate) {
		PlanStartDate = planStartDate;
	}
	public String getPlanValidity() {
		return PlanValidity;
	}
	public void setPlanValidity(String planValidity) {
		PlanValidity = planValidity;
	}
	
	//To String Method
	
	@Override
	public String toString() {
		return "InsurancePlan [id=" + id + ", PlanName=" + PlanName + ", PlanCategory=" + PlanCategory
				+ ", PlanStartDate=" + PlanStartDate + ", PlanValidity=" + PlanValidity + "]";
	}
	
	//Default Constructor
	public InsurancePlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor
	public InsurancePlan(int id, String planName, String planCategory, String planStartDate, String planValidity) {
		super();
		this.id = id;
		PlanName = planName;
		PlanCategory = planCategory;
		PlanStartDate = planStartDate;
		PlanValidity = planValidity;
	}
	
}
