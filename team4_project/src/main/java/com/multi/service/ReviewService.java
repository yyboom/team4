package com.multi.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.multi.dto.CateDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CateMapper;

public class ReviewService implements MyService<Integer,CateDTO> {

	@Autowired
	CateMapper mapper;
	
	@Override
	public void register(CateDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(CateDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public CateDTO get(Integer k) throws Exception {
		
		return mapper.select(k);
	}

	@Override
	public List<CateDTO> get() throws Exception {
		
		return mapper.selectall();
	}

}