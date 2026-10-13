
// Java program to demonstrate working of Comparator 
// interface and Collections.sort() to sort according 
// to user defined criteria. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
// A class to represent a student. 
class Student 
{ 
    int rollno; 
    String name, address; 
  
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class Sortbyroll implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
    	String StudentName1 = a.getName().toUpperCase();
 	    String StudentName2 = b.getName().toUpperCase();
 	   
 	   return StudentName1.compareTo(StudentName2);
    } 	
} 
  
