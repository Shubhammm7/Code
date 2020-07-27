package array;

public class LongestSubarray {

	public static void main(String[] args) {
		
		int []arr={0,1,1,1,2,2,3,3};
		int arr_count=0;
        for(int i=0;i<arr.length-1;i++)
        {
        	    // System.out.print(arr[i]);
        	
            for(int j=i+1;j<arr.length;j++)
            {
                    if(arr[i]>arr[j])
                    {
                        int temp=0;
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        
                    }

            }
       
    
        }
        for(int i=0;i<arr.length-1;i++)
        {
        	//System.out.print(arr[i]);
        }
    
        for(int i=0;i<arr.length-1;i++)
        {
        	 int count=1;
        	 
        	 for(int j=i+1;j<arr.length;j++)
             {
        		 if(arr[i]!=arr[j])
        		 {
        			 break;
        		
        		 }
        		 else
        		 {
        			 count++;
        		 }
             }
        	 if(count==2)
        	 {
        		arr_count++; 
        	 }
        	
        }
       if(arr_count>0)
        {
            System.out.println(arr_count);
        }else
        {
        	System.out.println(0000);
        }
		 
		
		
		
	}

}
