package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Matricula;

public interface IMatriculaService {
	
	public void realizar(String identificacion, String placa);

	public List<Matricula> mostrarMatriculas();
}
