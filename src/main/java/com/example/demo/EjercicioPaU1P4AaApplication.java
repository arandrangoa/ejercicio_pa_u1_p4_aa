package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4AaApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehi=new Vehiculo();
		vehi.setMarca("Chevrolet");
		vehi.setModelo("Camaro");
		vehi.setPlaca("TCX900");
		vehi.setPrecio(new BigDecimal(22000));
		vehi.setTipo("automatico");
		
		this.iVehiculoService.agregar(vehi);
		
		System.out.println(vehi);
		
		
		vehi.setMarca("Mazda");
		vehi.setModelo("Mazda 3");
		this.iVehiculoService.modificar(vehi);
		
		System.out.println(vehi);
		
		Propietario pro=new Propietario();
		pro.setApellido("Andrango");
		pro.setFechaNacimineto(LocalDate.of(1999, 11, 21));
		pro.setNombre("Alex");
		pro.setIdentificacion("1727193847");
		this.iPropietarioService.agregar(pro);
		
		System.out.println(pro);
		
		this.iMatriculaService.realizar(pro.getIdentificacion(), vehi.getPlaca());
		
		List<Matricula> matriculas=this.iMatriculaService.mostrarMatriculas();
		for(Matricula m:matriculas) {
			System.out.println(m);
		}
		
		
	}

}
