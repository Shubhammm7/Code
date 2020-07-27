package Matrix;

public class Matrix_row_rotation {

	public static void main(String[] args) {
	
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		int[][] rotate=new int[3][3];
		int n=mat.length,k=1;
		
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat.length;j++)
				{
					rotate[i][(j+k)%n]=mat[i][j];
					System.out.print(mat[i][j]+" ");
					
				}
				System.out.println();
			}
			
			System.out.println("---------------MAtric after rotation--------------");
			for(int i=0;i<rotate.length;i++)
			{
				for(int j=0;j<rotate.length;j++)
				{
					System.out.print(rotate[i][j]+" ");
					
				}
				System.out.println();
			}

	}

}
