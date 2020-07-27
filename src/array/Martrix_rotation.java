
//Matrix Array rotation
package array;

import java.util.Scanner;

public class Martrix_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]arr={{12,23,34},
						{45,56,61},
						{78,89,91}};
		int i=0,j=0;
		
		for( i=0;i<arr.length;i++)
		{
				//System.out.println(arr[i][0]);
			for(j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j] +" ");
				
			}
			System.out.println(" ");
		}
		
	
int nn=0;
Scanner sc =new Scanner(System.in);

System.out.println("how many time you want to rotate....?");
nn=sc.nextInt();
for(int k=0;k<nn;k++){
		
		for( i=0;i<arr.length;i++)
		{
			int temp=arr[i][0];
			
			for(j=0;j<arr.length-1;j++)
			{
					arr[i][j]=arr[i][j+1];			
			}
			arr[i][arr.length]=temp;
				
		}
}	
		System.out.println("after changes");
		for( i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j] +" ");
				
			}
			System.out.println(" ");
		}
	}

}
