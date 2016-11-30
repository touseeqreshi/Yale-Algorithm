
public class SparseMatrix 
{

	public static void main(String[] args) throws Exception 
	{
		System.out.println("The random matrix is: ");
		Matrix m = new Matrix(4, 6, 8);
		m.display();
		System.out.println("");
		
		System.out.println("Matrix in Compress form with Yale Algorithm: ");
		Yale y = m.toYale();
		y.display();
		System.out.println("");
		
		System.out.println("Back to a matrix form:");
		Matrix m1 = y.toMatrix();
		m1.display();
	}

}