package com.gainjavaknowledge.catalogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gainjavaknowledge.catalogservice.entity.CatalogEntity;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Integer> {

}
