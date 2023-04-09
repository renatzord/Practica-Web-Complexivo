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

import com.example.Back_Front.Model.Alquiler;
import com.example.Back_Front.Repositorios.AlquilerRepository;
import com.example.Back_Front.Service.AlquilerService;



@RestController
@RequestMapping("/api/alquiler")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AlquilerController {

	@Autowired
	AlquilerRepository alquilerR;
	
	@Autowired
	AlquilerService alquilerS;
	
	@GetMapping("/getpedido")
	List<Alquiler> getAll(){
		return alquilerR.findAll();
	}
	
	@PostMapping("/crearalquiler")
	@ResponseStatus(HttpStatus.CREATED)
	Alquiler create(@RequestBody Alquiler alquileres) {
		alquilerR.save(alquileres);
		 return alquileres;
	}
	
	@PutMapping("/editaralquiler/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Alquiler editar(@RequestBody Alquiler pedidos, @PathVariable int id) {
		Alquiler pedidoactual = alquilerS.findById(id);
		pedidoactual.setCantidad_dis(pedidos.getCantidad_dis());
		pedidoactual.setComentarios_alq(pedidos.getComentarios_alq());
		pedidoactual.setFecha_d(pedidos.getFecha_d());
		pedidoactual.setFecha_p(pedidos.getFecha_p());
		pedidoactual.setTotal_alq(pedidos.getTotal_alq());
		return alquilerS.save(pedidoactual);
	}
	
	@GetMapping ("/buscaralquiler/{id}")
	public Alquiler show(@PathVariable int id) {
		return alquilerS.findById(id);
	}
	@DeleteMapping("/eliminarpedido/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id) {
		alquilerS.deleteById(id);
	}
	

	
	
}
