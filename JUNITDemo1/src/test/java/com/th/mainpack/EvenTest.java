package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenTest {

	@Test
	public void test() {
		EvenOddClass ob = new EvenOddClass();
		assertEquals(true,ob.isEvenNumber(12));
		assertEquals(false,ob.isEvenNumber(11));
		assertEquals(true,ob.isEvenNumber(11));
	}

}
