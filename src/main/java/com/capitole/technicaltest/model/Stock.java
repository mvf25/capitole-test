package com.capitole.technicaltest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Stock {
	
	private Integer sizeId;
	private Integer quantity;
	
	public static Stock csvStock(String sizeId, String quantity) {
		return new Stock(Integer.parseInt(sizeId), Integer.parseInt(quantity));
	}
	

}
