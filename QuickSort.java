package Algorithms;

import java.util.Arrays;

public class QuickSort {
    int arr[];
    int low, high;

    public void sort(int[] a) {
        this.arr = a;
        this.low = 0;
        this.high = a.length - 1;
        quicksort(low, high);
    }
    public void quicksort(int low, int high) {
        int pivot = low;
        if (high > low) {
            partition(low, high, pivot);
          //  quicksort(low, pivot - 1);
            quicksort(pivot + 1, high);
        }
    }
    public void partition(int low, int high, int pivot) {
        int i,j;
        int pivotitem = pivot;
        j = low;
        for (i = low + 1; i <= high; i++) {
            if (arr[i] < arr[pivot]) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            pivot = j;
            int temp = arr[pivot];
            arr[pivot] = arr[low];
            arr[low] = temp;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = new int[]{15,22,13,27,12,10,20,25};
        qs.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
