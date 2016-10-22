package Algorithms;

public class BinarySearch {
	public boolean bsearch(int[] a, int elem) {
		int low, mid, high;
		low = 0;
		high = a.length-1;
		while (low <= high) {
			mid = (int)Math.floor((low+high)/2);
			if (elem == a[mid]) {
				return true;
			}
			else if (elem < a[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int a[] = new int[]{2,4,6,8,12,14,16,77};
		boolean res = bs.bsearch(a, 1);
		System.out.println(res);
	}
}
