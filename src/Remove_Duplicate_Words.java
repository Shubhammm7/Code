
public class Remove_Duplicate_Words {

	public static void main(String[] args) 
	
	{
		
		String input="Welcome to Java Session Java Session Session Java"; //Input String	
		//input=input.toLowerCase();
		String[] words=input.split(" ");
		int count=0;//Split the word from String
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			if(words[i]!=null)
			{
			count=0;
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
				count++;
					words[j]=null;			//Delete the duplicate words
				}
			}
			if(count>0)
			System.out.println(count);
			}
		}
		for(int k=0;k<words.length;k++)		//Displaying the String without duplicate words	
		{
			if(words[k]!=null)
			{
				System.out.print(words[k]+" ");
			
			}
			
	     }  
	}

}
