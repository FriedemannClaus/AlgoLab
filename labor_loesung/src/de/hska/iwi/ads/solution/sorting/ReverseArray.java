/**
 * 
 */
package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

/**
 * @author Friedemann
 * @param <E>
 *
 */
public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {

	@Override
	public void reverse(E[] a, int from, int to) {
		E zs; //Konstant viel Zusatzspeicher
		for (int i = 0; i <= (to - from) / 2; i++) { // "/" = "div"
			zs = a[from + i];
			a[from + i] = a[to - i];
			a[to - i] = zs;
		}
		
	}

}
