package array;

public class Find_Second_Largest {

	public static void main(String[] args) {
		int[] A={4,3,2,1};
		
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		
		
	for(int i=0;i<A.length;i++)
	{
		if(A[i]>highest)
		{
			secondHighest=highest;
			highest=A[i];
			
		}
		
		if(A[i]>highest && A[i]<secondHighest)
		{
			secondHighest=A[i];
		}
	}
	System.out.println(secondHighest);
	System.out.println(highest);
	}

}
