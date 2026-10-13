
public class abcd {

	public static void main(String[] args) {
		
		int i= 0;
		double f = 0.5;
		
		for(double j=10;j>f;j--){
			 double temp=j;
			 j = j/2;
			 temp = j-j/2;
			 i++;		
		}	
	System.out.println(i);
	}

}
