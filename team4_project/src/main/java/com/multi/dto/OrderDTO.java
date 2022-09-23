package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderDTO {

	// ERD 기반 ORDERPAGE 조회목록
	private int orderid;
	private int orderprice;
	private String pay;
	private Date bdate;
	private String orderaddr;
	private String phonenum;
	private String people;
	private int totalcnt;
	
	
	
	// JOIN 문을 위한 컬럼 = CUST기반
	
	private String userid;
	
	
}
