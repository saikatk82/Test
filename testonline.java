import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testonline {

	public static void main(String[] args) {
	String s = "Java";
	
	char[] characters = s.toCharArray();
	Map<Character,Integer> charMap = new HashMap<Character,Integer>();
	for(Character ch :characters){
			if(charMap.containsKey(ch)){
				charMap.put(ch,charMap.get(ch)+1);
			}else {
                charMap.put(ch,1);
            }
	}
			
		
	Set<Map.Entry<Character,Integer>> entryset = charMap.entrySet();
	System.out.printf("List of duplicate characters in String '%s' %n", s); 
		for(Map.Entry<Character, Integer> entry : entryset)
		{
				if(entry.getValue() > 1){
					System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());

				}
			}
		}
		

	}


