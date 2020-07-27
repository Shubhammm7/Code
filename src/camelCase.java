
public class camelCase {

	public static void main(String[] args)
	{
		
		String str="iLoveMyCountry";
		int n=str.length(),i=0,count=0;
		char c[]=str.toCharArray();
		
		for(i=0;i<c.length;i++)
		{
			if(c[i]>=65 && c[i]<=90)
			{
				System.out.print(c[i]+" ");
				count++;
			}
		}
		
		System.out.println("CamelCase is="+count);

	}

}
