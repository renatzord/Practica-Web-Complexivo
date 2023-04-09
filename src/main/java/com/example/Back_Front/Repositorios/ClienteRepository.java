package com.example.Back_Front.Repositorios;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Back_Front.Model.Cliente;




@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	public List<Cliente> findByNombre(String nombre);
}
