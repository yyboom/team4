package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.FinalOrderDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface FinalOrderMapper extends MyMapper<Integer,FinalOrderDTO> {
	public List<FinalOrderDTO> cartall(int orderid) throws Exception;
}
