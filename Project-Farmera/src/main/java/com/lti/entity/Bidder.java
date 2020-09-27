package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Bidder {
	@Column(name = "Full_Name")
	private String fullName;
	
	@Column(name = "Contact_No")
	private String contactNo;
	
	@Id
	@Column(name = "Email_Id")
	private String emailId;
	
	private String address;
	private String city;
	private String state;
	
	@Column(name = "Pin_Code")
	private int pinCode;
	
	@Column(name = "Account_No")
	private long accountNo;
	
	private String ifsc;
	private String aadhar;
	private String pan;
	private String traderLicense;
	private String password;
	
	@Column(name = "Approved_Status")
	private char approvedStatus;
	
	@OneToMany(mappedBy = "bidders", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@Column(name = "Bidding_Request")
	private List<BiddingRequest> biddingRequests;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTraderLicense() {
		return traderLicense;
	}

	public void setTraderLicense(String traderLicense) {
		this.traderLicense = traderLicense;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getApprovedStatus() {
		return approvedStatus;
	}

	public void setApprovedStatus(char approvedStatus) {
		this.approvedStatus = approvedStatus;
	}

	public List<BiddingRequest> getBiddingRequests() {
		return biddingRequests;
	}

	public void setBiddingRequests(List<BiddingRequest> biddingRequests) {
		this.biddingRequests = biddingRequests;
	}

}
