package com.multi.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShippingDTO {
		private int shipid;
		private int orderid;
		private String stats;
		private String shipdate;
		
		private String order_addr;
		private String recipient_people;
}