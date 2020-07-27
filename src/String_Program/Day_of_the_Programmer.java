package String_Program;

import java.util.Scanner;

public class Day_of_the_Programmer {

	public static void main(String[] args) {
	
		int year;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yaer=");
		year=sc.nextInt();
		
		if(year>1700 && year<2700)
		{
			if(year%400==0 || year%4==0)
			{
				int k;
				k=256-244;
				
				System.out.println(k+"."+"9"+"."+year);
			}
			else
			{
				int k;
				k=256-243;
				String str="";
			
				  str=Integer.toString(k);
				  str=str+"."+"9"+"."+year;
				  System.out.println(str);
            }		
			}
			
			}
		}
		

	


