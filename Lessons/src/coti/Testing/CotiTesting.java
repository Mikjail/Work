package coti.Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import coti.Cliente;
import coti.TarjetaCoti;

public class CotiTesting {


	@Test
	public void shouldCreateClient(){
		
		//Given
		String name= "Mika";
		Integer age= 25;
		
		// When
		Cliente clientePrueba = new Cliente(name,age);
		
		
		// Then
		Assert.assertTrue(clientePrueba.getNombre().equals(name));
			
		Assert.assertTrue(clientePrueba.getEdad().equals(age));
	}
	
	public void shouldCreateCompra(){
		
		TarjetaCoti tarjeta = new TarjetaCoti();
		
		Asser.assertTrue(tarjta)
		
	}
}
