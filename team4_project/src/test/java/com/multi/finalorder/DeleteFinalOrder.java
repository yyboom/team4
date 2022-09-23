package com.multi.finalorder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.FinalOrderService;

@SpringBootTest
class DeleteFinalOrder {

	@Autowired
	FinalOrderService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}