
public class Array1 {

	public static void main(String[] args) 
	{
	
			int [] arr={4,0,0,5,0,0,0,0};
			
			//int count=0;
			for(int i=0;i<=arr.length/2;i++)
			{
				for(int j=0;j<arr.length-1;j++)
				if(arr[j]<arr[j+1])
				{
					
				}
				else
				{
					int a;
					a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
				
				
			}
			
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]);
			}
	}

}
