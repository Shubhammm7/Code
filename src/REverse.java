
public class REverse {

	public static void main(String[] args) 
	{
		
		String str="AbA",str2="";
		
		
		int a=str.length()-1,i=0;
		
		for(i=a;i>=0;i--)
		{
			
			str2=str2+str.charAt(i);
		}
		
		
		if(str2.equals(str))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
