/**
 * 
 */
package de.hska.iwi.ads.solution.hashtable;


import de.hska.iwi.ads.dictionary.AbstractHashMap;

/**
 * @author Friedemann
 *
 */
public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K, V> {

	public Hashtable(int capacity) {
		super(capacity);
	}

	@SuppressWarnings("unchecked")
	public V get(Object o) {
		if (o == null)
			throw new NullPointerException();	
		K key = (K) o;
		
		int i = 0;
		int j;
		do {
			j = hash(key.hashCode(), i);
			if(hashtable[j] != null && hashtable[j].getKey().compareTo(key) == 0)
				return hashtable[j].getValue();
			i++;
		} while(hashtable[j] != null && i < this.hashtable.length);
		return null;
	}
	
	public V put(K key, V value) {
		if (key == null)
			throw new NullPointerException();
		
		int i = 0;
		int j;
		do {
			j = hash(key.hashCode(), i);
			if(hashtable[j] == null) {
				hashtable[j] = new SimpleEntry<K,V>(key, value);
				size++;
				return null;
			}
			if(hashtable[j].getKey().compareTo(key) == 0) {//muss klappen
				V oldValue = hashtable[j].getValue();
				hashtable[j].setValue(value);
				return oldValue;
			}
			i++;
		} while(i < this.hashtable.length);
		throw new DictionaryFullException();
	}
	
	private int hash(int key, int i) {
		return ((key % this.hashtable.length) + i^2) % this.hashtable.length;
	}
	
	public void clear() {
		throw new UnsupportedOperationException();
	}
	public void remove(K key) {
		throw new UnsupportedOperationException();
	}
}