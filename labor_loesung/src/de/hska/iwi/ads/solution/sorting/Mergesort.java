package de.hska.iwi.ads.solution.sorting;


public class Mergesort<E extends Comparable<E>> extends AbstractSolutionMergesort<E> {

	
	protected void merge(E[] a, int left, int m, int right) {
		int l = left;
		int r = m + 1;
		for (int i = left; i <= right; i++) {
			if( r > right || ((l <= m) && (a[l].compareTo(a[r]) <= 0))) {
				b[i] = a[l];
				l++;
			} else {
				b[i] = a[r];
				r++;
			}
		}
		for (int i = left; i <= right; i++) {
			a[i] = b[i];
		}
	}

}
