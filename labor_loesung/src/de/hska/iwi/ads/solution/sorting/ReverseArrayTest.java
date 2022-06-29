package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseArrayTest {



	public <E extends Comparable<E>> ReverseArray<E> createReverseArray() {
		return new ReverseArray<E>();
	}

	@Test
	void test() {
		Integer[] test =   {1,4,2,6,5};
		Integer[] result = {1,4,6,2,5};
		
		ReverseArray<Integer> reverser = createReverseArray();
		reverser.reverse(test, 2, 3);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test2() {
		Integer[] test =   {1,4,2,6,5};
		Integer[] result = {1,4,2,6,5};
		
		ReverseArray<Integer> reverser = createReverseArray();
		reverser.reverse(test, 2, 2);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test3() {
		Integer[] test =   {1,4,2,6,5};
		Integer[] result = {1,6,2,4,5};
		
		ReverseArray<Integer> reverser = createReverseArray();
		reverser.reverse(test, 1, 3);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test4() {
		Integer[] test =   {1,4,2,6,5};
		Integer[] result = {6,2,4,1,5};
		
		ReverseArray<Integer> reverser = createReverseArray();
		reverser.reverse(test, 0, 3);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test5() {
		Integer[] test =   {1,4,2,6,5};
		Integer[] result = {5,6,2,4,1};
		
		ReverseArray<Integer> reverser = createReverseArray();
		reverser.reverse(test, 0, 4);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test6() {
		Integer[] test =   {4,5,5,3,8,1};
		Integer[] result = {1,8,3,5,5,4};
		
		ReverseArray<Integer> reverser = createReverseArray();
		reverser.reverse(test, 0, test.length - 1);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	

}
