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
	private String userid;
	private int rating;
	private String content;
	
	private String user_name;
	private String item_name;
	private int size;
}
