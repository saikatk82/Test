
public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoException demoException	= new DemoException();
		String  t = "Pablo";
		String  p = "Tutun";
		 test(t,p);
	
	}

	
	public static void test(String t, String p){
		String m = "Sample";
		test2(t,p,m);
		
	}
	
public static void test2(String t, String p, String s){	
		System.out.println("value of :" + p);
	}
	

}
