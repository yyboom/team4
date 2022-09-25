package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class InsertCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDTO order = new CustDTO(null, 0, null, null, null, null, null, 0, null);
		try {
			service.register(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




