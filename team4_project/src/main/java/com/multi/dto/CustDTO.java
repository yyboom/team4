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
public class CustDTO {

	//기존 CustDTO 조회 컬럼
	private String userid; 
	private int pwd; 
	private String username; 
	private String addr; 
	private Date rdate; 
	private String mobile; 
	private String email;
	
	// 관심목록 JOIN 을 위한 컬럼
	
	 private int interst_id; 
	 private String interst_itemname;
	 
	
}
