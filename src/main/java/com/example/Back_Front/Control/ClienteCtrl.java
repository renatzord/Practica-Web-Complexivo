package com.example.Back_Front.Control;

public class ClienteCtrl {
	
private Integer id_cliente ;
	
	private Integer cedula;
	private String nombre;
	private String apellidos;
	private String direccion;
	private Boolean estado;
	
	
	
	
	public ClienteCtrl() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ClienteCtrl(Integer id_cliente, Integer cedula, String nombre, String apellidos, String direccion,
			Boolean estado) {
		super();
		this.id_cliente = id_cliente;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.estado = estado;
	}



	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

}
