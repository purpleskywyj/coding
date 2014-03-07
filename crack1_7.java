package cracking_test;

public class cracking_test {
	
	public static void setZeros(int[][] matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i = 0 ;  i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length ; j++)
			{
				if(matrix[i][j]==0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i=0; i < row.length; i++)
		{
			for(int j = 0; j<column.length; j++)
			{
				if(row[i] = true) matrix[i][j] = 0;
				if(column[j] = true) matrix[i][j] = 0;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[][] m={{1,0,3},{2,3,0},{0,3,3}};
		setZeros(m);
		
	}
}
