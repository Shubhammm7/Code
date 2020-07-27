import java.util.Arrays;
import java.util.LinkedHashSet;

public class Collection_binary_decimal
{

	public static void main(String args[])
	{
		Integer a[]={1,0,0,0};
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(Arrays.asList(a));
		
	
		
		StringBuilder sb=new StringBuilder();
		
		for(Integer i:a)
		{
			System.out.println(sb.append(i));
		}
		
		String str=sb.toString();
		
		int d=Integer.parseInt(str,2);
		System.out.println(d);
		
		
	}
}
