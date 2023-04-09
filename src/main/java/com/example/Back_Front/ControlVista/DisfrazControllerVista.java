package com.example.Back_Front.ControlVista;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Back_Front.Control.ClienteCtrl;
import com.example.Back_Front.Control.DisfrazCtrl;

@Controller
@RequestMapping("/app")
public class DisfrazControllerVista {

	public static List<DisfrazCtrl> ListDisfraz = new ArrayList<>();
	
	
	@GetMapping("/disfraz")
	 public String disfraz(Model model) {
       model.addAttribute("message", "Hola Thymeleaf!");
       return "Disfraz";
   }
	
	
	@GetMapping("/ListaDisrfaz")
	public String Lista(Model model) {
		
		return "ListaDisfraz";
				
	}
	
	@GetMapping("/rellanardisfraz")
	public String rellena(Model model) {
		
		model.addAttribute("ListDisfraz", ListDisfraz);
		return "ListaDisfraz";
				
	}
	
	@PostMapping("/Guardardisfraz")
	public String guardar(Model model, @RequestParam String codigo, @RequestParam String descripcion, @RequestParam Integer precio, @RequestParam String tipo_d) {
		
		DisfrazCtrl disfraz = new DisfrazCtrl();
		int result = ListDisfraz.size()+1;
		disfraz.setId_disfraz(result);
		disfraz.setCodigo(codigo);
		disfraz.setDescripcion(descripcion);
		disfraz.setPrecio(precio);
		disfraz.setTipo_d(tipo_d);
		
		ListDisfraz.add(disfraz);
		model.addAttribute("ListDisfraz", ListDisfraz);
		
		
		return "redirect:/app/rellanardisfraz";
		
	}
	
}
