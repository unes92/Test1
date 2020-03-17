package externalisation.des.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class BinStringTest  extends TestCase{

	/*@Test
	public void testBinString() {
		fail("Not yet implemented");
	}*/

	
	 private BinString binString;
	
	 
	 public BinStringTest(String name) 
	 {
		 super(name);
	 }
	 
		 protected void setUp() 
	 {
		 binString = new BinString ();
	 }
		
		 
	 public void testSumFunction()
	 {
		
		 int expected = 0;
		 assertEquals(expected,binString.sum(""));
		 
		 expected = 100;
		 assertEquals(expected, binString.sum("d"));
		 
		 // d=100  a=65
		 expected = 265;
		 assertEquals(expected , binString.sum("Add"));
	}
	
	 
	 public void testBinariseFunction () 
	 {
		 String expected = "101";
		 assertEquals(expected, binString.binarise(5));
		 expected = "11111100";
		 assertEquals(expected, binString.binarise(252));
	 }
	 
	 
		 public void testTotalConversion () 
		 {
			 // A=65
		 String expected = "1000001";
		 assertEquals(expected, binString.convert("A"));
		 }

}
