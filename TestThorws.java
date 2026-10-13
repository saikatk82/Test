import java.io.IOException;

public class TestThorws {
	
	public static void main (String args[]) throws IOException{
		
		CustomException cusEx = new CustomException();
	try{
			cusEx.method();
		}catch(Exception e){
			
			System.out.println("exception handeld..");
			
	}
		System.out.println("normal flow...");  
	}

}
