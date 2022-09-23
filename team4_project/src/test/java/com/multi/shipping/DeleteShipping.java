package com.multi.shipping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ShippingService;

@SpringBootTest
class DeleteShipping {
	@Autowired
	ShippingService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1200);
		}catch(Exception e) {
			
		}
	}

}

