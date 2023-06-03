package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepo iPropietarioRepo;
	
	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.insetar(propietario);
	}

	@Override
	public Propietario buscarPorIdentificacion(String identificacion) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscar(identificacion);
	}

	@Override
	public void borrar(String identificacion) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(identificacion);
	}

}
