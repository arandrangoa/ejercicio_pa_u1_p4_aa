package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class ValorMatriculaManualImpl implements IValorMatricula{

	@Override
	public BigDecimal valorMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula=precio.multiply(new BigDecimal(0.10));
		
		return valorMatricula;
	}

}
