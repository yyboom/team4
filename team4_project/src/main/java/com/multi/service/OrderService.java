package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CustDTO;
import com.multi.dto.OrderDTO;
import com.multi.frame.MyService;
import com.multi.mapper.OrderMapper;

@Service
public class OrderService implements MyService<Integer,OrderDTO> {

	
	@Autowired
	OrderMapper mapper;
	
	
	@Override
	public void register(OrderDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
		
	}

	@Override
	public void modify(OrderDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public OrderDTO get(Integer k) throws Exception {
		
		return mapper.select(k);
	}

	@Override
	public List<OrderDTO> get() throws Exception {
		
		return null;
	}

	public List<OrderDTO> orderall(int itemid) throws Exception {
		return mapper.orderall(itemid);
	}

	
	
}
