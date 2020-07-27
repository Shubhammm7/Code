package Matrix;

public class MatrixPattern {

	public static void main(String[] args) {
		
		int [][]a={{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int j=0;
		for(int i=0;i<a.length;i++)
		{int count=0;
			for( j=0;j<a.length;j++)
			{
					if(i==0)
					{
						System.out.print(a[i][j]+ " ");
					}
					else if(i==1)
					{
						count++;
						System.out.print(a[j+1][3]+"--");
						if(count==3)
							break;
					}
					else if(i==2)
					{
						count++;
						System.out.print(a[a.length-1][a.length-2-j]+" ");
						if(count==3)
							break;
					}
					else if(i==3)
					{
						System.out.print(a[2][0]);
						break;
					}
					else
					{
						count++;
						System.out.print(a[1][j]);
						if(count==3)
							break;
					}
			}
			
			
			System.out.println();
		}

	}

}
