package com.itminds.SmartParking;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.itminds.SmartParking.Controller.MainController;

import jdk.net.SocketFlow.Status;

// FAILED TO LOAD APPLICATION

// 3eme approche 

/**
 * the full Spring application context is started but without the server
 * 
 * We can narrow the tests to only the web layer by using @WebMvcTest
 * 
 * Spring Boot instantiates only the web layer rather than the whole context
 * 
 * 
 * @author hp
 *
 */

/**
 * In an application with multiple controllers, you can even ask
 *  for only one to be instantiated by using,
 *  
@WebMvcTest(HomeController.class)
 * 
 *
 */

@WebMvcTest(MainController.class)
public class WebLayerTest {

	
	@Autowired
	private MockMvc mockMvc;
	
	

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		

		
		//this.mockMvc.perform(get("/rechercher")).andDo(print()).andExpect(status().isOk())
		//.andExpect(content().string(containsString("rechercher")));
		
		
		this.mockMvc.perform(get("/tous")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Experiences")));
}
	
	
}
