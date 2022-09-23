package com.multi.shipping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ShippingDTO;
import com.multi.service.ShippingService;

@SpringBootTest
class UpdateShipping {
	@Autowired
	ShippingService service;
	
	@Test
	void contextLoads() {
		ShippingDTO item = new ShippingDTO(1203, 1003, "배송완료","2022-09-02", null, null);
		try {
			service.modify(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
