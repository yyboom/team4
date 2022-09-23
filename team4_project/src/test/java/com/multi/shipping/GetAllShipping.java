package com.multi.shipping;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ShippingDTO;
import com.multi.service.ShippingService;

@SpringBootTest
class GetAllShipping {
	@Autowired
	ShippingService service;
	
	@Test
	void contextLoads() {
		List<ShippingDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(ShippingDTO c:list) {
			System.out.println(c);
		}
	}
}
