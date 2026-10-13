
public class SampleException {
	
	public static void main (String args[]) throws Exception{
	
		try{
		int number =100/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("rest of the code ..");
		
	}

}
