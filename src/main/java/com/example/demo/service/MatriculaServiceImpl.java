package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepo;
import com.example.demo.repository.IPropietarioRepo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;
	
	@Autowired
	@Qualifier("automatico")
	private IValorMatricula iValorMatricula;
	
	@Override
	public void realizar(String identificacion, String placa) {
		// TODO Auto-generated method stub
		Propietario pro=this.iPropietarioRepo.buscar(identificacion);
		Vehiculo ve=this.iVehiculoRepo.buscar(placa);
		
		Matricula mat=new Matricula();
		mat.setFechaMatricula(LocalDate.now());
		mat.setPropietario(pro);
		mat.setVehiculo(ve);
		
		BigDecimal valorMatri=this.iValorMatricula.valorMatricula(ve.getPrecio());
		
		if(valorMatri.compareTo(new BigDecimal(3000))>0) {
			BigDecimal valorDescuento=valorMatri.multiply(new BigDecimal(0.09));
			BigDecimal valorConDescuento=valorMatri.subtract(valorDescuento);
			valorMatri=valorConDescuento;
		}
		
		
		mat.setValorMatricula(valorMatri);
		
		
		
		
		this.iMatriculaRepo.insertar(mat);
	}

	@Override
	public List<Matricula> mostrarMatriculas() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.mostrarMatriculas();
	}

}
