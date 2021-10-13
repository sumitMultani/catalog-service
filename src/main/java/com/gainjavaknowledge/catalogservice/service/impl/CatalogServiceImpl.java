package com.gainjavaknowledge.catalogservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gainjavaknowledge.catalogservice.entity.CatalogEntity;
import com.gainjavaknowledge.catalogservice.model.Store;
import com.gainjavaknowledge.catalogservice.model.StoreCatalogResponse;
import com.gainjavaknowledge.catalogservice.repository.CatalogRepository;
import com.gainjavaknowledge.catalogservice.service.CatalogService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogRepository catalogRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${get.store.url}")
	private String GET_STORE_URL;
	
	@Override
	public CatalogEntity createCatalog(CatalogEntity catalog) {
		log.info("creating the catalog {} : ",catalog);
		return catalogRepository.save(catalog);
	}

	@Override
	public StoreCatalogResponse findById(Integer id) {
		log.info("finding the catalog by id : {}, ",id);
		CatalogEntity catalog = catalogRepository.findById(id).get();
		Store store = restTemplate.getForObject(GET_STORE_URL+catalog.getStoreId(), Store.class);
		return new StoreCatalogResponse(store, catalog);
	}

}
