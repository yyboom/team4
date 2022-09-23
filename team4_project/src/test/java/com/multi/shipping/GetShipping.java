package com.multi.shipping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ShippingDTO;
import com.multi.service.ShippingService;

@SpringBootTest
class GetShipping {
	@Autowired
	ShippingService service;
	
	@Test
	void contextLoads() {
		ShippingDTO shipping = null;
		try {
			shipping = service.get(1202);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(shipping);
	}

}
