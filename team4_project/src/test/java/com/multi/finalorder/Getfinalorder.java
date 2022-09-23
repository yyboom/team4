package com.multi.finalorder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.FinalOrderDTO;
import com.multi.service.FinalOrderService;

@SpringBootTest
class Getfinalorder {

	@Autowired
	FinalOrderService service;
	
	@Test
	void contextLoads() {
		FinalOrderDTO order = null;
		try {
			order = service.get(3000);
			System.out.println(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
