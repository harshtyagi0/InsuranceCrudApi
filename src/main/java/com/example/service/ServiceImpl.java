package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.InsurancePlan;
import com.example.repo.InsuranceRepo;

@Service
public class ServiceImpl implements InsuranceService {

	@Autowired
	private InsuranceRepo repo;

	// For Adding
	@Override
	public String add(InsurancePlan ip) {
		if (ip != null) {
			repo.save(ip);
		} else {
			return "Unable to saved.....!!";
		}
		return "Saved........!!";
	}

	// For Fetching/Viewing
	@Override
	public List<InsurancePlan> view() {
		try {
			return repo.findAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// For Deleting
	@Override
	public String delete(int id) {
		try {
			repo.deleteById(id);
			return "Deleted...!!";
		} catch (Exception e) {
			return "Not Deleted....!!";
		}
	}

	// For Updation
	@Override
	public String update(InsurancePlan ip) {
		try {
			if (ip != null) {
				int id = (int) ip.getId();

				InsurancePlan ip1 = repo.getById(id);
				ip1.setId(ip.getId());
				ip1.setPlanName(ip.getPlanStartDate());
				ip1.setPlanCategory(ip.getPlanCategory());
				ip1.setPlanStartDate(ip.getPlanStartDate());
				ip1.setPlanValidity(ip.getPlanValidity());

				repo.save(ip1);
				return "Updated Successfully......!!!";
			} else
				return "Unsuccessful";
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed......!!";
		}
	}

}