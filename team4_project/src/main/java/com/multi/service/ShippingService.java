package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.ShippingDTO;
import com.multi.frame.MyService;
import com.multi.mapper.ShippingMapper;


@Service
public class ShippingService implements MyService<Integer, ShippingDTO>{
	
	@Autowired
	ShippingMapper mapper;
	
	@Override
	public void register(ShippingDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(ShippingDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public ShippingDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ShippingDTO> get() throws Exception {
		return mapper.selectall();
	}
	public List<ShippingDTO> shippingall(int orderid) throws Exception{
		return mapper.shippingall(orderid);
	}

	

}
