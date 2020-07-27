
public class Charcount {

	public static void main(String[] args)
	{
		String str="Shubhammm7";
		
		int i=0,j=0;
		int arr[]=new int[str.length()];
		int count=0;
		for(i=0;i<str.length()-1;i++)
				{
			count=0;
					/*for(j=i;j<str.length();j++)
					{
						if(str.charAt(i)==str.charAt(j))
						{
							count++;
							
						}
						count++;
						arr[i]=count;
					}*/
			if(str.charAt(i)==str.charAt(i+1))
			count++;
			arr[i]=count;
			
				}
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}

}
