package com.gl.CaseStudyNew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.CaseStudyNew.bean.Bills;
import com.gl.CaseStudyNew.bean.Offer;
import com.gl.CaseStudyNew.dao.BillRepository;
import com.gl.CaseStudyNew.dao.OfferRepository;



@Service
public class RechargeService {
	@Autowired
	private BillRepository repository1;
	@Autowired
	private OfferRepository repository2;
	
	public void save(Bills bill) {
		repository1.save(bill);
	}
	public List<Offer> findAll(){
		return repository2.findAll();
	}
	
	public Offer findById(Long id){
		return repository2.getById(id);
	}
	
	public Long generateTransactionId(){
		Long val=repository1.findMaxBillId();
		if(val==null)
			val=100001L;
		else
			val=val+1;
		return val;
		}


}
