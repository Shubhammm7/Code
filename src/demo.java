import java.util.Scanner;

class demo
{ 
	static public void main(String[] args) 
	    { 
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your number:=");
			int a=s.nextInt();
			int i,j;
			
	      for(i=2;i<=a;i++)
	      {
	    	  for( j=2;j<a/2;j++)
	    	  {
	    		 
	    			 if(i%j==1)
	    			 {
	    				  System.out.print(i+" ");
	    			 }
	    			 break;
	    				
	    			 
	    			 
	    	  }
	    	
	    	  	
	      }
	    	  
	      	
	        }
        	
	      
	    }
	  
