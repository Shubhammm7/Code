
public class ZeroSide {

	public static void main(String[] args) 
	{
		/*shift 0 on one side*/
		int[] arr={1,0,5,6,0,0,1};
		int i=0,j=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				
			
				int b=arr[j];
				arr[j]=arr[i];
				arr[i]=b;
				j++;
			}
		
			
		}
		for(i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]);
	
		}
		
			
	}

}
