
public class Palimdrom {

	public static void main(String[] args) {
	
			int s=123,sum=0,r;
			int b=s;
			while(s>0)
			{
				
				r=s%10;
				// System.out.println("Rr="+r);
				sum=(sum*10)+r;
				//System.out.println("Sum="+sum);
				s=s/10;
				//System.out.println("s="+s);
			}
			
			if(sum==b)
			{
				System.out.println("Palimdrom");
			}
			else
			{
				System.out.println("noyt palimfrom..........");
			}
	}

}
