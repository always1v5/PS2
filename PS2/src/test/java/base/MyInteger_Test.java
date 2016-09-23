package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	MyInteger testNumber1 = new MyInteger(54);
	MyInteger testNumber2 = new MyInteger(99);
	MyInteger testNumber3 = new MyInteger(12);
	MyInteger testNumber4 = new MyInteger(13);
	MyInteger testNumber5 = new MyInteger(54);
	MyInteger testNumber6 = new MyInteger(65);

	
	@Test
	public void test(){
		
		assertTrue(testNumber1.isEven());
		assertFalse(testNumber2.isOdd());
		assertFalse(testNumber3.isPrime());
		
		assertTrue(testNumber4.isEven());
		assertFalse(testNumber5.isOdd());
		assertFalse(testNumber6.isPrime());
		
		}
	@Test
	public void testTwo(){
		
		assertTrue(testNumber1.isEven(100));
		assertTrue(testNumber2.isOdd(111));
		assertTrue(testNumber3.isPrime(111));
		
		assertTrue(testNumber4.isEven(100));
		assertTrue(testNumber5.isOdd(111));
		assertTrue(testNumber6.isPrime(111));
	}
	@Test
	public void testThree(){
		
		assertTrue(testNumber1.isEven());
		assertFalse(testNumber5.isOdd());
		assertFalse(testNumber2.isPrime());
		
	}
	public void testFour(){
		assertFalse(testNumber1.equals(54));
		assertFalse(testNumber3.equals(12));
	}
}
	
	




	
	



