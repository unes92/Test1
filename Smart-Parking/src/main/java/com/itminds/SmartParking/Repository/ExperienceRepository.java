package com.itminds.SmartParking.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itminds.SmartParking.Entity.Experience;

// ExperienceRepository est l'interface qui fait appel aux l'ensemble de 
// des methodes de manipulation des experiences depuis CrudRepository
@Repository
public interface ExperienceRepository extends CrudRepository<Experience,Long>{

	
	
	
	Experience findByIdExperience(long Idexperience);
	
	 List<Experience> findBynbReplacesDispo(int nbReplacesDispo);
}
