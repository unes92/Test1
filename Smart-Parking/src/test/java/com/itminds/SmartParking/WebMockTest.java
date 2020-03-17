package com.itminds.SmartParking;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.itminds.SmartParking.Controller.MainController;
import com.itminds.SmartParking.Entity.Experience;
import com.itminds.SmartParking.Entity.Parking;
import com.itminds.SmartParking.Service.ServiceExperience;
import com.itminds.SmartParking.Service.ServiceParking;


//// FAILED TO LOAD APPLICATION

@WebMvcTest(MainController.class)
public class WebMockTest {

	@Autowired
	private MockMvc mockMvc;

	
	/**
	 * We use @MockBean to create and inject a mock for the GreetingService 
	 * (if you do not do so, the application context cannot start)
	 */
	
	@MockBean
	private ServiceExperience service;
	
	@MockBean
	private ServiceParking service2;
	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		
		// je definis la valeur retourne par la methode meme si le change
		
		List<Experience> experiences=null;
		Parking p = new Parking("park1","agadir","el massira");
		Experience n = new Experience("experience1",2,2,p);
		experiences.add(n);
		
		
		
		//when(service.getAllexperiences()).thenReturn(experiences);
		when(service.findByIdExperience(1)).thenReturn(n);
		//tester le resultat de la requete est ce qui convient la valeur defini 
		this.mockMvc.perform(get("/rechercher")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("rechercher")));
		
		
	
		
	}
}