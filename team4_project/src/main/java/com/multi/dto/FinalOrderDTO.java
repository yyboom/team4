package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FinalOrderDTO {
	
	//finalorderdto
	private int finalid;
	private int orderid;
	private int itemid;
	private int totalcnt;
	private int totalprice;

	//add component
	private String user_name;
	private String order_addr;
	private String recipient_people;//수령인
}
