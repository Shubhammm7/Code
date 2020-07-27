package array;

public class SumofSort {

	public static void main(String[] args) {
		
		int a[]={9,8,5};
		
		int m=a.length,sum=0;
		
		
		for(int i=0;i<m;i++)
		{
			int p=1;
			for(int j=0+i;j>=0;j--)
			{
				
				sum=sum+(p*a[j]);
				p++;
			}
			System.out.println(sum);
		
			
		}
	

	}

}