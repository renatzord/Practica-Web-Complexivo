package com.example.Back_Front.Service;

import java.awt.print.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.Back_Front.Model.Cliente;




public interface ClienteService {
	public Iterable<Cliente> finAll();
	public Page<Cliente> findAll(Pageable pageable);
	public Cliente save(Cliente cliente);
	public void deleteById(Integer id);
	public Cliente findById(int id);
	public List<Cliente> findByNombre(String nombre);
}
