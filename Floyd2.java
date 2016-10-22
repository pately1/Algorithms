package Algorithms;
// Floyd Algorithm to find Shortest Path.
public class Floyd2 {
    public void floyd(int n, double[][] W, double[][] D, double[][] P) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                P[i][j] = 0;
            }
        }
        D = W;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (D[i][j] > D[i][k] + D[k][j]) {
                        P[i][j] = k;
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
    }

    public void path(int p1, int p2, double[][] P) {
        if (P[p1][p2] != 0) {
            path(p1, (int)P[p1][p2], P);
            System.out.print("V"+(int)P[p1][p2] + ",");
            path((int)P[p1][p2],p2,P);
        }
    }

    public static void main (String[] args) {
        Floyd2 fd = new Floyd2();
        double[][] mat = new double[][]{
                {0,4,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,2},
                {1,0,3,4,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {6,3,0,7,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY},
                {6,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,0,2,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,5,0,Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,2,3,0}
        };
        double[][] result = new double[6][6];
        double[][] paths = new double[6][6];
        fd.floyd(6, mat, result, paths);
        fd.path(3,2,paths);
        for (int i = 0; i < paths.length; i++) {
            for (int j =0; j < paths.length; j++) {
                System.out.print((int)paths[i][j] + ",");
            }
        }
    }
}
