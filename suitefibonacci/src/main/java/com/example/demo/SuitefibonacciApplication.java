package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *  la classe SuitefibonacciApplication est la classe principale qui contient la methode suitefibonacci
 *  
 * @author younes
 *
 */
@SpringBootApplication
public class SuitefibonacciApplication {

	
	/**
	 * la classe main pour tester l'application sur console
	 */
	/*public static void main(String[] args) {
		SpringApplication.run(SuitefibonacciApplication.class, args);
		
		System.out.println("le resultat fibonnacci  est  "+suitefibonacci(6));
	}*/
	
	
	/**
	 * suitefibonacci :est la fonction qui calcule la suite de fibonacci
	 * @param x est un entier et aussi la base de calcul de la fonction  f(x)=resultat
	 * @return fibonacci : est la resultat de f(x) =f(x-1)+f(x-2)
	 */
	public static int suitefibonacci(int x)
	{
		int fibonacci=0;
		int i=0;
		if(x==0)
			fibonacci=0;
		else if(x==1)
			fibonacci=1;
		else
			fibonacci=suitefibonacci(x-1)+suitefibonacci(x-2);
		
		return fibonacci;
		
	}

}
