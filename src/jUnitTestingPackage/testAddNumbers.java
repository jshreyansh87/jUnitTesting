package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumbers(40, 50);
		assertEquals(90,result);
	}

}
