package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.GenericDao;
import com.lti.entity.Bidder;

public class BidderTest {
	
	@Test
	public void addBidder() {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		Bidder bidder1= new Bidder();
		bidder1.setFullName("Shyam Saxena");
		bidder1.setContactNo("9435674321");
		bidder1.setEmailId("shyam345@email.com");
		bidder1.setAddress("Rajgir Colony");
		bidder1.setCity("Patna");
		bidder1.setState("Bihar");
		bidder1.setPinCode(800007);
		bidder1.setAccountNo(1234561234);
		bidder1.setIfsc("SBIN0055432");
		bidder1.setAadhar("Shyam_Aadhar.pdf");
		bidder1.setPan("Shyam_Pan.pdf");
		bidder1.setTraderLicense("Shyam_License");
		bidder1.setPassword("Shyam@123");
		bidder1.setApprovedStatus('N');
		
		Bidder bidder2= new Bidder();
		bidder2.setFullName("Lakhan Ghosh");
		bidder2.setContactNo("8765234521");
		bidder2.setEmailId("lakhan987@email.com");
		bidder2.setAddress("Stephen Road");
		bidder2.setCity("Kolkata");
		bidder2.setState("West Bengal");
		bidder2.setPinCode(700123);
		bidder2.setAccountNo(1562341231);
		bidder2.setIfsc("SBIN0011314");
		bidder2.setAadhar("Lakhan_Aadhar.pdf");
		bidder2.setPan("Lakhan_Pan.pdf");
		bidder2.setTraderLicense("Lakhan_License");
		bidder2.setPassword("Lakhan@123");
		bidder2.setApprovedStatus('N');
		
		Bidder bidder3= new Bidder();
		bidder3.setFullName("Vijay Kumar");
		bidder3.setContactNo("8757030321");
		bidder3.setEmailId("vijay678@email.com");
		bidder3.setAddress("City Chowk");
		bidder3.setCity("Gurgaon");
		bidder3.setState("Delhi");
		bidder3.setPinCode(110561);
		bidder3.setAccountNo(1234908342);
		bidder3.setIfsc("SBIN0012976");
		bidder3.setAadhar("Vijay_Aadhar.pdf");
		bidder3.setPan("Vijay_Pan.pdf");
		bidder3.setTraderLicense("Vijay_License");
		bidder3.setPassword("Vijay@323");
		bidder3.setApprovedStatus('N');
		
		GenericDao gendao= (GenericDao) ctx.getBean("dao");
		gendao.save(bidder1);
		gendao.save(bidder2);
		gendao.save(bidder3);
		
		
		
	}

}
