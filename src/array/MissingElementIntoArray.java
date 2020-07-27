package array;

public class MissingElementIntoArray {

	public static void main(String[] args) {
		int miss[]={1,2,3,5,6,7};

			int total=(1+miss.length)*(2+miss.length)/2;
			
			for(int a:miss)
			{
				total-=a;
			}
			System.out.println("missing number is="+total);
	}

}
