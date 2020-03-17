package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;


/**
 * SuitefibonacciApplicationTests : la classe responsable du test unitaire des methodes de la classe SuitefibonacciApplication
 * @author younes
 *
 */
@SpringBootTest
class SuitefibonacciApplicationTests {

	
	/**
	 * contextLoads() :la procedure qui fait le test de la methode suitefibonacci de la classe principale SuitefibonacciApplication
	 * 
	 * assertEquals : fait la comparaison entre une variable expected et le resultat de la fonction suitefibonacci
	 */
	@Test
	void contextLoads() {
		
		int x;
		int expected=610;
		
		// equals for object : un object equals itself
		assertEquals(expected,SuitefibonacciApplication.suitefibonacci(15));
		
		assertNotEquals(2,SuitefibonacciApplication.suitefibonacci(15));

	
		
		 expected=2;
		assertEquals(expected,SuitefibonacciApplication.suitefibonacci(3));
		

		assertNotNull("la valeur n'est pas nulle", SuitefibonacciApplication.suitefibonacci(0));
		//assertNull("la valeur n'est pas nulle", SuitefibonacciApplication.suitefibonacci(x));

	}
	

}
