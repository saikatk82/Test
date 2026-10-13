
public class SearchElement {

	public static void main(String[] args) {
	int a[] ={5,10,15,20,25};
	
	int index =0;
	
	index=findElement(a,10);
	
	System.out.println("location of element :"+ index);
		

	}

	public static int findElement(int a [], int s){
		int index =0 ;
	
		for(int j=0 ; j <=(a.length) -1 ; j++){
			
		if(s == a[j]){
			break;
		}
		for(int i=(a.length)/2 ; i <=(a.length) -1 ; i++){
			if(a[i]==s){
				index = i;
				break;
			}
			
			
			System.out.println(a[i]);
		}
		
		}
		
		return index;
		
	}
 }	

