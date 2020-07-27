import java.util.LinkedHashSet;

public class Collection_Duplicate_letters {

	public static void main(String[] args)
	{
		String str="Shubham";
		
		char c[]=str.toCharArray();
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		
		for(char cd:c)
		{
			lhs.add(cd);
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(Character cc:lhs)
		{
			sb.append(cc);
		}
		System.out.println(sb.toString());
		

	}

}
