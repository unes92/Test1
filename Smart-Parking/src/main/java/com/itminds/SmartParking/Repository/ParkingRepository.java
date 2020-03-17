package com.itminds.SmartParking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itminds.SmartParking.Entity.Parking;



/**
 * ParkingRepository est l'interface qui fait appel aux l'ensemble de 
 * des methodes de manipulation des parkings depuis CrudRepository
 * @author younes
 *
 */

@Repository
public interface ParkingRepository extends CrudRepository<Parking,Long>{

	
	
}
