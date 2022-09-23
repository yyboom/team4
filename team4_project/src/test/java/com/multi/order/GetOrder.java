package com.multi.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderDTO;
import com.multi.service.OrderService;

@SpringBootTest
class GetOrder {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		OrderDTO order = null;
		try {
			order = service.get(1001);
			System.out.println(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(order);
	}

}
