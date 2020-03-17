package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;


//1ere approche 


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	
	
	
	@LocalServerPort
	private int port;

	// equivalance template page
	@Autowired
	private TestRestTemplate restTemplate;

	/**start the server at all
	 * 
	 *  tester le resultat de la requete htttp : http://localhost:  port  / 
	 *   est ce qu'il contient hello, world
	 * 
	 */
	 

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		//contains sensible a la case , cherche au moins un caractere
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",String.class)).contains("Hello, World");
	
		//		assertThat(restTemplate.getForObject("http://localhost:"+ports+"/younes",String.class)).isNull();

	}
	
	/*
	@LocalServerPort
private int ports;
	@Test
	public void messageyounes() throws Exception
	{
		assertThat(restTemplate.getForObject("http://localhost:"+ports+"/younes",String.class)).contains("B");
	}*/
	
}
