package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void MayorEdadTest() {
		//AAA
		
		//Arrange: preparar
		Persona p = new Persona("pepe",20);
		
		boolean esMayor = p.esMayorEdad();
		
		assertTrue(esMayor);
		
		
		
	}

}
