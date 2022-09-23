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
	private String userid;
	private int itemid;
	private int orderprice;
	private String pay;
	private Date bdate;
	private String orderaddr;
	private int totalcnt;
	private String phonenum;
	private String people;
	
	
	
	// JOIN 문을 위한 컬럼 = CUST기반
	
	
	private String username;
	private String itemname;
	private String itemstatus;
	
	
	
}
