package prog2;

import java.util.ArrayList;

public class generesikMetod {

	public static void main(String[] args) {
		
		Integer[] listan = { 1, 2, 3, 4, 5 };
			
		
		System.out.println("den innehåller:");
		Metoden(listan);
	
	}
	
	public static  <T> void Metoden(T[] listan){	
			
		    
			for (T t : listan) {
		        System.out.printf("%s ", t);
		    }
		   
		}
		
		
		
	
	
}



