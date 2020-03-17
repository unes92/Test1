package com.itminds.SmartParking.Controller;


/**
 * 
 * @author : younes 
 * Projet : Smart Parking 
 * userstory: Partager une experience 
 * Date de Creation: 13/03/2020 
 * Date de Modification: 13/03/2020
 * 
 * 
 * Ce Controlleur est le controlleur principal qui lie entre les pages web et les services du l'application 
 * 
 * 
 * 
 * 
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itminds.SmartParking.Repository.ExperienceRepository;
import com.itminds.SmartParking.Service.ServiceExperience;
import com.itminds.SmartParking.Service.ServiceParking;
import com.itminds.SmartParking.Entity.Experience;
import com.itminds.SmartParking.Entity.Parking;
import com.sun.tools.sjavac.Log;


/**
 * 
 * la  classe MainController est de type  Controlleur
 *
 */

@Controller  
public class MainController {

  
	 
 /**
  * Appelation du service qui contient les methodes de gestion des experiences
  */
	
  @Autowired
  private ServiceExperience serviceexperience;
  
  
  @Autowired
  private ServiceParking serviceparking;
  

/**
 *  la Methode pageadd() est une methode de redirection vers la page Add 
 *  
 *  @return "Add"  : retourne la page Add (ajouter une experience)
 */

  @GetMapping(path="/Add")
  public String pageadd(Model m) {
	  
    m.addAttribute("parkings",serviceparking.getAllparkings());
    return "Add";
  }
  

  /**
   * la Methode pagerecherche() est une methode de redirection vers la page rechercher
   *  
   *  @return "rechercher"  : retourne la page rechercher (rechercher une experience) 
   */
  @GetMapping(path="/rechercher")
  public String pagerecherche()
  {
	  return "rechercher";
  }
  
  
  /**
   *  la Methode rechercher() est une methode qui recoit des parametres de la page rechercher et qui 
   *  execute la methode findBynbReplacesDispo qui fait la recherche des experiences par nombre de places disponibles
   *  
   *  @return "rechercher"  : renvoie le resultat vers la page rechercher (rechercher une experience) 
   */
  @PostMapping(path="/rechercher")
  public String rechercher(Model m,@RequestParam int nbReplacesDispo)
  {
	  m.addAttribute("experiences", serviceexperience.findBynbReplacesDispo(nbReplacesDispo));
	  return "rechercher";
  }
  
  
  
  /**
   * la Methode addNewUser() est une methode qui recoit des parametres de la page Add(Partager une experience)
   * 
   * @param DescriptionExprerience
   * @param NbReplacesDispo
   * @param stars  
   * 
   *  et qui execute la methode ajouterExperience qui fait l'ajout d'une nouvelle experience
   *  
   *  @return "Saved"  : renvoie le message saved si l'ajout a ete fait avec succes
   * 
   * 
   */
  
  @PostMapping("/Added") // Map ONLY POST Requests
  public  @ResponseBody String addNewUser (@RequestParam String DescriptionExprerience
		  , @RequestParam int NbReplacesDispo,@RequestParam int stars,@RequestParam Parking parking) {

	  
    Experience n = new Experience(DescriptionExprerience,NbReplacesDispo,stars,parking);
    
    serviceexperience.ajouterExperience(n);
    return "Saved";
  }
  
  
  
  /**
   * la Methode getAllUsers() est une methode qui renvoie la liste des experiences(Afficher tous les experiences)
   * 
   * @param Model : parametre qui va renvoyer la liste des experience .
   * 
   *  
   *  @return "all"  : renvoie le message saved si l'ajout a ete fait avec succes
   * 
   * 
   */

   @GetMapping(path="/all")
   public String getAllexperiences(Model model) {
	  
	model.addAttribute("Experiences", serviceexperience.getAllexperiences());

	return "all";
  
  }
  

   @GetMapping(path="/tous")
   public @ResponseBody String gettousexperiences(Model model) {
	  
	model.addAttribute("Experiences", serviceexperience.getAllexperiences());

	return "Experiences";
  
  }
  
  
  


  
  
  @GetMapping(path="/test")
  public @ResponseBody Iterable<Experience> getAllUsers() {

    return serviceexperience.getAllexperiences();
  
  }
  
}