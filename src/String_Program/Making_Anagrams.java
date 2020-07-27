/* String a="cde",b="abc";  
 * We delete the following characters from our two strings to turn them into anagrams of each other:
Remove d and e from cde to get c.
Remove a and b from abc to get c.
We must delete 4  characters to make both strings anagrams, so we print 4 on a new line*/

package String_Program;

public class Making_Anagrams {

	public static void main(String[] args)
	{
		String a="fcrxzwscanmligyxyvym";
		String b="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
	int [] alph=new int[26];
	int n=0,aa=0,total=0;
	
	for(int i=0;i<a.length();i++)
	{
		aa=a.charAt(i);   /*convert into ascci value*/
		n=aa-97;			/*Conversion into between range 0-26*/
		alph[n]++;			/*count increased in integer array*/
	}

	
	for(char c:b.toCharArray())  /*char c:b.toCharArray() ditectly convert into char*/
	{
		alph[c-'a']--;
	}
	
	for(int i:alph)	
	{
		total+=Math.abs(i);
	}
	System.out.println( total);
}}
