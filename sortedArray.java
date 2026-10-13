import java.util.Arrays;

public class sortedArray 
{

	public static void main(String[] args) 
		{
			
			int example[] ={3,5,1,6,7};
			
			int len = example.length;
			int temp;
		
			for(int i=0;i<len-1;i++)
				{
						for(int j=i;j>=0;j--){
								
								if(example[j+1]< example[j])
								{
									temp=example[j];
									example[j]= example[j+1];
									example[j+1] =temp;
								}
							}
				
				
				}
			System.out.println(Arrays.toString(example));	
	
		}
	
}
