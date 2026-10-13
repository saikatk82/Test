import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		 String str ="saikat";
		 char[] chars =str.toCharArray();
	       
		 // build HashMap with character and number of times they appear in String
		 Map<Character,Integer> charMap = new  HashMap<Character,Integer>();
		 for(char ch :chars){
			if(charMap.containsKey(ch)) {
			 charMap.put(ch, charMap.get(ch)+1);
			}else
				charMap.put(ch, 1);
		 }
		 
		 Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		 for( Map.Entry<Character,Integer> entry :entrySet)
		 {
			 if(entry.getValue() >1){
				 System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			 }
		 }
		 
		
	}

}
