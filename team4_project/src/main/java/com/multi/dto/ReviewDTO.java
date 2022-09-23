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
public class ReviewDTO {
		
	private int reviewid;
	private int itemid;
	private int userid;
	private int rating;
	private int content;
	
	private String username;
	private String itemname;
	private int size;
}
