package com.gainjavaknowledge.catalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {

	private Integer id;
	private String name;
	private String location;
}
