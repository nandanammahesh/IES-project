package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dto.Plan;
import com.example.service.PlanService;

@Controller
public class ViewPlanController {
	@Autowired
	private PlanService planService;
	
	@GetMapping("/editPlan")
	public String editPlan(@RequestParam("pid") Integer planId, Model model) {
		Plan plan = planService.getPlanById(planId);
		model.addAttribute("plan", plan);
		return "index1";
	}

	@GetMapping("/deletePlan")
	public String deletePlan(@RequestParam("pid") Integer planId,RedirectAttributes rattr) {
		rattr.addFlashAttribute("delsucc1", "Deleted plan successfully");
		planService.deletePlan(planId);
		return "redirect:viewPlans";
	}

}
