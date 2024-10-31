package com.example.crud.Service;

import java.util.List;

import com.example.crud.model.Store;

public interface StoreService  {
	public  List<Store> getAllSp();
	public Store saveSp( Store store);
	public String deleteSp(int id);
	public String updateSp(int id, Store newStore);
}
