import java.io.IOException;

public class CustomException {
  
	void method() throws IOException{
		throw new IOException("device error");
	//	System.out.println("device operation ..");
		
	}
}
