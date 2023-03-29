package com.capitole.technicaltest.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IProductsService {
	
	List<Integer> getAvailable();

}
