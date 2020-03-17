package externalisation.des.tests;

//A Class that adds up a string based on the ASCII values of its
//characters and then returns the binary representation of the sum.

public class BinString {

	
	
	public BinString () 
	{
		
	}
	
	// convert string to binary passing by ASCII code
	 public String convert(String s) 
	 {
		 return binarise(sum(s));
	 }
	 
	 
	 
	 
	 // convert string to code ascii
	 
	 public int sum(String s) 
	 { 
		 
		 if (s=="") 
			 return 0;
	  
		 //  abc  a =97      B=98     c=99
		 
		 if(s.length()==1)
			 //charAt renvoie caractere a la position 0
	return ((int)(s.charAt(0)));
	
		 
		 
		 
		 //  ab  a =97      b=98    
		 // somme a+b = 97+98 = 195
		 
		 //Substring starting from index 1
	 return ((int)(s.charAt(0)))+sum(s.substring(1));
	 
	 }
	 
	 
	 
	 
	 // convert code ascii to binary
	 
	 public String binarise(int x) 
	 {
	 
		 if (x==0) 
	     return "";
	 
		 if(x%2==1) 
		 return binarise(x/2)+"1";
	 
		 
		 return binarise(x/2)+"0";
	 }

	
	
}
