package com.example.Back_Front.ServiciosImpl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Back_Front.Model.Cliente;
import com.example.Back_Front.Repositorios.ClienteRepository;
import com.example.Back_Front.Service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteR;

	@Override
	@Transactional(readOnly  = true)
	public Iterable<Cliente> finAll() {
		// TODO Auto-generated method stub
		return clienteR.findAll();
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return (Page<Cliente>) clienteR.findAll((Sort) pageable);
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteR.save(cliente);
	}

	@Override
	public void deleteById(Integer id) {
		clienteR.deleteById(id);
		
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return clienteR.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return clienteR.findByNombre(nombre);
	}

}
