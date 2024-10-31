package com.example.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Store;
import com.example.crud.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService  {

	@Autowired 
	private StoreRepository storeRepository;
	
	@Override 
	public  List<Store> getAllSp() {
		return storeRepository.findAll();
	}
	
	@Override
	public Store saveSp( Store store) {
		return storeRepository.save(store);
	
	}
	
	@Override
	public String deleteSp(int id) {
		Store store = storeRepository.findById(id).orElseThrow( () -> new RuntimeException("khong tim thay san pham co id nay"));
		storeRepository.delete(store);
		return "xoa san pham thanh cong";
	}
	
	@Override
	public String updateSp(int id, Store newStore ) {
		Store spHienTai = storeRepository.findById(id).orElseThrow( () -> new RuntimeException ("khong tim thay id"));
		spHienTai.setTenSanPham(newStore.getTenSanPham());
		spHienTai.setSoLuong(newStore.getSoLuong());
		spHienTai.setTonKho(newStore.getTonKho());
		storeRepository.save(spHienTai);
		return " update thanh cong";
		
	}
}
