package com.example.Back_Front.ControlVista;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class MenuContollrtVista {
	@GetMapping("/menu")
	 public String menu(Model model) {
     model.addAttribute("message", "Hola Thymeleaf!");
     return "Menu";
 }
}
