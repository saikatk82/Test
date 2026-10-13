
public class StringIterator {

	public static void main(String[] args) {
		
		String s = "Java";
		Character [] c = new Character[s.length()];
		for(int i=0; i< s.length();i++){
			c[i] = s.charAt(i);
		}
		
		for( char c1 : c){
			System.out.println(c1);
		}

	}

}
