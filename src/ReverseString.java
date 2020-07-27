/*Reverse whole string*/
public class ReverseString
{
static public void main(String []s)
{
	String str="My name is S";
	
	
	
	String[] arr=str.split(" ");
	
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
		
	}
	
	
}

}
