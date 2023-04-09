package com.example.Back_Front.ControlVista;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.example.Back_Front.Control.AlquilerCtrl;
import com.example.Back_Front.Control.ClienteCtrl;
import com.example.Back_Front.Control.DisfrazCtrl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
@RequestMapping("/app")
public class AlquilerControllerVista {
 
	
	List<ClienteCtrl> ListaClientes = ClienteControllerVista.ListCl;
	
	List<DisfrazCtrl> ListaDisfraz = DisfrazControllerVista.ListDisfraz;
	
	public List<AlquilerCtrl> listaAqluiler = new ArrayList<>();
	
	@GetMapping("/alquiler")
	 public String alquiler(Model model) {
      model.addAttribute("message", "Hola Thymeleaf!");
      model.addAttribute("ListaClientes", ListaClientes);
      model.addAttribute("ListaDisfraz", ListaDisfraz);
      return "Alquiler";
  }
	
	@GetMapping("/ListaAlquiler")
	public String Lista(Model model) {
		
		return "ListaAlquiler";
				
	}
	
	@GetMapping("/rellanaralquiler")
	public String rellena(Model model) {
		model.addAttribute("listaAqluiler", listaAqluiler);
		return "ListaAlquiler";
				
	}
	
	
	@PostMapping("/guardarAlquiler")
	public String guardaralquiler(Model model, @RequestBody Integer id_cliente, @RequestBody Integer id_disfraz, 
			@RequestParam String fecha_p,
			@RequestParam String fecha_d, @RequestParam String Comentarios, @RequestParam Integer Cantidad) throws ParseException {
		
		AlquilerCtrl alquiler = new AlquilerCtrl();
		ClienteCtrl cliente = new ClienteCtrl();
		DisfrazCtrl disfraz = new DisfrazCtrl();
		
		int prec = 0;
		
		for (int i = 0; i < ListaClientes.size(); i++){
			
			if(ListaClientes.get(i).getId_cliente() == id_cliente) {
				cliente.setId_cliente(ListaClientes.get(i).getId_cliente());
				cliente.setCedula(ListaClientes.get(i).getCedula());
				cliente.setNombre(ListaClientes.get(i).getNombre());
				cliente.setApellidos(ListaClientes.get(i).getApellidos());
				cliente.setDireccion(ListaClientes.get(i).getDireccion());
				cliente.setEstado(ListaClientes.get(i).getEstado());
				
			}
		}
		
		for (int i = 0; i < ListaDisfraz.size(); i++){
			if(ListaDisfraz.get(i).getId_disfraz()== id_disfraz) {
				disfraz.setId_disfraz(ListaDisfraz.get(i).getId_disfraz());
				disfraz.setCodigo(ListaDisfraz.get(i).getCodigo());
				disfraz.setPrecio(ListaDisfraz.get(i).getPrecio());
				disfraz.setTipo_d(ListaDisfraz.get(i).getTipo_d());
				disfraz.setDescripcion(ListaDisfraz.get(i).getDescripcion());
				prec = ListaDisfraz.get(i).getPrecio();
			}	
		}
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date fecha1 = dateFormat.parse(fecha_p);
		 java.util.Date fecha2 = dateFormat.parse(fecha_p);
		
		 Integer result = listaAqluiler.size()+1;
		 Integer totalAlq= prec* Cantidad;
		 
		 alquiler.setId_alquiler(result);
		 alquiler.setId_cliente(id_cliente);
		 alquiler.setId_disfraz(id_disfraz);
		 alquiler.setFecha_d(fecha1);
		 alquiler.setFecha_p(fecha2);
		 alquiler.setCantidad(Cantidad);
		 alquiler.setComentarios(Comentarios);
		 alquiler.setTotal(totalAlq);
		 
		 listaAqluiler.add(alquiler);
		 model.addAttribute("listaAqluiler", listaAqluiler);
		
		 
		return "redirect:/app/rellanaralquiler";
	}
	
	
	
	
	
	
}
