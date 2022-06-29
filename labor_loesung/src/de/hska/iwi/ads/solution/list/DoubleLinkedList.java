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
		if (o == null)
			throw new NullPointerException();
		
		K key = (K) o;
		ListElement listElement = search(key);
		if(listElement == null)
			return null;
		return listElement.entry.getValue();
	}
	
	public V put(K key, V value) {
		if (key == null)
			throw new NullPointerException();
		
		ListElement x = search(key);
		if(x != null) { //schon ein Element gefunden
			V oldValue = x.entry.getValue();
			x.entry.setValue(value);
			return oldValue;
		}
		//Element nicht gefunden (evtl. ist head null)
		Entry<K,V> entry = new SimpleEntry<K,V>(key, value);
		ListElement previous = null;
		ListElement next = head;
		ListElement insert = new ListElement(entry, previous, next);
		if(head != null) 
			head.previous = insert;
		head = insert;
		
		size++;
		
		return null;
	}
	
	private ListElement search(K key) {
		ListElement x = head;
		while (x != null) {
			if(x.entry.getKey() == key) {
				return x;
			}else {
				x = x.next;
			}
		}
		return x; //returns null if head is null
	}
	
	public void clear() {
		throw new UnsupportedOperationException();
	}
	public void remove(K key) {
		throw new UnsupportedOperationException();
	}
}