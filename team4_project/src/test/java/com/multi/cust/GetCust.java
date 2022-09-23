package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class GetCust {
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<CustDTO> cust = null;
		try {
			cust = service.selectcust("id04");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(CustDTO c:cust) {
			System.out.println(c);
		}
	
	}

}

