
public class StringShift 
{
public static void main(String [] Panda)
{
	
	String s="Snehanka3";
	int n=s.length();
	
	for(int i=0;i<=n;i++)
	{
		System.out.println(s.substring(i,n)+s.substring(0,i));
	}
}
}
