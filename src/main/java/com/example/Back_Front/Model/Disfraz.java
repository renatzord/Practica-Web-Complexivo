package com.example.Back_Front.Model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="disfraz", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Disfraz implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_disfraz")
	private Long id_disfraz;
	
	private String codigo;
	private String descripcion;
	private Integer precio;
	private String tipo_d;
	
	
	
	public Long getId_disfraz() {
		return id_disfraz;
	}
	public void setId_disfraz(Long id_disfraz) {
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
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getTipo_d() {
		return tipo_d;
	}
	public void setTipo_d(String tipo_d) {
		this.tipo_d = tipo_d;
	}
	
	
	
	
}
