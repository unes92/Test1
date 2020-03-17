package com.itminds.SmartParking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itminds.SmartParking.Entity.Experience;
import com.itminds.SmartParking.Repository.ExperienceRepository;

/**
 * ServiceExperience est la classe qui a l'acces a la partie jpa qui est liee a la base de donnes
 * classe intermédiaire entre le controlleur et le repository
 * @author hp
 *
 */
@Service
public class ServiceExperience {
	
	 /**
	  * injection du repository
	  */
	@Autowired
	 private ExperienceRepository experienceRepository;
	
	 /**
	  * ajouterexperience  la classe qui permet d'ajouter une nouvelle experience 
	  * @param e est de type experience ,pour saisir une nouvelle experience
	  * @return save : ajouter l'experience a la base de donnees
	  */
	  public Experience ajouterExperience(Experience e)
	  {
			return experienceRepository.save(e);
			
	  }
	
	  /**
	   * findBynbReplacesDispo: afficher les experiences selon le nombre de places vides voulu
	   * @param nbReplacesDispole nombre de places vides voulu
	   * @return tous les experiences qui ont un  nombre de places vides voulu
	   */
	  public List<Experience> findBynbReplacesDispo(int nbReplacesDispo)
	  {
			return experienceRepository.findBynbReplacesDispo(nbReplacesDispo);
	  }

	  
	  
	  /**
		  * getAllexperiences  la methode qui permet d'afficher tous les experiences  
		  *
		  * @return findall :retourne tous les experiences  enregistres sur la base de donnees
		  */
	  public Iterable<Experience> getAllexperiences()
	  {
			return experienceRepository.findAll();
	  }

	  public Experience findByIdExperience(long Idexperience)
	  {
			return experienceRepository.findByIdExperience(Idexperience);
	  }
	  
}
