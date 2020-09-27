package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name=" Bidding_Request")
public class BiddingRequest {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "bidreq")
	@SequenceGenerator(name= "bidreq", sequenceName = "bidding_request_seq", allocationSize= 1)
	@Column(name="bid_id")
	private int id;
	
	@Column(name="bidder_email_id")
	private String emailId;
	
	@Column(name="bid_amount")
	private double amount;
	
	@Column(name="bid_date")
	private LocalDate date;
	
	@Column(name="final_acceptance_status")
	private char finalAcceptanceStatus;
	
	@Column(name= "final_acceptance_date")
	private LocalDate finalAcceptanceDate;
	
	@ManyToOne
	@JoinColumn(name = "Bidder_EmailId")
	private Bidder bidders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public char getFinalAcceptanceStatus() {
		return finalAcceptanceStatus;
	}

	public void setFinalAcceptanceStatus(char finalAcceptanceStatus) {
		this.finalAcceptanceStatus = finalAcceptanceStatus;
	}

	public LocalDate getFinalAcceptanceDate() {
		return finalAcceptanceDate;
	}

	public void setFinalAcceptanceDate(LocalDate finalAcceptanceDate) {
		this.finalAcceptanceDate = finalAcceptanceDate;
	}

	public Bidder getBidders() {
		return bidders;
	}

	public void setBidders(Bidder bidders) {
		this.bidders = bidders;
	}
	
}
