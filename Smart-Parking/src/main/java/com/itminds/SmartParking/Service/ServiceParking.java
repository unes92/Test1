package com.itminds.SmartParking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itminds.SmartParking.Entity.Parking;
import com.itminds.SmartParking.Repository.ParkingRepository;
/**
 * ServiceParking est la classe qui a l'acces a la partie jpa qui est liee a la base de donnes
 * classe intermédiaire entre le controlleur et le repository
 * @author hp
 *
 */
@Service
public class ServiceParking {


	 /**
	  * injection du repository
	  */
	@Autowired
	ParkingRepository parkingrepository;
	
	 /**
	  * getAllparkings  la methode qui permet d'afficher tous les parkings 
	  *
	  * @return findall :retourne tous les parkings enregistres sur la base de donnees
	  */
	public Iterable<Parking> getAllparkings()
	{
		return parkingrepository.findAll();
		
	}
}
