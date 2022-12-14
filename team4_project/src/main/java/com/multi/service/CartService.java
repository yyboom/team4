package com.multi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CartDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CartMapper;

@Service
public class CartService implements MyService<Integer, CartDTO>{
	
	@Autowired
	CartMapper mapper;
	@Override
	public void register(CartDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(CartDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public CartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CartDTO> get() throws Exception {
		return mapper.selectall();
	}
	
	public List<CartDTO> usercart(String userid) throws Exception {
		return mapper.usercart(userid);
	}
	
	/*
	 * public CartDTO selectcart(String userid) { return mapper.selectcart(userid);
	 * }
	 */

}
