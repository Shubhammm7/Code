

public class count_Remove_Duplicate 
{

public static void main(String [] args)
{
	
		String s="AAAA";
		int count=0,k=0;
		
		
		String str[]=s.split("");
		
		for(int i=1;i<s.length();i++)
		{
			
				if(str[k].equals(str[i])||str[k].equals(str[i]))
				{
					count++;
				//System.out.println("hi");
					str[i]=null;
				}
				
				
				
				
				
			
			
				System.out.println(count);
				//Arrays.sort(str);
			
			
		}
	
}
}
