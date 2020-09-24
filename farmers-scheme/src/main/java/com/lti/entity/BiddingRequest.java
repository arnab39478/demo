package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bidding_Request")
public class BiddingRequest {
	
	@Id
	@GeneratedValue
	@Column(name = "Bid_Id")
	private int bidId;
	
	@ManyToOne
	@JoinColumn(name = "Bidder_EmailId")
	private Bidder bidder;
	
	@ManyToOne
	@JoinColumn(name = "SellRequest_Id")
	private SellRequest sellRequest;
	
	@Column(name = "Bid_Amt")
	private int bidAmt;
	
	@Column(name = "Bid_Date")
	private LocalDate bidDate;
	
	@Column(name = "Bid_In_Process")
	private int bidInProcess;
	
	@Column(name = "Approved_Status")
	private char approvedStatus;

	public int getBidId() {
		return bidId;
	}

	public Bidder getBidder() {
		return bidder;
	}

	public SellRequest getSellRequest() {
		return sellRequest;
	}

	public int getBidAmt() {
		return bidAmt;
	}

	public LocalDate getBidDate() {
		return bidDate;
	}

	public int getBidInProcess() {
		return bidInProcess;
	}

	public char getApprovedStatus() {
		return approvedStatus;
	}

	public void setBidId(int bidId) {
		this.bidId = bidId;
	}

	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}

	public void setSellRequest(SellRequest sellRequest) {
		this.sellRequest = sellRequest;
	}

	public void setBidAmt(int bidAmt) {
		this.bidAmt = bidAmt;
	}

	public void setBidDate(LocalDate bidDate) {
		this.bidDate = bidDate;
	}

	public void setBidInProcess(int bidInProcess) {
		this.bidInProcess = bidInProcess;
	}

	public void setApprovedStatus(char approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	
	
	
	

}
