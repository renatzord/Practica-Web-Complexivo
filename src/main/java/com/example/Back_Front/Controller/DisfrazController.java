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

import com.example.Back_Front.Model.Disfraz;
import com.example.Back_Front.Repositorios.DisfrazRepository;
import com.example.Back_Front.Service.DisfrazService;




@RestController
@RequestMapping("/api/disfraz")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DisfrazController {

	@Autowired
	private DisfrazRepository disfrazR;
	
	@Autowired
	private DisfrazService disfrazS;
	
	@GetMapping("/getdisfraz")
	List<Disfraz> getAll(){
		return disfrazR.findAll();
	}
	
	@PostMapping("/creardisfraz")
	@ResponseStatus(HttpStatus.CREATED)
	Disfraz create(@RequestBody Disfraz disfraz) {
		disfrazR.save(disfraz);
		 return disfraz;
	}
	
	@PutMapping("/editardisfraz/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Disfraz editar(@RequestBody Disfraz disfrazes, @PathVariable int id) {
		Disfraz pedidoactual = disfrazS.findById(id);
		pedidoactual.setDescripcion(disfrazes.getDescripcion());
		pedidoactual.setCodigo(disfrazes.getCodigo());
		pedidoactual.setPrecio(disfrazes.getPrecio());
		pedidoactual.setTipo_d(disfrazes.getTipo_d());
		return disfrazS.save(pedidoactual);
	}
	
	@GetMapping ("/buscardisfraz/{id}")
	public Disfraz show(@PathVariable int id) {
		return disfrazS.findById(id);
	}
	
	@DeleteMapping("/eliminardisfraz/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void eliminar(@PathVariable int id) {
		disfrazS.deleteById(id);
	}
	

	
	
}
