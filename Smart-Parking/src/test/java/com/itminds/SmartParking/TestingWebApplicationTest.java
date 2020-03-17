package com.itminds.SmartParking;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import jdk.net.SocketFlow.Status;


// 2eme approche 


@SpringBootTest
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

	
	
	
	
	// Another useful approach is to not start the server at all but to test only the layer
	
	@Autowired
	private MockMvc mockMvc;

	//processing a real HTTP request but without the cost of starting the server # previous exemple HttpRequestTest class
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/tous")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Experiences")));
		
		/*this.mockMvc.perform(get("/rechercher")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello, World")));
	*/
	}
	
	
	
	
/*	
	@Autowired
	private MockMvc mockmvc2;
	
	@Test
	public void affichermessage() throws Exception
	{
		mockMvc.perform(get("/younes")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string("bravo"));
	}
	*/
	
	
}
