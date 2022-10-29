package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.InsurancePlan;

public interface InsuranceRepo extends JpaRepository<InsurancePlan, Integer> {

}
