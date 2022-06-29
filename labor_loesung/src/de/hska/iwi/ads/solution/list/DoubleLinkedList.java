/**
 * 
 */
package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

/**
 * @author Friedemann
 *
 */
public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	@SuppressWarnings("unchecked")
	public V get(Object o) {
		o = (K) o;
		ListElement listElement = search(o);
		listElement == null ? return null : 
		return search(o);
	}
	
	public V put(K key, V value) {
		if(search(key) != null) {
			
		}
		return null;
	}
	
	private ListElement search(K key) {
		
		return null;
	}
}
