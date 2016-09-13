package ar.unlam.edu.Numeros.Complejos;

import junit.framework.Assert;

import org.junit.Test;

public class ComplejosTest {

	@SuppressWarnings("deprecation")
	@Test
	public void queDosNumerosComplejosSeSumen(){
		Complejos c1 = new Complejos (1.0,1.0);
		Complejos c2 = new Complejos (1.0,1.0);
		
		
		c1.sumar(c2);
		
		Double esperadoReal = 2.0;
		Double esperadoImaginario = 2.0;
		
		Assert.assertEquals(esperadoReal, esperadoImaginario, 0.01);
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queDosNumerosComplejosSeResten(){
		Complejos c1 = new Complejos (5.0,3.0);
		Complejos c2 = new Complejos (3.0,1.0);
		
		
		c1.restar(c2);
		
		Double esperadoReal = 2.0;
		Double esperadoImaginario = 2.0;
		
		Assert.assertEquals(esperadoReal, esperadoImaginario, 0.01);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queDosNumerosComplejosSeMultipliquen(){
		Complejos c1 = new Complejos (1.0,1.0);
		Complejos c2 = new Complejos (1.0,1.0);
		
		
		c1.multiplicar(c2);
		
		Double esperadoReal = 1.0;
		Double esperadoImaginario = 1.0;
		
		Assert.assertEquals(esperadoReal, esperadoImaginario, 0.01);
		
	}
	
	/*@Test
	public void queDosNumerosComplejosSeMultipliquenPorElEscalar(){
		Complejos c1 = new Complejos (1.0,1.0);
		Complejos c2 = new Complejos (1.0,1.0);
		
		
		
		
		
		
	}
	
	
	*/
}
