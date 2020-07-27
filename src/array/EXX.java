package array;

public class EXX {

	public static void main(String[] args) {
int b=0;
		try{
			b=10/0;
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("finally");
		}
		


System.out.println(b);
	}

}
