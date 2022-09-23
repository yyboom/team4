package com.multi.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.dto.OrderDTO;
import com.multi.service.OrderService;

@SpringBootTest
class GetAllOrder {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		List<OrderDTO> list = null;
		try {
			list =service.orderall(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(OrderDTO o:list) {
			System.out.println(o);
		}
		
	}

}




