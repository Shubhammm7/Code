import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int sum=1;
		while(n>1)
		{
			sum=sum*n;
			n--;
			
			
		}
		System.out.println(sum);
	
		int b=sum%10,k=0;
		//System.out.println(b);
		
		if(b==0)
		{
			k=sum/10;
			
		}
		System.out.println(k);
		
		{
			
		}
	}
	
}