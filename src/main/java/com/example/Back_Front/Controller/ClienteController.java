package com.example.Back_Front.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Back_Front.Model.Cliente;
import com.example.Back_Front.Repositorios.ClienteRepository;
import com.example.Back_Front.Service.ClienteService;



@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteR;
	
	@Autowired
	private ClienteService clienteS;
	
	@GetMapping("/getcliente")
	List<Cliente> getAll(){
		return clienteR.findAll();
	}
	
	@PostMapping("/crearcliente")
	@ResponseStatus(HttpStatus.CREATED)
	Cliente create(@RequestBody Cliente clientes) {
		clienteR.save(clientes);
		 return clientes;
	}
	
	@PutMapping("/editarcliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente editar(@RequestBody Cliente clientes, @PathVariable int id) {
		Cliente pedidoactual = clienteS.findById(id);
		pedidoactual.setApellidos(clientes.getApellidos());
		pedidoactual.setEstado(clientes.getEstado());
		pedidoactual.setNombre(clientes.getNombre());
		pedidoactual.setDireccion(clientes.getDireccion());
		pedidoactual.setCedula(clientes.getCedula());
		return clienteS.save(pedidoactual);
	}
	
	@GetMapping ("/buscarcliente/{id}")
	public Cliente show(@PathVariable int id) {
		return clienteS.findById(id);
	}
	
	@DeleteMapping("/eliminarcliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id) {
		clienteS.deleteById(id);
	}
	
	@GetMapping("buscarxnombre/{nombre}")
	public List <Cliente> show(@PathVariable String nombre){return clienteS.findByNombre(nombre);}
	
}
