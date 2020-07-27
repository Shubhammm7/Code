package array;

public class BinarySort {

	public static void main(String[] args) {
		int [] binary={1,0,0,0,0,0,};
		
		int one=0,zero=0;
		
		for(int k:binary)
		{
			if(k==0)
			{
				zero++;
			}else
			{
				one++;
			}
		}
		System.out.println("Zeros count="+zero+" 1's count="+one);
		int count=0;;
		for(int i=0;i<binary.length;i++)
		{
			
			if(count<=zero-1)
			{
				binary[i]=0;
			}
			else if(count>=zero)
			{
				binary[i]=1;
			}
			count++;
			
		}
		for(int k:binary)
		{
			System.out.print(k);
		}
	}

}
	
