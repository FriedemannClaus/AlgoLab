package de.hska.iwi.ads.solution.sorting;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractSolutionMergesort<E> {

	protected void merge(E[] a, int left, int m, int right) {
		
		ReverseArray<E> reverser = new ReverseArray<E>();
		reverser.reverse(a, m + 1, right);
		
		int l = left;
		int r = right;
		
		for (int i = left; i <= right; i++) {
			if(a[l].compareTo(a[r]) <= 0) {
				b[i] = a[l];
				l++;
			} else {
				b[i] = a[r];
				r--;
			}
		}
		for (int i = left; i <= right; i++) {
			a[i] = b[i];
		}
	}

}
