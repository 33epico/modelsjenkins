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
	
	@Test
	void MayorEdadTest2() {
		//AAA
		//Arrange: preparar
		Persona p = new Persona("pepe",20);		
		boolean esMayor = p.esMayorEdad();		
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest3() {
		//AAA
		//Arrange: preparar
		Persona p = new Persona("pepe",20);		
		boolean esMayor = p.esMayorEdad();		
		assertTrue(esMayor);
	}
	
	@Test
	void MayorEdadTest4() {
		//AAA
		//Arrange: preparar
		Persona p = new Persona("pepe",20);		
		boolean esMayor = p.esMayorEdad();		
		assertTrue(esMayor);
	}

}
