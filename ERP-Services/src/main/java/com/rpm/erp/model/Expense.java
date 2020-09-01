package com.rpm.erp.model;

import java.io.Serializable;

public class Expense implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6828377730106753716L;
	
	
	private int id;
	
	private String description;
	
	private String billDetail;
	
	private String paymentMode;
	
	private double debit;
	
	private double credit;
	
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBillDetail() {
		return billDetail;
	}

	public void setBillDetail(String billDetail) {
		this.billDetail = billDetail;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Expense [id=" + id + ", description=" + description + ", billDetail=" + billDetail + ", paymentMode="
				+ paymentMode + ", debit=" + debit + ", credit=" + credit + ", remarks=" + remarks + "]";
	}

	
}
