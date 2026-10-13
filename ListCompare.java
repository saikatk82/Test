import java.util.ArrayList;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
	
		String str ="Hello World!";
		char [] charString ={'a','b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		
		char [] finalString =str.toCharArray();
		
		 for(int i=0;i<str.length();i++){
			 char curr = str.charAt(i);
			 if(curr=='a')
			 {
				 curr='1';
				 finalString[i]=curr;
			 }
			 if(curr=='e')
			 {
				 curr='2';
				 finalString[i]=curr;
			 }
			 if(curr=='i')
			 {
				 curr='3';
				 finalString[i]=curr;
			 }
			 if(curr=='o')
			 {
				 curr='4';
				 finalString[i]=curr;
			 }
			 
			 if(curr=='u')
			 {
				 curr='5';
				 finalString[i]=curr;
			 }
			 if(curr=='y')
			 {
				 curr=' ';
				 finalString[i]=curr;
			 }
			}
					
		 System.out.println(finalString);	
		
		
		
	}	
}		
		
	


