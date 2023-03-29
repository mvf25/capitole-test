package com.capitole.technicaltest.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {
	
	private Integer id;
	private Integer sequence;
	
	public static Product csvProduct(String id, String sequence) {
		return new Product(Integer.parseInt(id), Integer.parseInt(sequence));
	}
	

}
