import java.util.Comparator;

public class SortbyName implements Comparator<Car> {

public int compare(Car carname1, Car carname2) 
{ 
	String name1 = carname1.getMake().toUpperCase();
	    String name2 = carname2.getMake().toUpperCase();
	   
	   return name1.compareTo(name2);
} 	
}