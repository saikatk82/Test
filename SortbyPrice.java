import java.util.Comparator;

public class SortbyPrice implements Comparator<Car> {

	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(Car a, Car b) 
	    { 
	    	int carPrice1 = a.getPrice();
	 	    int carPrice2 = b.getPrice();
	 	   
	 	   return carPrice2- carPrice1;
	    } 	
	          
	} 
