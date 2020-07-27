
public class arryRotation 
{
	public static void main(String [] S7)
	{
		
			int [] arr={3,2,1,6};
			
			
			
		int max=arr[0];
		//System.out.println(max);t
	
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			System.out.println(max+" ");
			
			}
			if(max>arr[i])
			{
				int min=arr[i];
				System.out.print(min);
	}
			}
	

}
	
}
