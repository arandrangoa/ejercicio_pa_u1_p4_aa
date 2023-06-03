package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscar(placa);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminar(placa);
	}

}
