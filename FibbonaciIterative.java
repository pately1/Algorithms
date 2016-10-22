package Algorithms;

public class FibbonaciIterative {
	public int fib2(int n) {
		int index = 0;
		int arr[] = new int[n+1];
		arr[index] = 0;
		if (n > 0) {
			arr[index+1] = 1;
			for (index = 2; index < n+1; index++) {
				arr[index] = arr[index-1] + arr[index-2];
			}
		}
//		for(int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}
		return arr[n];
	}
	public static void main (String[] args) {
		FibbonaciIterative fi = new FibbonaciIterative();
		int result = fi.fib2(6);
		System.out.println(result);
	}
}
