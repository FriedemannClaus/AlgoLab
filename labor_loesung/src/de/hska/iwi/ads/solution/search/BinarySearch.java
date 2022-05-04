package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {
	
	boolean found;
	
	public BinarySearch() {
		found = false;
	}

	@Override
	public int search(E[] a, E key, int left, int right) {
		
		if (key.compareTo(a[left]) < 0)
			return left - 1;
		if (key.compareTo(a[right]) > 0)
			return right + 1;
		
		found = false;
		
		int i = binarySearch(a, key, left, right);
		
		if(a[i].compareTo(key) >= 0)
			return i;
		else //< 0
			return i + 1;
	}
	
	private int binarySearch(E[] a, E key, int left, int right) {
		if (left > right) {
			found = false;
			return right;
		}
		else {
			int i = (left + right) / 2;
			if (key.compareTo(a[i]) == 0) {
			
				int iLeft = binarySearch(a, key, left, i - 1);
				if (found == true)
					return iLeft;
				else {
					found = true;
					return i;
				}
			}
			else if (key.compareTo(a[i]) < 0)
				return binarySearch(a, key, left, i - 1);
			else
				return binarySearch(a, key, i + 1, right);
		}
	}
}
