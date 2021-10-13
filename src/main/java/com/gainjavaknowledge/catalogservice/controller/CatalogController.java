package com.gainjavaknowledge.catalogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gainjavaknowledge.catalogservice.entity.CatalogEntity;
import com.gainjavaknowledge.catalogservice.model.StoreCatalogResponse;
import com.gainjavaknowledge.catalogservice.service.CatalogService;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private CatalogService catalogservice;
	
	@PostMapping("/save")
	public CatalogEntity createCatalog(@RequestBody CatalogEntity catalog) {
		return catalogservice.createCatalog(catalog);
	}
	
	@GetMapping("/{catalog-id}")
	public StoreCatalogResponse getStoreCatalog(@PathVariable("catalog-id") Integer id) {
		return catalogservice.findById(id);
	}
}
