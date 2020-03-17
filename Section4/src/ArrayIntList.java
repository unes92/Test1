import java.util.ArrayList;

public class ArrayIntList {
	ArrayList a = new ArrayList();
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assertEquals(3, d.Size()); 
	}*/
	

	
	public int Size()
	{
		
		return a.size();
		
	}
	


	public void Add(int x)
	{
		 a.add(x);
		
	}
	
	public int Indexof(int x)
	{
		return a.indexOf(x);
		
	}
}
