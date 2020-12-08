package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Plan;
import com.example.persistancelayer.PlanDtlsEntity;
import com.example.persistancelayer.PlanDtlsRepository;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanDtlsRepository planDtlsRepo;

	@Override
	public boolean savePlan(Plan p) {
		PlanDtlsEntity entity = new PlanDtlsEntity();
		/*
		 * entity.setContactName(c.getContactName)
		 * 
		 * entity.setContactEmail(c.getContactEmail)
		 * entity.setContactNum(c.getContactNum)
		 */
		BeanUtils.copyProperties(p, entity);
		PlanDtlsEntity savedEntity = planDtlsRepo.save(entity);
		return savedEntity.getPlanId() != null;

		/*
		 * if (savedEntity)!=null){ return true; } else{ return false;
		 */
	}

	@Override
	public List<Plan> getAllPlans() {
		List<Plan> plansList=new ArrayList<Plan>();
		List<PlanDtlsEntity> entitieslist=planDtlsRepo.findAll();
		entitieslist.forEach(entity->{
			Plan p=new Plan();
			BeanUtils.copyProperties(entity, p);
			plansList.add(p);
		});
	
		return plansList;
	}

	@Override
	public Plan getPlanById(Integer pid) {
		Optional<PlanDtlsEntity> optional=planDtlsRepo.findById(pid);
		if(optional.isPresent()) {
			PlanDtlsEntity entity=optional.get();
			Plan p=new Plan();
			BeanUtils.copyProperties(entity, p);
			return p;
		}
			return null;
	}

	@Override
	public boolean updatePlan(Plan p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePlan(Integer pid) {
		planDtlsRepo.deleteById(pid);
		return true;
	}

}
