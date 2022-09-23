package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.FinalOrderDTO;
import com.multi.frame.MyService;
import com.multi.mapper.FinalOrderMapper;

@Service
public class FinalOrderService implements MyService<Integer, FinalOrderDTO>{
	
	@Autowired
	FinalOrderMapper mapper;

	@Override
	public void register(FinalOrderDTO v) throws Exception {
		mapper.insert(v);
		
	}


	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}


	@Override
	public void modify(FinalOrderDTO v) throws Exception {
		mapper.update(v);
		
	}


	@Override
	public FinalOrderDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}


	@Override
	public List<FinalOrderDTO> get() throws Exception {
		return mapper.selectall();
	}
	
	public List<FinalOrderDTO> cartall(int orderid) throws Exception {
		return mapper.cartall(orderid);
	}


}
