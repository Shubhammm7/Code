import java.math.BigInteger;

public class factorual 
{
	public static void main(String argd[])
	{
		
	 BigInteger bi=new BigInteger("");
	 
	 int n=25;
	 
	 while(n!=1)
	 {
		 bi=bi.multiply(BigInteger.valueOf(n));
		 n--;
	 }
		
	 System.out.println(bi);
	}

}
