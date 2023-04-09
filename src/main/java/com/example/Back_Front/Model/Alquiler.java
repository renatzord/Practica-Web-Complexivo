package com.example.Back_Front.Model;


import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Alquiler")
public class Alquiler implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_alquiler")
	private Long id_alquiler;
	
	@Column(name= "fecha_p")
	@Temporal(TemporalType.DATE)
	private Date fecha_p;
	
	@Column(name= "fecha_d")
	@Temporal(TemporalType.DATE)
	private Date fecha_d;	
	
	private String Comentarios_alq;
	private Integer Cantidad_dis;
	private Integer Total_alq;
	
	@ManyToOne
	@JoinColumn(name="id_cliente",referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_disfraz",referencedColumnName = "id_disfraz")
	private Disfraz disfraz;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Disfraz getDisfraz() {
		return disfraz;
	}
	public void setDisfraz(Disfraz disfraz) {
		this.disfraz = disfraz;
	}
	public Long getId_alquiler() {
		return id_alquiler;
	}
	public void setId_alquiler(Long id_alquiler) {
		this.id_alquiler = id_alquiler;
	}
	public Date getFecha_p() {
		return fecha_p;
	}
	public void setFecha_p(Date fecha_p) {
		this.fecha_p = fecha_p;
	}
	public Date getFecha_d() {
		return fecha_d;
	}
	public void setFecha_d(Date fecha_d) {
		this.fecha_d = fecha_d;
	}
	public String getComentarios_alq() {
		return Comentarios_alq;
	}
	public void setComentarios_alq(String comentarios_alq) {
		Comentarios_alq = comentarios_alq;
	}
	public Integer getCantidad_dis() {
		return Cantidad_dis;
	}
	public void setCantidad_dis(Integer cantidad_dis) {
		Cantidad_dis = cantidad_dis;
	}
	public Integer getTotal_alq() {
		return Total_alq;
	}
	public void setTotal_alq(Integer total_alq) {
		Total_alq = total_alq;
	}

	
	
	
}