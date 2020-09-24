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
@Table(name = "Sell_Request")
public class SellRequest {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "req")
	@SequenceGenerator(name= "req", sequenceName = "request_seq", allocationSize= 10)
	@Column(name = "Request_Id")
	private int requestId;
	
	@ManyToOne
	@JoinColumn(name = "Farmer_EmailId")
	private Farmer farmer;
	
	@Column(name = "Request_Date")
	private LocalDate requestDate;
	
	@Column(name = "Crop_Date")
	private String cropType;
	
	@Column(name = "Crop_Name")
	private String cropName;
	
	private String quantity;
	
	@Column(name = "Base_Price")
	private String basePrice;
	
	@Column(name = "Fertilizer_Type")
	private String fertilizerType;
	
	@Column(name = "Soil_pH_Certificate")
	private String soilpHCertificate;
	
	@Column(name = "Selling_Deadline")
	private LocalDate sellingDeadline;
	
	@Column(name = "Approved_Status")
	private char approvedStatus;
	
	@Column(name = "Bidding_Deadline")
	private LocalDate biddingDeadline;
	
	@Column(name = "Bidding_Status")
	private char biddingStatus;

	public int getRequestId() {
		return requestId;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public LocalDate getRequestDate() {
		return requestDate;
	}

	public String getCropType() {
		return cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getBasePrice() {
		return basePrice;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public String getSoilpHCertificate() {
		return soilpHCertificate;
	}

	public LocalDate getSellingDeadline() {
		return sellingDeadline;
	}

	public char getApprovedStatus() {
		return approvedStatus;
	}

	public LocalDate getBiddingDeadline() {
		return biddingDeadline;
	}

	public char getBiddingStatus() {
		return biddingStatus;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public void setSoilpHCertificate(String soilpHCertificate) {
		this.soilpHCertificate = soilpHCertificate;
	}

	public void setSellingDeadline(LocalDate sellingDeadline) {
		this.sellingDeadline = sellingDeadline;
	}

	public void setApprovedStatus(char approvedStatus) {
		this.approvedStatus = approvedStatus;
	}

	public void setBiddingDeadline(LocalDate biddingDeadline) {
		this.biddingDeadline = biddingDeadline;
	}

	public void setBiddingStatus(char biddingStatus) {
		this.biddingStatus = biddingStatus;
	}

	
	
	

}
