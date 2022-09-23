package com.multi.shipping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ShippingDTO;
import com.multi.service.ShippingService;

@SpringBootTest
class InsertShipping {

	@Autowired
	ShippingService service;
	
	@Test
	void contextLoads() {
		ShippingDTO item = new ShippingDTO(0,1010,"배송준비중","2022-09-11", null, null);
		try {
			service.register(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}





