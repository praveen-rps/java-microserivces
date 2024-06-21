package junitdemoproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoServiceTest {
	
	DemoService demoService;
	
	@BeforeEach
	public void setUp() {
		demoService = new DemoService();
	}

	@Test
	void test() {
		
		
	Exception exp=	assertThrows(IllegalArgumentException.class,
				()->demoService.performAction(null) );
	
	    assertEquals("Invalid input", exp.getMessage());
		
		
	}

}
