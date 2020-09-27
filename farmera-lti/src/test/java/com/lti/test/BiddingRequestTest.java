package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.GenericDao;
import com.lti.entity.BiddingRequest;

public class BiddingRequestTest {

	@Test
	public void addBiddingRequest() {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		BiddingRequest bidreq1= new BiddingRequest();
		bidreq1.setAmount(4000);
		bidreq1.setDate(LocalDate.of(2020, 03, 06));
		bidreq1.setFinalAcceptanceStatus('N');
		bidreq1.setFinalAcceptanceDate(LocalDate.of(2020, 03, 10));

		BiddingRequest bidreq2= new BiddingRequest();
		bidreq2.setAmount(7000);
		bidreq2.setDate(LocalDate.of(2020, 07, 15));
		bidreq2.setFinalAcceptanceStatus('N');
		bidreq2.setFinalAcceptanceDate(LocalDate.of(2020, 07, 22));

		BiddingRequest bidreq3= new BiddingRequest();
		bidreq3.setAmount(5000);
		bidreq3.setDate(LocalDate.of(2020, 05, 10));
		bidreq3.setFinalAcceptanceStatus('N');
		bidreq3.setFinalAcceptanceDate(LocalDate.of(2020, 05, 15));

		GenericDao gendao= (GenericDao) ctx.getBean("dao");
		gendao.save(bidreq1);
		gendao.save(bidreq2);
		gendao.save(bidreq3);
	}

}