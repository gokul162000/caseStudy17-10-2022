package com.gl.CaseStudyNew.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bills {
	@Id
	private Long transactionId  ;
	@Column(columnDefinition = "Int(10)")
	private Integer mobileNumber ;
	private Long offerId ;
	public Bills(Long transactionId, Integer mobileNumber, Long offerId) {
		super();
		this.transactionId = transactionId;
		this.mobileNumber = mobileNumber;
		this.offerId = offerId;
	}
	public Bills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Long getOfferId() {
		return offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	@Override
	public String toString() {
		return "Bill [transactionId=" + transactionId + ", mobileNumber=" + mobileNumber + ", offerId=" + offerId + "]";
	}
	


}
