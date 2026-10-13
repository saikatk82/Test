import java.util.ArrayList;
import java.util.Collections;

public class CarComparison {

	public static void main(String[] args) {
		
		ArrayList<Car> car = new ArrayList<Car>(); 
		car.add(new Car("Honda","CRV","Green",2016,23845,8, 33));
		car.add(new Car("Ford","Escape","Red",2017,23590,7.8, 32));
		car.add(new Car("Hyndai","Santa Fe","Grey",2016,24950,8, 27));
		car.add(new Car("Mazda","CX-5","Red",2017,21795,8 ,35));
		car.add(new Car("Subaru","Forester","Blue",2016,22395,8.4, 32));
		
		 System.out.println("Car Details:"); 
	        for (int i=0; i<car.size(); i++) 
	            System.out.println(car.get(i));
	        
	       
	        Collections.sort(car, new SortbyYear());
	       System.out.println("The newest vehicles in order:"); 
	        for (int i=0; i<car.size(); i++) 
	            System.out.println(car.get(i).make);
	        
	        
	        Collections.sort(car, new SortbyName());
	        
	        System.out.println("alphabetized List of vehicles:"); 
	        for (int i=0; i<car.size(); i++) 
	            System.out.println(car.get(i).make);
	        
     Collections.sort(car, new SortbyPrice());
	        
	        System.out.println("ordered List of Vehicles by Price:"); 
	        for (int i=0; i<car.size(); i++) 
	            System.out.println(car.get(i).make);
	        
	        
	}
	
}
