package Algorithms;

public class SeqSearch {
	public boolean seqSearch(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if( a[i] == x ) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		SeqSearch ss = new SeqSearch();
		int[] elem = new int[]{1,2,3,4,5};
		System.out.println(ss.seqSearch(elem, 6));
	}
}
