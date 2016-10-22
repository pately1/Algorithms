package Algorithms;

//import java.util.Arrays;

public class Floyd {
    public void floyd(int n, double[][] W, double[][] D) {
        D = W;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                }
            }
        }
        for (int i = 0; i < D.length; i++) {
            for (int j =0; j < D.length; j++) {
                System.out.print((int)D[i][j] + ",");
            }
        }
    }

    public static void main (String[] args) {
        Floyd fd = new Floyd();
        double[][] mat = new double[][]{
                {0,4,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,2},
                {1,0,3,4,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {6,3,0,7,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {6,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,0,2,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,5,0,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,2,3,0}
    };
    double[][] result = new double[6][6];
        fd.floyd(6, mat, result);

    }
}
