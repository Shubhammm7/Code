import java.util.Scanner;

public class Amstrom 
{
	public static void main(String argd[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your number:-");
		int a=sc.nextInt(),b=0,count=0;
		double sum=0;
		
		int n=a,c=a;
		while(n>0)
		{	
			n=n/10;
			count++;
		}
		
		//while(a>0)
		for(int i=0;i<=a;i++)
		{
			b=a%10;
			sum=sum+(Math.pow(b,count));
			//System.out.println(sum);
			a=a/10;
		}
		if(c==sum)
		{
			System.out.println("amstrong");
		}
		else
		{
			System.out.println(" no amstrong");
		}
		
	}

}
