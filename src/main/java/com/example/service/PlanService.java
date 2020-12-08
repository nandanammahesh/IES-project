package com.example.service;

import java.util.List;
import com.example.dto.Plan;

public interface PlanService {
	
	public boolean savePlan(Plan p);
	public List<Plan> getAllPlans();
	public Plan getPlanById(Integer pid);
	public boolean updatePlan(Plan p);
	public boolean deletePlan(Integer pid); 


}
