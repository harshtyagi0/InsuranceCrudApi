package com.example.service;

import java.util.List;

import com.example.model.InsurancePlan;

public interface InsuranceService {
	

	public String add(InsurancePlan ip);
    public List<InsurancePlan> view();
    public String delete(int id);
 	public String update(InsurancePlan ip);

}
