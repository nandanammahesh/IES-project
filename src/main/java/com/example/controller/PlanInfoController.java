package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dto.Plan;
import com.example.service.PlanService;

@Controller
public class PlanInfoController {
	@Autowired
	private PlanService planService;

	// for display form
	@GetMapping("loadPlanForm")
	public String loadPlanForm(Model model) {
		Plan planObj = new Plan();
		model.addAttribute("plan", planObj);
		return "index1";
	}

	// for submit button
	@PostMapping("savePlan")
	public String handleSubmitButton(@ModelAttribute("plan") Plan p, RedirectAttributes rattr) {
		boolean isSaved = planService.savePlan(p);
		if (isSaved) {
			if(p.getPlanId()!=null) {
			rattr.addFlashAttribute("succmsg1", "plan is updated successfully");
		}
			else {
				rattr.addFlashAttribute("succmsg1", "plan is saved successfully");
			}
		}
			else {
			rattr.addFlashAttribute("errmsg1", "failed to save plan");
		}
		
		return "redirect:loadPlanForm";
	}

	// for view all contacts hyper link
	@GetMapping("/viewPlans")
	public String handleViewPlansHyperLink(Model model) {
		List<Plan> allPlans=planService.getAllPlans();
		model.addAttribute("plans", allPlans);
		return "viewPlans";

	}

}
