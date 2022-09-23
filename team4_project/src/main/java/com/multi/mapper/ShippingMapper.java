package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ShippingDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface ShippingMapper extends MyMapper<Integer, ShippingDTO>{
	public List<ShippingDTO> shippingall(int orderid) throws Exception;
	
	
}
