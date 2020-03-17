package com.itminds.SmartParking;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.itminds.SmartParking.Entity.Experience;
import com.itminds.SmartParking.Repository.ExperienceRepository;

@SpringBootApplication
public class SmartParkingApplication {

	private static final Logger log = LoggerFactory.getLogger(SmartParkingApplication.class);

	// charger toute les configurations necessaires au programme
	public static void main(String[] args) {
		SpringApplication.run(SmartParkingApplication.class, args);
	}

	
}
