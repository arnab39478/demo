package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.GenericDao;
import com.lti.entity.SellRequest;

public class SellRequestTest {
	
	@Test
	public void addSellrequest(){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
		SellRequest sellreq1= new SellRequest();
		sellreq1.setRequestDate(LocalDate.of(2020,03,05));
		sellreq1.setCropType("Kharif");
		sellreq1.setCropName("Rice");
		sellreq1.setQuantity("100kg");
		sellreq1.setBasePrice(3000);
		sellreq1.setFertilizerType("Nitrogen");
		sellreq1.setSoilpHCertificate("ph_Mohit.pdf");
		sellreq1.setSellingDeadline(LocalDate.of(2020, 03, 30));
		sellreq1.setApprovedStatus('N');
		sellreq1.setBiddingDeadline(LocalDate.of(2020, 03, 10));
		sellreq1.setBiddingStatus('N');
		
		SellRequest sellreq2= new SellRequest();
		sellreq2.setRequestDate(LocalDate.of(2020,07,15));
		sellreq2.setCropType("Kharif");
		sellreq2.setCropName("Bajra");
		sellreq2.setQuantity("30kg");
		sellreq2.setBasePrice(5000);
		sellreq2.setFertilizerType("Phosphorus");
		sellreq2.setSoilpHCertificate("ph_Ram.pdf");
		sellreq2.setSellingDeadline(LocalDate.of(2020, 07, 30));
		sellreq2.setApprovedStatus('N');
		sellreq2.setBiddingDeadline(LocalDate.of(2020, 07, 22));
		sellreq2.setBiddingStatus('N');
		
		SellRequest sellreq3= new SellRequest();
		sellreq3.setRequestDate(LocalDate.of(2020,03,05));
		sellreq3.setCropType("Rabi");
		sellreq3.setCropName("Wheat");
		sellreq3.setQuantity("150kg");
		sellreq3.setBasePrice(3000);
		sellreq3.setFertilizerType("Potassium");
		sellreq3.setSoilpHCertificate("ph_Suresh.pdf");
		sellreq3.setSellingDeadline(LocalDate.of(2020, 02, 28));
		sellreq3.setApprovedStatus('N');
		sellreq3.setBiddingDeadline(LocalDate.of(2020, 02, 25));
		sellreq3.setBiddingStatus('N');
		
		
		GenericDao gendao= (GenericDao) ctx.getBean("dao");
		gendao.save(sellreq1);
		gendao.save(sellreq2);
		gendao.save(sellreq3);
		
	}

}


/*INSERT INTO Crop_Sell_Request values(102, 'ram345@email.com', DATE '2020-07-15', 'Kharif', 'Bajra', '30kg',
		5000, 'Phosphorus', 'ph_ram.pdf', DATE '2020-07-30','N', DATE '2020-07-22','N');
INSERT INTO Crop_Sell_Request values(103, 'suresh578@email.com', DATE '2020-02-20', 'Rabi', 'Wheat', '150kg',
		3000, 'Potassium', 'ph_suresh.pdf', DATE '2020-02-28','N', DATE '2020-02-25','N');

ALTER TABLE Crop_Sell_Request ADD CONSTRAINT Crop_Sell_Request_fk0 FOREIGN KEY (farmer_emailid) REFERENCES Farmer(email_id)*/