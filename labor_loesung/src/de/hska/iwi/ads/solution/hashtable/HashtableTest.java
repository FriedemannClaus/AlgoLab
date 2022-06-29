package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.AbstractDictionary.DictionaryFullException;
import de.hska.iwi.ads.dictionary.MapTest;

class HashtableTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new Hashtable<K, V>(12); //für Tests 12
	}
	
	@Test
	void testFullAndStillFunctional() {
		Map<Integer, Integer> list = createMap();
	    
	    list.put(5, 6);
	    list.put(6, 7);
	    list.put(8, 9);
	    list.put(10, -1);
	    list.put(11, 0);
	    list.put(12, 6);
	    list.put(14, 13);
	    list.put(15, 13);
	    list.put(16, 13);
	    list.put(17, 13);
	    list.put(18, 13);
	    list.put(19, 13);
	    assertThrows(DictionaryFullException.class, () -> list.put(20, 20)); //13th entry, capacity = 12
	    assertEquals(12, list.size());
	    assertEquals(-1, list.get(10)); //still functional
	    assertEquals(7, list.get(6));
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
