import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Duplicate_number {

	public static void main(String[] args) 
	
	{
		
		Integer[] a={10,20,30,10,20};
		
		//String str="AAAAAAAAA";

			Set<Integer> s=new LinkedHashSet<>(Arrays.asList(a));
				 
			//s.add();
			for(Integer i:s)
			{
				
				System.out.println(i);
			}

	}

}
