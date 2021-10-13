package com.gainjavaknowledge.catalogservice.model;

import com.gainjavaknowledge.catalogservice.entity.CatalogEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreCatalogResponse {

	
	private Store store;
	private CatalogEntity catalog;
}
