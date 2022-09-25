package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer,CartDTO> {
	public List<CartDTO> usercart(String userid) throws Exception;
	
	//selectcart에서 가져오고 싶은 것만 가져올때
	//public selectcart selectcart(String userid);


	
}
