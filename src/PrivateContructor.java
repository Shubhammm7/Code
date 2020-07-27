
public class PrivateContructor {
	private PrivateContructor()
	{
		System.out.println("Private Contructor");
	}

	public static void main(String[] args) {
		
		PrivateContructor pv=new PrivateContructor();
		PrivateContructor pv1=new PrivateContructor();

	}

}
