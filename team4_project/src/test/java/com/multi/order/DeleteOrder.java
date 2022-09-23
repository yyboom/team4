package com.multi.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.OrderService;

@SpringBootTest
class DeleteOrder {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1001);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




