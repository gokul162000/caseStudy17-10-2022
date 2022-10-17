package com.gl.CaseStudyNew.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.CaseStudyNew.bean.Bills;
@Repository
public interface BillRepository extends JpaRepository<Bills, Long> {
	@Query("select max(transactionId) from Bills")
	public Long findMaxBillId();

}
