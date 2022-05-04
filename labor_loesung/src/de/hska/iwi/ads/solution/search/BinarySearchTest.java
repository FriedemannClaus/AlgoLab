package de.hska.iwi.ads.solution.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

public class BinarySearchTest extends SearchTest {

	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		return new BinarySearch<E>();
	}
	
	@Test
	void testSearchIntDouble() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {0, 2, 4, 7, 7, 10, 11};
	    
	    assertEquals(3, search.search(a, 7, 0, a.length - 1));
	}
	
	@Test
	void testSearchIntDouble2() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {0, 2, 7, 7, 9, 10, 11};
	    
	    assertEquals(2, search.search(a, 7, 0, a.length - 1));
	}
	
	@Test
	void testSearchIntDouble3() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {0, 2, 6, 7, 9, 10, 10, 11};
	    
	    assertEquals(5, search.search(a, 10, 0, a.length - 1));
	}
	
	@Test
	void testSearchIntMultiple() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {5, 5, 5, 5, 5, 5, 5, 5};
	    
	    assertEquals(0, search.search(a, 5, 0, a.length - 1));
	}
	
	@Test
	void testSearchIntMultiple2() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {5, 5, 5, 5, 5, 5, 5, 5};
	    
	    assertEquals(1, search.search(a, 5, 1, a.length - 1)); // Search from index 1
	}
	
	@Test
	void testSearchIntNotFound() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {5, 5, 5, 5, 5, 5, 5, 5};
	    
	    assertEquals(0, search.search(a, 5, 0, a.length - 1)); // Search from index 1
	}
	
	@Test
	void testSearchIntNotFound2() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {0, 2, 4, 7, 7, 10, 11};
	    
	    assertEquals(3, search.search(a, 5, 0, a.length - 1));
	}
	
	void testSearchIntNotFound3() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {0, 2, 4, 7, 7, 9, 11};
	    
	    assertEquals(6, search.search(a, 10, 0, a.length - 1));
	}
	
	
}
