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
public class CartDTO {
	
	//cartdto
	private int cartid;
	private String userid;
	private int itemid;
	private int amount;
	
	//add component
	private String user_name;
	private String item_name;
	private int item_price;
	
	//put in after calculation
	private int total_price;//amount(cart)*itemprice(item)
	

}
