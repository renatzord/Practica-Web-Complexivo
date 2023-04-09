package com.example.Back_Front.Service;

import java.awt.print.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.Back_Front.Model.Disfraz;




public interface DisfrazService {

	public Iterable<Disfraz> finAll();
	public Page<Disfraz> findAll(Pageable pageable);
	public Optional<Disfraz> findById(Integer id);
	public Disfraz save(Disfraz disfraz);
	public void deleteById(Integer id);
	public Disfraz findById(int id);
	
}
