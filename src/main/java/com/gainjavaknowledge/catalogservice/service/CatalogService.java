package com.gainjavaknowledge.catalogservice.service;

import com.gainjavaknowledge.catalogservice.entity.CatalogEntity;
import com.gainjavaknowledge.catalogservice.model.StoreCatalogResponse;

public interface CatalogService {

	CatalogEntity createCatalog(CatalogEntity catalog);

	StoreCatalogResponse findById(Integer id);

}
