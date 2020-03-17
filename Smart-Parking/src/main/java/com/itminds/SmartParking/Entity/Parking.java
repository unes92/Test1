package com.itminds.SmartParking.Entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Parking {
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long idParking;
	
	
	
	private String libParking;
	
	
	private String villeParking;
	

	private String rueParking;
	

/*	
  @OneToOne(mappedBy = "parking")
	    private Experience experience;
*/
	  @OneToMany( mappedBy = "parking" )
	  private List<Experience> experiences;
	  
	//Constructors
		public Parking(String libParking, String villeParking , String rueParking) {
			
			this.libParking = libParking;
			this.villeParking = villeParking;
			this.rueParking = rueParking;
		}
		
		
	//Getters Setters
		public Parking() {
		}
		public long getIdParking() {
			return idParking;
		}
		public void setIdParking(long idParking) {
			this.idParking = idParking;
		}
		public String getLibParking() {
			return libParking;
		}
		public void setLibParking(String libParking) {
			this.libParking = libParking;
		}
		public String getVilleParking() {
			return villeParking;
		}
		public void setVilleParking(String villeParking) {
			this.villeParking = villeParking;
		}
		public String getRueParking() {
			return rueParking;
		}
		public void setRueParking(String rueParking) {
			this.rueParking = rueParking;
		}
		

}
