package com.example.Back_Front.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/enviar")
public class ParamsController {
	
	
	
	@GetMapping("/")
	public String clientes() {
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam (name="texto", required = false, defaultValue = "Soy Batman!!!") String texto ,Model model) {
		
		model.addAttribute("resultado", "El texto que envio es:"+ texto);
		return "params/ver";
	}
	
	
	@GetMapping("/mix-params")
	public String params(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		
		model.addAttribute("resultado", "El saludo enciado es: '"+ saludo+ "' y el numero es '"+ numero +"'");
		
		return "params/ver";
	}
	
	@GetMapping("mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludo");
		
		Integer numero = null;
		
		try
		{
			numero= Integer.parseInt(request.getParameter("numero"));
		}catch (NumberFormatException e){
			numero = 0;
		}
		
		model.addAttribute("resultado", "El saludo enciado es: '"+ saludo+ "' y el numero es '"+ numero +"'");
		
		return "params/ver";
	}

}
