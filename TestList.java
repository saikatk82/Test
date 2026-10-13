import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		String s [] = {"pablo","leo","Subhang"};
		
		for(String x :s){
		list1.add(x);
		}

		for(int i =0;i<list1.size();i++){
		System.out.printf("%s ",list1.get(i));
		
	}

 }
}