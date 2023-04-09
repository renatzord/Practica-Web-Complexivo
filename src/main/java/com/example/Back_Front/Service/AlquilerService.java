package com.example.Back_Front.Service;

import java.awt.print.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.Back_Front.Model.Alquiler;




public interface AlquilerService {
	public Iterable<Alquiler> finAll();
	public Page<Alquiler> findAll(Pageable pageable);
	public Optional<Alquiler> findById(Integer id);
	public Alquiler save(Alquiler alquiler);
	public void deleteById(Integer id);
	public Alquiler findById(int id);
	
}
