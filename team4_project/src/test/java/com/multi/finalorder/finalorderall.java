package com.multi.finalorder;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.FinalOrderDTO;
import com.multi.service.FinalOrderService;


@SpringBootTest
class finalorderall {

	@Autowired
	FinalOrderService service;
	
	@Test
	void contextLoads() {
		List<FinalOrderDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(FinalOrderDTO c:list) {
			System.out.println(c);
		}
		
	}

}




