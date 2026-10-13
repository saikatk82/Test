
public class BubbleSort {

	public static void main(String[] args) {
		 int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		 int n = arr.length; 
		 boolean swap = false ;
		 int i,j,temp ;
		 
		System.out.println("Before Sorting:");
		 for(int k=0;k < n ;k++){
				System.out.print(arr[k] +" ");
			}
		
		 for( j=0 ; j < n-1 ;j++){
			for( i = 0 ; i < n- j-1 ;i++ ){
				 if( arr[i] > arr[i+1]){
				 temp = arr[i];
				 arr[i]= arr[i+1];
				 arr[i+1] = temp;
				 swap =true;
			    }
				 if (swap == false)   
				    break;	 
			 }
			  
		 }
		 
		 System.out.println("\nAfter Sorting:"); 
		 for(int k=0;k < n ;k++){
			System.out.print( arr[k] +" ");
		}

	}

}
