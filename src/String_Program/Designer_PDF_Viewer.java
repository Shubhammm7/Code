package String_Program;

public class Designer_PDF_Viewer {

	public static void main(String[] args) 
	{
		//int a[]={1 ,3 ,1, 3, 1, 4, 1, 3, 2, 5, 5 ,5, 5, 5 ,5 ,5 ,5, 5, 5, 5, 5, 5, 5, 5 ,5 ,5};
		int a[]={1 ,3, 1, 3, 1, 4, 1, 3, 2, 5 ,5 ,5 ,5, 5, 5, 5, 5, 5, 5, 5 ,5 ,5, 5, 5 ,5 ,7};
		

		String word="zaba";
		int b=0,a1=0;
		for(int i=0;i<word.length();i++)
		{
				a1=word.charAt(i)-97;
				
				
				if(a[a1]>b)
				{
					b=a[a1];
				}
				
			
		}
		System.out.println(b);
	}

}
