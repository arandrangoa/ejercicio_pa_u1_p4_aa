package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void agregar(Vehiculo vehiculo);
	public void modificar(Vehiculo vehiculo);
	public Vehiculo buscarPorPlaca(String placa);
	public void borrar(String placa);

}
