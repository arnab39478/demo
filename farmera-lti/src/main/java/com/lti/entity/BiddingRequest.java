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
	private Bidder bidder;

	public int getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public char getFinalAcceptanceStatus() {
		return finalAcceptanceStatus;
	}

	public LocalDate getFinalAcceptanceDate() {
		return finalAcceptanceDate;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setFinalAcceptanceStatus(char finalAcceptanceStatus) {
		this.finalAcceptanceStatus = finalAcceptanceStatus;
	}

	public void setFinalAcceptanceDate(LocalDate finalAcceptanceDate) {
		this.finalAcceptanceDate = finalAcceptanceDate;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}

	

}