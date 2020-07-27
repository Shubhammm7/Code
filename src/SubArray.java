
public class SubArray {

	public static void main(String[] args) 
	{

Integer [] a=new Integer[]{0,1,2,3,4};

int n=a.length,i=0,k=3,j=0,sum=0;
//System.out.println(n);

for(i=0;i<n-1;i++)
{
	for(j=i;j<k;j++)
	{	
	sum=sum+a[j];
	

	}		
			System.out.print(" "+sum+" ");
			if(k<=n)
			{
			k++;
			}
	
			sum=0;	
	}


}}

	


