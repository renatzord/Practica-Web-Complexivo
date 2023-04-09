package com.example.Back_Front.ControlVista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Back_Front.Control.ClienteCtrl;

@Controller
//@RequestMapping("/app")
public class ClienteControllerVista {
	
//	@Value("${texto.htmlcontoller.index.titulo}")
//	private String textoIndex;
//	
//	@Value("${texto.htmlcontoller.perfil.titulo}")
//	private String textoPerfil;
//	
//	@Value("${texto.htmlcontoller.index.titulo}")
//	private String textoLista;

	public static List<ClienteCtrl> ListCl = new ArrayList<>();
	
	@GetMapping("/cliente")
	 public String home(Model model) {
        model.addAttribute("message", "Hola Thymeleaf!");
        return "Cliente";
    }
	
	
	
	
	@GetMapping("/postcliente")
	public String poscliente(Model model) {
		
		
		return "Cliente";
				
	}
	
	
	@GetMapping("/ListaClientes")
	public String Lista(Model model) {
		
		return "ListaClientes";
				
	}
	
	@GetMapping("/rellanarcliente")
	public String rellena(Model model) {
		
		model.addAttribute("ListCl", ListCl);
		return "ListaClientes";
				
	}
	
//	@ModelAttribute("clientes")
//	public List<ClienteCtrl> poblarcliente(){
//		
//		List<ClienteCtrl> clientes = Arrays.asList(new ClienteCtrl(1,111111 ,"Renato","Llivisaca", "El Puerto", true),
//				new ClienteCtrl(2,22222 ,"Elizabhet","Rojas", "Los tres Puentes", true),
//				new ClienteCtrl(3,3333 ,"Alejandro","Llivisaca", "Miraflores", true),
//				new ClienteCtrl(4,4444 ,"Lucia","Rodriguez", "Cuenca", true));
//	
//		return clientes;
//	}
//	
	@PostMapping("/Guardarcliente")
	public String guardar(Model model, @RequestParam String cedula, @RequestParam String nombre, @RequestParam String apellidos, @RequestParam String direccion, @RequestParam Boolean estado) {
		
		ClienteCtrl cliente = new ClienteCtrl();
		int result = ListCl.size()+1;
		cliente.setId_cliente(result);
		cliente.setNombre(nombre);
		cliente.setApellidos(apellidos);
		cliente.setApellidos(apellidos);
		cliente.setDireccion(direccion);
		cliente.setEstado(estado);
		
		ListCl.add(cliente);
		model.addAttribute("ListCl", ListCl);
		
		
		return "redirect:/rellanarcliente";
		
	}
	
	

	
	
	
	
}