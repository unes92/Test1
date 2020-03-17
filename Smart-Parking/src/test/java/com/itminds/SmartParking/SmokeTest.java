package com.itminds.SmartParking;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itminds.SmartParking.Controller.MainController;


public class SmokeTest {

	
	@Autowired
	private MainController controller;
	
	@Test
	public void contexLoads() throws Exception {
	
		assertThat(controller).isNotNull();
		//assertThat(controller).isNull();
	}

}
