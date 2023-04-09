package com.example.Back_Front.ServiciosImpl;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Back_Front.Model.Alquiler;
import com.example.Back_Front.Repositorios.AlquilerRepository;
import com.example.Back_Front.Service.AlquilerService;



@Service
public class AlquilerServiceImpl implements AlquilerService{
	
	@Autowired
	AlquilerRepository alquilerR;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alquiler> finAll() {
		// TODO Auto-generated method stub
		return alquilerR.findAll();
	}

	@Override
	public Page<Alquiler> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return (Page<Alquiler>) alquilerR.findAll((Sort) pageable);
	}

	@Override
	public Optional<Alquiler> findById(Integer id) {
		// TODO Auto-generated method stub
		return alquilerR.findById(id);
	}

	@Override
	public Alquiler save(Alquiler alquiler) {
		// TODO Auto-generated method stub
		return alquilerR.save(alquiler);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		alquilerR.deleteById(id);
		
	}

	@Override
	public Alquiler findById(int id) {
		// TODO Auto-generated method stub
		return alquilerR.findById(id).orElse(null);
	}

	

	
}
