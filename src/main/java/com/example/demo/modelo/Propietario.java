package com.example.demo.modelo;

import java.time.LocalDate;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private String identificacion;
	private LocalDate fechaNacimineto;
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public LocalDate getFechaNacimineto() {
		return fechaNacimineto;
	}
	public void setFechaNacimineto(LocalDate fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaNacimineto=" + fechaNacimineto + "]";
	}
	
	

}
