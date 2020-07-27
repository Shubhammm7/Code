package String_Program;

public class String_Reverse_With_Capital_first
{
	public static void main(String [] args)
	{
		String str="this is Shubham";
		
		String[] words = str.split(" ");
		
		
		String reversedString = "";
		
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			
			reverseWord = reverseWord + word.charAt(j);
			
			reverseWord=reverseWord.substring(0,1).toUpperCase()+reverseWord.substring(1);
			}
		   reversedString = reversedString + reverseWord + " ";
		   
		}
		System.out.println(str);
		
		System.out.println(reversedString);
		
		
		
		
	}


}
