package Algorithms;

public class FibbonaciRecursive {

	public int fib(int n) {
		if ( n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void main(String args[]) {
		FibbonaciRecursive rc = new FibbonaciRecursive();
		int num = rc.fib(6);
		System.out.println(num);
	}
}
