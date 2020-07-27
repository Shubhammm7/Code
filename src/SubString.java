
public class SubString {

	public static void main(String[] args)
	{
		
		String S="Shubham372";
		int n= S.length(),k=3;
		
		for(int i=0;i<n-1;i++)
		{
			
			System.out.println(S.substring(i, k)+" "+S.substring(n-k,n-i));
			if(k!=n)
			{
			k++;
			}
			else
			{
				break;
			}
		}
	}

}
