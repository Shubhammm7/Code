package array;

public class RepeatedNumberInArray {

	public static void main(String[] args) {
		int[] a={1,1,1,2,2,4,199,199};
		
		int[]arr=new int[200];
		
		for(int i=0;i<a.length;i++)
		{
			arr[a[i]]++;
			
		}
		

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			System.out.println("number is = "+i+" = reated"+" "+arr[i]);
			
		}

	}

}
