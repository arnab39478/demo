package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.GenericDao;
import com.lti.entity.Admin;

public class AdminTest {

	@Test
	public void addAdmin() {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		Admin admin= new Admin();
		admin.setEmailId("admin123@gmail.com");
		admin.setPassword("admin@123");

		GenericDao gendao= (GenericDao) ctx.getBean("dao");
		gendao.save(admin);
	}

}