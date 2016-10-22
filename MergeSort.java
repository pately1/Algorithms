package Algorithms;

public class MergeSort {

    public void mergesort(int n, int[] a) {
        if (n > 1) {
            int h = (int)Math.floor(n/2), m = n-h;
            int[] U = new int[h];
            int[] V = new int[m];
            System.arraycopy(a,0,U,0,h);
            System.arraycopy(a,h,V,0,m);
            mergesort(h,U);
            mergesort(m,V);
            merge(h,m,U,V,a);
        }
    }

    public void merge(int h, int m, int[] U, int[] V, int[] a) {
        int i,j,k;
        i=0;
        j=0;
        k=0;
        while (i < h && j < m) {
            if (U[i] < V[j]) {
                a[k] = U[i];
                i++;
            }
            else {
                a[k] = V[j];
                j++;
            }
            k++;
        }
        if (i >= h) {
            System.arraycopy(V,j,a,k,m-j);
        }
        else {
            System.arraycopy(U,i,a,k,h-i);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = new int[]{27,10,12,20,25,13,15,22};
        ms.mergesort(arr.length, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

}
