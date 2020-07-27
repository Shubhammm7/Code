import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Anagram 
{
	
	public static void main(String argd[])
	{
		
			   String s = "shubham",s1= "shubham";
			   
			   int sum=0,sum1=0;
			   	char c[]=s.toCharArray();
			   	char d[]=s1.toCharArray();
			   	
			   	for(int i=0;i<c.length;i++)
			   	{
			   		int k=c[i];
			   
			   		sum=sum+k;
			   		
			   		int j=d[i];
			   		sum1=sum1+j;
			   		
			   		
			   	}
			   	
			   	System.out.println(sum+" "+sum1);
			}
	}
	
	
	
	


