package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
class UpdateItem {
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(1002, 40, "조끼", 20000, 230,"카키", "주문가능", null);
		try {
			service.modify(item);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
