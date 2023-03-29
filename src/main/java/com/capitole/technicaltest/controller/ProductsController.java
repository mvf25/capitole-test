package com.capitole.technicaltest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capitole.technicaltest.service.IProductsService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping(value = "/capitole")
public class ProductsController {
		
	private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

	@Autowired
	private IProductsService productsService;

			
	@GetMapping(path = "/")
	@Operation(summary = "Products list", description = "All products available")
	public List<Integer> getAllProducts(){	
		return  productsService.getAvailable();
		
	}
	
		
}
