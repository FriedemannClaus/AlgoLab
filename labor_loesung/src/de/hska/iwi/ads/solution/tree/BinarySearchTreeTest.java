package de.hska.iwi.ads.solution.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class BinarySearchTreeTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new BinarySearchTree<K, V>();
	}
	
	
	@Test
	void test1() {
		Map<Integer, Integer> list = createMap();
	    
	    list.put(5, 6);
	    list.put(6, 7);
	    list.put(8, 9);
	    list.put(10, -1);
	    assertEquals(4, list.size());
	    assertEquals(-1, list.get(10));
	    assertEquals(7, list.get(6));
	}
	
	@Test
	void test2() {
		Map<Integer, Integer> list = createMap();
	    
	    list.put(5, 6);
	    list.put(6, 7);
	    list.put(6, 8);
	    list.put(10, -1);
	    assertEquals(3, list.size());
	    assertEquals(8, list.get(6));
	    assertEquals(-1, list.get(10));
	}
	
	@Test
	void testThrow1() {
		Map<Integer, Integer> list = createMap();
	    
	    list.put(5, 6);
	    list.put(6, 7);
	    list.put(6, 8);
	    assertThrows(UnsupportedOperationException.class, () -> list.remove(5));
	}

	@Test
	void testThrow2() {
		Map<Integer, Integer> list = createMap();
	    
	    list.put(5, 6);
	    list.put(6, 7);
	    list.put(6, 8);
	    assertThrows(UnsupportedOperationException.class, () -> list.clear());
	}

}
