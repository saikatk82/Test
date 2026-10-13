import java.util.Comparator;

public class SortbyYear implements Comparator<Car> 
	{ 
	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(Car a, Car b) 
	    { 
	    	int ManufactureYear1 = a.getYear();
	 	    int ManufactureYear2 = b.getYear();
	 	   
	 	   return ManufactureYear2- ManufactureYear1;
	    } 	
	          
	} 


