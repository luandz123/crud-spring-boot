package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {
	

}
