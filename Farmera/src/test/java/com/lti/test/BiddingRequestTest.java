package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Bidder;
import com.lti.entity.BiddingRequest;
import com.lti.entity.SellRequest;
import com.lti.repository.GenericDao;

public class BiddingRequestTest {

	@Test
	public void addBiddingRequest() {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		BiddingRequest bidreq1= new BiddingRequest();
		bidreq1.setAmount(4000);
		bidreq1.setBidDate(LocalDate.of(2020, 03, 06));
		bidreq1.setApprovedStatus('N');
		bidreq1.setFinalStatus('N');


		BiddingRequest bidreq2= new BiddingRequest();
		bidreq2.setAmount(7000);
		bidreq2.setBidDate(LocalDate.of(2020, 07, 15));
		bidreq2.setApprovedStatus('N');
		bidreq2.setFinalStatus('N');
		
		BiddingRequest bidreq3= new BiddingRequest();
		bidreq3.setAmount(5000);
		bidreq3.setBidDate(LocalDate.of(2020, 05, 10));
		bidreq3.setApprovedStatus('N');
		bidreq3.setFinalStatus('N');

		GenericDao gendao= (GenericDao) ctx.getBean("dao");
		Bidder bidder1 = gendao.fetchById(Bidder.class, 1);
		Bidder bidder2 = gendao.fetchById(Bidder.class, 2);
		Bidder bidder3 = gendao.fetchById(Bidder.class, 3);
		bidreq1.setBidder(bidder1);
		bidreq2.setBidder(bidder2);
		bidreq3.setBidder(bidder3);
		
		SellRequest sellreq1 = gendao.fetchById(SellRequest.class, 21);
		SellRequest sellreq2 = gendao.fetchById(SellRequest.class, 22);
		SellRequest sellreq3 = gendao.fetchById(SellRequest.class, 23);
		bidreq1.setSellRequest(sellreq1);
		bidreq2.setSellRequest(sellreq2);
		bidreq3.setSellRequest(sellreq3);
		
		gendao.save(bidreq1);
		gendao.save(bidreq2);
		gendao.save(bidreq3);
	}

}