import java.util.Scanner;

public class DigitDivided
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int no=n,count=0,i;
		while(no!=0)
		{
			i=no%10;
			
			if(i!=0 && no%i==0)
			{
				count++;
			}
			no=no/10;
			
		}
			
		System.out.println(count);
	}
}
