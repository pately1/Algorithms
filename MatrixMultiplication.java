package Algorithms;

public class MatrixMultiplication {
	
	public void matrixmul(int[][] a, int[][] b, int n, int[][] result) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = 0;
				for (int k = 0; k < n; k++) {
					result[i][j] = result[i][j] + a[i][k] * b[k][j];
				}
			}
		}
	}
	public void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j] + ",");
			}
		}
	}

	public static void main (String[] args) {
		MatrixMultiplication mm = new MatrixMultiplication();
		int n = 2;
		int[][] a = new int[][]{
			{2,3},
			{4,1}
		};
		int[][] b = new int[][]{
			{5,7},
			{6,8}
		};
		int[][] c = new int[n][n];
		mm.matrixmul(a, b, n, c);
		mm.print(c);
	}
}
