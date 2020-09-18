package array;

//using collection

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_from_Array {

	public static void main(String[] args)
	{
		int a[]={1 , 2,3, 1, 2, 3};
		int b[]=new int[a.length];
		
		Set<Integer> dupli=new HashSet<Integer>();
	
		
		for(int c:a)
		{
			dupli.add(c);
		}
		
		for(Integer d:dupli)
		{
			System.out.println(d);
		}
		

	}

}
