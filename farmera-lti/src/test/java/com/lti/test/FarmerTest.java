package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.GenericDao;
import com.lti.entity.Farmer;



public class FarmerTest {

	@Test
	public void addFarmer() {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		Farmer farmer1= new Farmer();
		farmer1.setFullName("Mohit Singh");
		farmer1.setContactNo("9434847532");
		farmer1.setEmailId("mohit123@gmail.com");
		farmer1.setAddress("Station Road");
		farmer1.setCity("Hyderabad");
		farmer1.setState("Telengana");
		farmer1.setPinCode(500025);
		farmer1.setLandAddress("NewAge Farms");
		farmer1.setLandArea("10 Hectares");
		farmer1.setLandPincode(500012);
		farmer1.setAccountNo(2071453278);
		farmer1.setIfsc("SBIN0057841");
		farmer1.setAadhar("Mohit_Aadhar.pdf");
		farmer1.setPan("Mohit_Pan.pdf");
		farmer1.setCertificate("Mohit_Certificate");
		farmer1.setPassword("mohit@123");
		farmer1.setApprovedStatus('N');

		Farmer farmer2= new Farmer();
		farmer2.setFullName("Ram Kumar");
		farmer2.setContactNo("9434764390");
		farmer2.setEmailId("ram345@gmail.com");
		farmer2.setAddress("Bazaar Road");
		farmer2.setCity("Delhi");
		farmer2.setState("Delhi");
		farmer2.setPinCode(110025);
		farmer2.setLandAddress("Real Estate Farms");
		farmer2.setLandArea("25 Hectares");
		farmer2.setLandPincode(110055);
		farmer2.setAccountNo(1091458721);
		farmer2.setIfsc("SBIN006184");
		farmer2.setAadhar("Ram_Aadhar.pdf");
		farmer2.setPan("Ram_Pan.pdf");
		farmer2.setCertificate("Ram_Certificate");
		farmer2.setPassword("ram@345");
		farmer2.setApprovedStatus('N');

		Farmer farmer3= new Farmer();
		farmer3.setFullName("Suresh Prasad");
		farmer3.setContactNo("9434543475");
		farmer3.setEmailId("suresh578@gmail.com");
		farmer3.setAddress("Park Street");
		farmer3.setCity("Kolkata");
		farmer3.setState("West Bengal");
		farmer3.setPinCode(700021);
		farmer3.setLandAddress("Sharda Farms");
		farmer3.setLandArea("50 Hectares");
		farmer3.setLandPincode(700035);
		farmer3.setAccountNo(1075847951);
		farmer3.setIfsc("SBIN002450");
		farmer3.setAadhar("Suresh_Aadhar.pdf");
		farmer3.setPan("Suresh_Pan.pdf");
		farmer3.setCertificate("Suresh_Certificate");
		farmer3.setPassword("suresh@578");
		farmer3.setApprovedStatus('N');

		GenericDao gendao= (GenericDao) ctx.getBean("dao");
		gendao.save(farmer1);
		gendao.save(farmer2);
		gendao.save(farmer3);
	}
	
}