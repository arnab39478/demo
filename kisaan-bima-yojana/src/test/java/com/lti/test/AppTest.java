package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.GenericDao;
import com.lti.entity.Farmer;

public class AppTest {
	
	@Test
	public void addFarmer() {
		Farmer farmer1=new Farmer();
		farmer1.setFullName("Mohit Rathore");
		farmer1.setContactNo("9786543210");
		farmer1.setEmailId("mohit123@gmail.com");
		farmer1.setAddress("D/5, Gulmarg Lane");
		farmer1.setCity("Hyderabad");
		farmer1.setState("Telengana");
		farmer1.setPinCode(500475);
		farmer1.setLandAddress("Newage Farms");
		farmer1.setLandArea("10 Hectares");
		farmer1.setLandPincode(500045);
		farmer1.setAccountNo(1045785321);
		farmer1.setIfsc("SBIN0004562");
		farmer1.setAadhar("Mohit_Aadhar.pdf");
		farmer1.setPan("Mohit_PAN.pdf");
		farmer1.setCertificate("Mohit_Certificate.pdf");
		farmer1.setPassword("mohit@123");
		farmer1.setApprovedStatus('N');
		
		Farmer farmer2=new Farmer();
		farmer2.setFullName("Ram Singh");
		farmer2.setContactNo("9475807965");
		farmer2.setEmailId("ram789@gmail.com");
		farmer2.setAddress("A/5, Bazaar Road");
		farmer2.setCity("Chandigarh");
		farmer2.setState("Punjab");
		farmer2.setPinCode(160578);
		farmer2.setLandAddress("Real Estate Farms");
		farmer2.setLandArea("25 Hectares");
		farmer2.setLandPincode(160054);
		farmer2.setAccountNo(2045763985);
		farmer2.setIfsc("SBIN0004215");
		farmer2.setAadhar("Ram_Aadhar.pdf");
		farmer2.setPan("Ram_PAN.pdf");
		farmer2.setCertificate("Ram_Certificate.pdf");
		farmer2.setPassword("ram@789");
		farmer2.setApprovedStatus('N');
		
		Farmer farmer3=new Farmer();
		farmer3.setFullName("Suresh Kumar");
		farmer3.setContactNo("9487457015");
		farmer3.setEmailId("suresh321@gmail.com");
		farmer3.setAddress("D/15, Chandni Chowk");
		farmer3.setCity("Kolkata");
		farmer3.setState("West Bengal");
		farmer3.setPinCode(700832);
		farmer3.setLandAddress("Golden Farms");
		farmer3.setLandArea("20 Hectares");
		farmer3.setLandPincode(700705);
		farmer3.setAccountNo(1058763420);
		farmer3.setIfsc("SBIN0006725");
		farmer3.setAadhar("Suresh_Aadhar.pdf");
		farmer3.setPan("Suresh_PAN.pdf");
		farmer3.setCertificate("Suresh_Certificate.pdf");
		farmer3.setPassword("suresh@321");
		farmer3.setApprovedStatus('N');
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		GenericDao farmerDao=(GenericDao) ctx.getBean("dao");
		farmerDao.save(farmer1);
		farmerDao.save(farmer2);
		farmerDao.save(farmer3);
		
	}
	
	@Test
	public void addBidder() {
		
	}
	
	@Test
	public void obtainFarmerDetails() {

		
	}
	
	@Test
	public void obtainBidderDetails() {
		
	}
	
	

}
