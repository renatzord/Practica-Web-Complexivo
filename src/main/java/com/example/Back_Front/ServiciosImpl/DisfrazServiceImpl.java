package com.example.Back_Front.ServiciosImpl;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Back_Front.Model.Disfraz;
import com.example.Back_Front.Repositorios.DisfrazRepository;
import com.example.Back_Front.Service.DisfrazService;



@Service
public class DisfrazServiceImpl implements DisfrazService{
	
	@Autowired
	private DisfrazRepository  disfrazR;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Disfraz> finAll() {
		// TODO Auto-generated method 
		return disfrazR.findAll();
	}

	@Override
	public Page<Disfraz> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return (Page<Disfraz>) disfrazR.findAll((Sort) pageable);
	}

	@Override
	public Optional<Disfraz> findById(Integer id) {
		// TODO Auto-generated method stub
		return disfrazR.findById(id);
	}

	@Override
	public Disfraz save(Disfraz disfraz) {
		// TODO Auto-generated method stub
		return disfrazR.save(disfraz);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		disfrazR.deleteById(id);
	}

	@Override
	public Disfraz findById(int id) {
		// TODO Auto-generated method stub
		return disfrazR.findById(id).orElse(null);
	}



}
