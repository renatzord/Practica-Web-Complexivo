package com.example.Back_Front.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariablesRutaController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo","Enviar Datos a la ruta (@PhatVariable)");
		
		return "variables/index";
	}
	

	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		
		model.addAttribute("titutlo","Recibir parametros en la Rtuta (@PathVariable)");
		
		model.addAttribute("resultado", "El texto enviado  en la ruta es: "+ texto);
		
		return"variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
		public String variablesN(@PathVariable String texto,@PathVariable Integer numero ,Model model) {
				
				model.addAttribute("titulo","Recibir parametros en la Rtuta (@PathVariable)");
				
				model.addAttribute("resultado", "El texto enviado  en la ruta es: "+ texto+" mas este numero: "+ numero);
				
				return"variables/ver";
			}
}
