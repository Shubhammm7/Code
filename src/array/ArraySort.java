package array;

public class ArraySort {

	public static void main(String[] args) {
		int [] a={4,3,7,1};
		int [] srt=new int[100];
		
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
		srt[n]=a[i];
		}
		
	for(int i=0;i<srt.length;i++)
		{	if(srt[i]>0)
			System.out.println(srt[i]+"-");
		}
		

	}

}
//C:\Program Files\Java\jre1.8.0_241\bin