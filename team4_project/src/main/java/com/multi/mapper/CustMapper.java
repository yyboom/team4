package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CustDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CustMapper extends MyMapper<String,CustDTO> {
	public List<CustDTO> selectcust(String userid) throws Exception;
}
