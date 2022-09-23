package com.multi.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderDTO;
import com.multi.service.OrderService;

@SpringBootTest
class InsertOrder {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		OrderDTO order = new OrderDTO();
		try {
			service.register(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




