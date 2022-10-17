package com.gl.CaseStudyNew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.CaseStudyNew.bean.Bills;
import com.gl.CaseStudyNew.bean.Offer;
import com.gl.CaseStudyNew.service.RechargeService;





@RestController
public class RechargeController {
	@Autowired
	private RechargeService service;
	
	@GetMapping("/welcome-page")
	public ModelAndView showWelcomePage() {
		ModelAndView mv=new ModelAndView("welcomePage");
		List<Offer> offerList=service.findAll();
		mv.addObject("offerList",offerList);
		return mv;
	}
	
	@PostMapping("/performRecharge")
	public ModelAndView billview(@RequestParam("offerId") long id,@RequestParam("mobileNumber") String str) {
		Integer num=Integer.parseInt(str);
		long did=service.generateTransactionId();
		Bills bill=new Bills(did,num,id);
		service.save(bill);
		Offer offer=service.findById(id);
		ModelAndView mv = new ModelAndView("/BillPage");
		mv.addObject("offer", offer);
		mv.addObject("Bill", bill);
		return mv;
	}
	
	
}
