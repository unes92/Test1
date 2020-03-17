package com.itminds.SmartParking.Entity;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Experience {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idExperience;
	//@Length(min=6,message="minimun 6")
	private String descriptionExprerience;
	private int nbReplacesDispo;
	
	

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date dateExperience;
	 
	private int stars;
	
	/*
	  @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "idParking", referencedColumnName = "idExperience")
	    private Parking parking;
	*/
	
	  @ManyToOne
	  @JoinColumn( name = "idParking" )
	  private Parking parking;
	  
	public Experience() {
		
		
	}

	/*
	public Experience(String descriptionexprerience, int nbreplacesdispo) {
		
		this.Descriptionexprerience = descriptionexprerience;
		this.Nbreplacesdispo = nbreplacesdispo;
		
	}
	*/
	
	public Experience(String descriptionexprerience, int nbreplacesdispo,int stars,Parking parking) {
	
		this.descriptionExprerience = descriptionexprerience;
		this.nbReplacesDispo = nbreplacesdispo;
		this.dateExperience = new Date();
		//this.dateExperience=Calendar.getInstance().getTime(); 
		this.stars=stars;
		this.parking=parking;
		
	}
	


	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public Long getIdExperience() {
		return idExperience;
	}

	
	public String getDescriptionExprerience() {
		return descriptionExprerience;
	}

	

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public void setDescriptionExprerience(String descriptionExprerience) {
		this.descriptionExprerience = descriptionExprerience;
	}

	public int getNbReplacesDispo() {
		return nbReplacesDispo;
	}

	public void setNbReplacesDispo(int nbReplacesDispo) {
		this.nbReplacesDispo = nbReplacesDispo;
	}



	public Date getDateExperience() {
		return dateExperience;
	}

	public void setDateExperience() {
		this.dateExperience = new Date();
	}

	@Override
	public String toString() 
	{
		return String.format(
				"Experience[Idexperience=%d, Descriptionexprerience='%s', Nbreplacesdispo='%s',Dateexperience='%s']",
				idExperience, descriptionExprerience, nbReplacesDispo,dateExperience);
	}
	



	
}
