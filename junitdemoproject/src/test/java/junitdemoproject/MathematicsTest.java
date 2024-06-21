package junitdemoproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathematicsTest {
	
	Mathematics math;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Inside the before all class methods");
	}
	
	
	@AfterAll
	public static void afterClass() {
		System.out.println("Inside the after all class methods");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Inside the setup method");
		math = new Mathematics();
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Inside the teardown method");
		math = null;
	}

	@Test
	void testWhenBothAreZeros() {
		//Mathematics math = new Mathematics();
		System.out.println("Inside the test method- Both are zeros");
        assertEquals(0, math.add(0, 0));
        
	}
	
	@Test
	void testWheBothArePositives() {
		//Mathematics math = new Mathematics();
		System.out.println("Inside the test method- Both are positives");
        assertEquals(2, math.add(1, 1));
	}
	
	@Test
	void testWhenBothAreNegatives() {
		//Mathematics math = new Mathematics();
		System.out.println("Inside the test method- Both are negatives");
        assertEquals(-2, math.add(-1, -1));
	}
	
	@Test
	void testWhenOneIsPostive() {
		//Mathematics math = new Mathematics();
		System.out.println("Inside the test method- One is positive");
        assertEquals(0, math.add(1, -1));
	}
}
