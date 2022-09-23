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
public class ItemDTO {
	private int itemid;
	private int cateid;
	private String itemname;
	private int itemprice;
	private int size;
	private String color;
	private String itemstatus;
	
	private String cate_name;
}
