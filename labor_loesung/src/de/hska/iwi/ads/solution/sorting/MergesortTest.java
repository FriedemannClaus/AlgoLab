/**
 * 
 */
package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;



class MergesortTest {
	
	public <E extends Comparable<E>> Mergesort<E> createMergesort() {
		return new Mergesort<E>();
	}

	@Test
	void test() {
		Integer[] test =   {1,4,2,6,5};
		Integer[] result = {1,2,4,5,6};
		
		Mergesort<Integer> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test2() {
		Integer[] test =   {7,5,3,67,1777744444};
		Integer[] result = {3,5,7,67,1777744444};
		
		Mergesort<Integer> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test3() {
		Integer[] test =   {2,1,3,67,4567};
		Integer[] result = {1,2,3,67,4567};
		
		Mergesort<Integer> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test4() {
		Integer[] test =   {-2,1,3,67,4567};
		Integer[] result = {-2,1,3,67,4567};
		
		Mergesort<Integer> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test5() {
		Integer[] test =   {1,-2,3,67,4567};
		Integer[] result = {-2,1,3,67,4567};
		
		Mergesort<Integer> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	@Test
	void test6() {
		Integer[] test =   {1,-2,3,67,4567};
		Integer[] result = {-2,1,3,67,4567};
		
		Mergesort<Integer> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i], test[i]);
		}
	}
	
	//Testclass
	private class Person implements Comparable<Person> {
		String name;
		LocalDate birthday;
		private Person(String name, LocalDate birthday) {
			this.name = name;
			this.birthday = birthday;
		}
		

		@Override
		public int compareTo(Person otherPerson) {
			return this.birthday.compareTo(otherPerson.birthday);
		}
	}
	
	@Test
	void test7() {
		Person p1 = new Person("Johannes", LocalDate.of(1998, Month.JANUARY, 1));
		Person p2 = new Person("Felix", LocalDate.of(1998, Month.JANUARY, 1));
		Person p3 = new Person("David", LocalDate.of(1999, Month.JANUARY, 1));
		Person p4 = new Person("Peter", LocalDate.of(1997, Month.JANUARY, 1));
		Person p5 = new Person("Justus", LocalDate.of(2000, Month.JANUARY, 1));
		
		Person[] test = {p1, p2, p3, p4, p5};
		Person[] result = {p4, p1, p2, p3, p5};
		
		Mergesort<Person> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i].birthday, test[i].birthday);
			assertEquals(result[i].name, test[i].name); //Stabilitaet testen
		}
	}
	
	void test8() {
		Person p1 = new Person("Johannes", LocalDate.of(1998, Month.JANUARY, 1));
		Person p2 = new Person("Felix", LocalDate.of(1998, Month.JANUARY, 1));
		Person p3 = new Person("David", LocalDate.of(1999, Month.JANUARY, 1));
		Person p4 = new Person("Peter", LocalDate.of(1997, Month.JANUARY, 1));
		Person p5 = new Person("Justus", LocalDate.of(2000, Month.JANUARY, 1));
		
		Person[] test = {p2, p1, p3, p4, p5};
		Person[] result = {p4, p2, p1, p3, p5};
		
		Mergesort<Person> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i].birthday, test[i].birthday);
			assertEquals(result[i].name, test[i].name); //Stabilitaet testen
		}
	}
	
	void test9() {
		Person p1 = new Person("Johannes", LocalDate.of(1998, Month.JANUARY, 1));
		Person p2 = new Person("Felix", LocalDate.of(1998, Month.JANUARY, 1));
		Person p7 = new Person("Kiron", LocalDate.of(1998, Month.JANUARY, 1));
		Person p3 = new Person("David", LocalDate.of(1999, Month.JANUARY, 1));
		Person p4 = new Person("Peter", LocalDate.of(1997, Month.JANUARY, 1));
		Person p5 = new Person("Justus", LocalDate.of(2000, Month.JANUARY, 1));
		
		Person[] test = {p2, p1, p3, p4, p7, p5};
		Person[] result = {p4, p2, p1, p7, p3, p5};
		
		Mergesort<Person> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i].birthday, test[i].birthday);
			assertEquals(result[i].name, test[i].name); //Stabilitaet testen
		}
	}
	
	void test10() {
		Person p1 = new Person("Johannes", LocalDate.of(1998, Month.JANUARY, 1));
		Person p2 = new Person("Felix", LocalDate.of(1998, Month.JANUARY, 1));
		Person p7 = new Person("Kiron", LocalDate.of(1998, Month.JANUARY, 1));
		Person p3 = new Person("David", LocalDate.of(1999, Month.JANUARY, 1));
		Person p4 = new Person("Peter", LocalDate.of(1997, Month.JANUARY, 1));
		Person p5 = new Person("Justus", LocalDate.of(2000, Month.JANUARY, 1));
		
		Person[] test = {p7, p2 , p3, p4, p5, p1};
		Person[] result = {p4, p7, p2, p1, p3, p5};
		
		Mergesort<Person> merger = createMergesort();
		merger.sort(test);
		for (int i = 0; i < test.length; i++) {
			assertEquals(result[i].birthday, test[i].birthday);
			assertEquals(result[i].name, test[i].name); //Stabilitaet testen
		}
	}
	
	

}
