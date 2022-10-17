package com.gl.CaseStudyNew.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.CaseStudyNew.bean.Offer;
@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
	

}
