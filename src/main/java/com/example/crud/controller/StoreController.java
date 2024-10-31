package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Service.StoreService;
import com.example.crud.model.Store;

@RestController
@CrossOrigin
@RequestMapping("/store")
public class StoreController {
	@Autowired
	private StoreService storeService;
	
	@GetMapping("/getAll")
	public List<Store> getAllSp(){
		return storeService.getAllSp();
	}
	
	@PostMapping("/add")
	public String saveSp(@RequestBody Store store) {
		storeService.saveSp(store);
		return " them san pham thanh cong";
	}
	
	@DeleteMapping("/{id}")
	public String deleteSp(@PathVariable int id) {
		return storeService.deleteSp(id);
		
	}
	@PutMapping("/{id}")
	public String updateSp(@PathVariable int id , @RequestBody Store newStore) {
		return storeService.updateSp(id,newStore);
		
	}

}
