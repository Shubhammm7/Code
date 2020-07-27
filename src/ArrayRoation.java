import java.util.Scanner;

public class ArrayRoation
{
	public static void main(String[] args) 
	{
		
		int arr[]=new int[]{1,2,3,5,6},n=arr.length-1;
		//System.out.println(n);
		int j=0,i=0,temp=0;
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("enter how many time you want rorate aaray:-");
		Scanner sc=new Scanner(System.in);
		int user=sc.nextInt();
	
				
		for(j=0;j<user;j++)
		{
			temp=arr[0];
	
			for(i=0;i<n;i++)
				{
					arr[i]=arr[i+1];
				}
		
					arr[i]=temp;
		
		}
		
	
	for(int a:arr)
	{
		System.out.print(a+"");
	}
	}
	

}
