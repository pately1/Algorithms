package Algorithms;

public class Bionomial {
    public int bin (int n, int k) {
        int arr[][] = new int[n+1][k+1];
        int i,j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= Math.min(i,k); j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        return arr[n][k];
    }

    public static void main (String[] args) {
        Bionomial bco = new Bionomial();
        int ans = bco.bin(4,2);
        System.out.println(ans);
    }
}
