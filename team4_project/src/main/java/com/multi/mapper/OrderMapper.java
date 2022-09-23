package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.OrderDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface OrderMapper extends MyMapper<Integer,OrderDTO> {

}
