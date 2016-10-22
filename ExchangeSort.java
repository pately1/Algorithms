package Algorithms;

public class ExchangeSort {
	public void exsort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
	
	public static void main (String[] args) {
		ExchangeSort es = new ExchangeSort();
		int[] elem = new int[]{5,2,8,6,9,4,4};
		es.exsort(elem);
		es.print(elem);
	}
}
