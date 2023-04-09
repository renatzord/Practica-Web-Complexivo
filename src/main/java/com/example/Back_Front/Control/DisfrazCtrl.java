package com.example.Back_Front.Control;

public class DisfrazCtrl {
private int id_disfraz;
	
	private String codigo;
	private String descripcion;
	private Integer precio;
	private String tipo_d;
	
	
	
	public DisfrazCtrl() {
		super();
	}
	
	
	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}


	public int getId_disfraz() {
		return id_disfraz;
	}
	public void setId_disfraz(int id_disfraz) {
		this.id_disfraz = id_disfraz;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo_d() {
		return tipo_d;
	}
	public void setTipo_d(String tipo_d) {
		this.tipo_d = tipo_d;
	}
	
	
	
	
}
