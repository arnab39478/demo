package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.SellRequestDao;
import com.lti.entity.SellRequest;

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
	public void fetchRequestsByBidder() {
		
	}

}
