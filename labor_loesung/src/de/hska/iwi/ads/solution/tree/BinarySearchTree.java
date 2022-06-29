package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K, V> {

	@SuppressWarnings("unchecked")
	public V get(Object o) {
		if (o == null)
			throw new NullPointerException();
		
		K key = (K) o;
		
		Node node = deepSearch(key, root);
		
		if(node == null)
			return null;
		return node.entry.getValue();
	}
	
	public V put(K key, V value) {
		if (key == null)
			throw new NullPointerException();
		
		Node x = deepSearch(key, root);
		if(x != null) { //schon ein Element gefunden
			V oldValue = x.entry.getValue();
			x.entry.setValue(value);
			return oldValue;
		}
		//Element nicht gefunden (evtl. ist head null)
		Node toInsert = new Node(key, value);
		root = insert(toInsert, root);
		
		size++;
		
		return null;
	}
	
	private Node deepSearch(K key, Node current) {
		if(current == null)
			return null;
		
		if(current.entry.getKey().compareTo(key) == 0) //found it
			return current;
		
		if(current.left == null && current.right == null)
			return null;
		
		if(current.entry.getKey().compareTo(key) < 0) {
			if(current.left == null)
				return null;
			return deepSearch(key, current.left);
		}
		// "x < key"
		if(current.right == null)
			return null;
		return deepSearch(key, current.right);
	}
	
	private Node insert(Node toInsert, Node current) {
		if(current == null)
			return toInsert; //now inserted
		
		if(current.entry.getKey().compareTo(toInsert.entry.getKey()) < 0) {
			current.left = insert(toInsert, current.left); //also and especially works 
														   //when current.left == null
			return current;
		}
		// "current < insert" (toInsert isn't in the tree)
		current.right = insert(toInsert, current.right);
		return current;
	}
	
	public void clear() {
		throw new UnsupportedOperationException();
	}
	public void remove(K key) {
		throw new UnsupportedOperationException();
	}
}
