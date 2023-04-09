package com.example.Back_Front.Control;

import java.util.Date;

public class AlquilerCtrl {
	private Integer id_disfraz;
	private Integer id_cliente;
	private Integer id_alquiler;
	private Date fecha_p;
	private Date fecha_d;
	private String Comentarios;
	private Integer Cantidad;
	private Integer Total;
	
	
	public AlquilerCtrl() {
		super();
	}
	
	
	
	public int getId_disfraz() {
		return id_disfraz;
	}



	public void setId_disfraz(int id_disfraz) {
		this.id_disfraz = id_disfraz;
	}



	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}



	public int getId_alquiler() {
		return id_alquiler;
	}



	public void setId_alquiler(int id_alquiler) {
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
	public String getComentarios() {
		return Comentarios;
	}
	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}
	public Integer getCantidad() {
		return Cantidad;
	}
	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}
	public Integer getTotal() {
		return Total;
	}
	public void setTotal(Integer total) {
		Total = total;
	}
	
	
}
