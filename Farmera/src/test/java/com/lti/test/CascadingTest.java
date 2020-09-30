package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.BiddingRequest;
import com.lti.entity.SellRequest;
import com.lti.repository.BiddingRequestDao;
import com.lti.repository.SellRequestDao;

public class CascadingTest {
	
	@Test
	public void fetchSellRequestsByFarmer() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		SellRequestDao srDao=(SellRequestDao) ctx.getBean("srdao");
		List<SellRequest> list = srDao.fetchSellRequestsByFarmer("mohit123@gmail.com");
		for(SellRequest sr:list)
			System.out.println(sr.getCropName()+"\t"+sr.getCropType()+"\t"+sr.getBasePrice());
	}
	
	@Test
	public void fetchSellRequestByBidder() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		SellRequestDao srDao=(SellRequestDao) ctx.getBean("srdao");
		List<SellRequest> list = srDao.fetchSellRequestsBidByBidder("shyam345@gmail.com");
		for(SellRequest sr:list)
			System.out.println(sr.getCropName()+"\t"+sr.getCropType()+"\t"+sr.getBasePrice());

	}
	
	@Test
	public void fetchBiddingRequestsbySellRequest() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		BiddingRequestDao brDao=(BiddingRequestDao) ctx.getBean("brdao");
		List<BiddingRequest> list = brDao.fetchBiddingRequestsForFarmerSellRequest("mohit123@gmail.com");
		for(BiddingRequest br:list)
			System.out.println(br.getAmount()+"\t"+br.getBidDate());
		
	}
	
	@Test
	public void fetchBiddingRequestsByBidder() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		BiddingRequestDao brDao=(BiddingRequestDao) ctx.getBean("brdao");
		List<BiddingRequest> list = brDao.fetchBiddingRequestByBidder("shyam345@email.com");
		for(BiddingRequest br:list)
			System.out.println(br.getAmount()+"\t"+br.getBidDate());
		
	}

}
