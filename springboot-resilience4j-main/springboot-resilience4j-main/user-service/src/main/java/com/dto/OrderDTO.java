package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
	public OrderDTO(int id, String name, String category, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.color = color;
		this.price = price;
	}
    
    
}
