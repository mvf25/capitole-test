package com.capitole.technicaltest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Size {
	
	private Integer id;
	private Integer productId;
	private Boolean backSoon;
	private Boolean special;
	
	public static Size csvSize(String id, String productId, String backSoon, String special) {
		return new Size(Integer.parseInt(id), Integer.parseInt(productId), Boolean.parseBoolean(backSoon), Boolean.parseBoolean(special));
	}

}
