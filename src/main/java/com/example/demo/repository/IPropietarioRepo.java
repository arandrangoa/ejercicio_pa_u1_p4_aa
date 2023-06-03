package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepo {
	
	public void insetar(Propietario propietario);
	public Propietario buscar(String identificacion);
	public void eliminar(String identificacion);

}
