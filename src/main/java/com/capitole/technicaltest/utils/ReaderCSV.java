package com.capitole.technicaltest.utils;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.stream.StreamSupport;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.csv.CSVFormat;

import com.capitole.technicaltest.model.Product;
import com.capitole.technicaltest.model.Size;
import com.capitole.technicaltest.model.Stock;

public class ReaderCSV {
	
	private final CSVFormat format = CSVFormat.Builder
            .create(CSVFormat.DEFAULT)
            .build();


    public MultiValuedMap readProduct() throws IOException {
    	MultiValuedMap<Integer, Object> result = new ArrayListValuedHashMap<>();
        final Reader file = new FileReader("product.csv");
        
        StreamSupport.stream(format.parse(file).spliterator(), true)
                .map((csvRecord) -> Product.csvProduct(csvRecord.get(0).trim(),csvRecord.get(1).trim()))
                .forEach(product -> result.put(product.getSequence(), product.getId()));
        		//.forEach(System.out.println(entry.getSequence() + "----" + entry.getId()));
        
        return result;
    }
    
    
    public MultiValuedMap readStock() throws IOException {
    	MultiValuedMap<Integer, Object> result = new ArrayListValuedHashMap<>();
        final Reader file = new FileReader("stock.csv");
        
        StreamSupport.stream(format.parse(file).spliterator(), true)
                .map((csvRecord) -> Stock.csvStock(csvRecord.get(0).trim(),csvRecord.get(1).trim()))
                .forEach(stock -> result.put(stock.getSizeId(), stock.getQuantity()));
        
        return result;
    }
    
    public MultiValuedMap readSize() throws IOException {
    	MultiValuedMap<Integer, Object> result = new ArrayListValuedHashMap<>();
        final Reader file = new FileReader("size.csv");
        
        StreamSupport.stream(format.parse(file).spliterator(), true)
                .map((csvRecord) -> Size.csvSize(csvRecord.get(0).trim(),csvRecord.get(1).trim(), csvRecord.get(2).trim(), csvRecord.get(3).trim()))
                .forEach(size -> result.put(size.getProductId(), size));
        
        return result;
    }
    

}