package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Farmer {
	
	@Column(name = "Full_Name")
	private String fullName;
	
	@Column(name = "Contact_No")
	private long contactNo;
	
	@Id
	@Column(name = "Email_Id")
	private String emailId;
	
	private String address;
	private String city;
	private String state;
	
	@Column(name = "Pin_Code")
	private int pinCode;
	
	@Column(name = "Land_Address")
	private String landAddress;
	
	@Column(name = "Land_Area")
	private String landArea;
	
	@Column(name = "Land_Pin_Code")
	private int landPincode;
	
	@Column(name = "Account_No")
	private long accountNo;
	
	private String ifsc;
	private String aadhar;
	private String pan;
	private String certificate;
	private String password;
	
	@Column(name = "Approved_Status")
	private char approvedStatus;
	
	public String getFullName() {
		return fullName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPincode() {
		return pinCode;
	}
	public String getLandAddress() {
		return landAddress;
	}
	public String getLandArea() {
		return landArea;
	}
	public int getLandPincode() {
		return landPincode;
	}
	public long getAccNo() {
		return accountNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public String getAadhar() {
		return aadhar;
	}
	public String getPan() {
		return pan;
	}
	public String getCertificate() {
		return certificate;
	}
	public String getPassword() {
		return password;
	}
	public char getApprovedStatus() {
		return approvedStatus;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public void setLandAddress(String landAddress) {
		this.landAddress = landAddress;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	public void setLandPincode(int landPincode) {
		this.landPincode = landPincode;
	}
	public void setAccNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setApprovedStatus(char approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	
	

}
