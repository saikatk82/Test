
public class test1 {
	    static int total = 10;
	    public void call() {
	        int total = 5;
	        System.out.println(this.total);
	    }
	    public static void main (String args []) {
	    	test1 a1 = new test1();
	        a1.call();
	        String str1 = "My String";
	        String str2 = new String ("My String");
	        
	        System.out.println(str1 == str2);
	        
	        int y = 127;
	        switch (y) {
	            default: System.out.print("129 ");    
	            case 127: System.out.print("127 ");
	            case 128: System.out.print("128 ");
	            
	    }
	
	        int a = 0;
	        System.out.println((a != 0) ? "true" : "false");
	         
	        Double d = null;
	        System.out.println((d instanceof Double) ? "true" : "false"); 
	        
	        String e = "1";
	        System.out.println(("1" != e) ? "true" : "false");
	        
	        int c = 0;
	        System.out.println((0 == c++) ? "true" : "false"); 
	        
	        boolean b = false;
	        System.out.println((b = true) ? "true" : "false");
	    
	    
	    }

}