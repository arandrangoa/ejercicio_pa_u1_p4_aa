package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo{

	private static List<Propietario> baseDatos=new ArrayList<>();
	
	
	@Override
	public void insetar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario propietarioEncontrado=new Propietario();
		for(Propietario p:baseDatos) {
			if(p.getIdentificacion().equals(identificacion)) {
				propietarioEncontrado=p;
			}
		}
		return propietarioEncontrado;
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario pro=this.buscar(identificacion);
		baseDatos.remove(pro);
	}

}
