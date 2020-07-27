package array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) 
	{
		int[] a={3,4,5,6};
		int n=a.length;
		//int [] queries=new int[a.length];
	
        int[] b=new int[n];
       // int res[]=new int[queries.length];
        int x,k=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rotate value");
        k=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
             b[(i+k)%n] = a[i];
              // System.out.println(b[i]);
        }
         
        for(int i=0;i<b.length;i++){
                
               
                System.out.print(b[i]);
                
        }
         

	}

}
