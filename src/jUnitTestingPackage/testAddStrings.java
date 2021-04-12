package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addStrings("Lab9", "Assignment");
		assertEquals("Lab9Assignment",result);
	}

}
