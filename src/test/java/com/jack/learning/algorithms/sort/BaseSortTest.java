package com.jack.learning.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class BaseSortTest {
	BaseSort sortAlgorithms = null;

	@Before
	abstract void setUp() throws Exception;

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		String[] s = { "s", "o", "r", "t", " ", "e", "x", "a", "m", "p", "l", "e" };
		sortAlgorithms.sort(s);
		assertTrue(BaseSort.isSorted(s));
	};

	@Test
	public void testLess() {
		String[] s1 = { "a", "b" };
		String[] s2 = { "b", "a" };
		assertTrue(BaseSort.less(s1[0], s1[1]));
		assertFalse(BaseSort.less(s2[0], s2[1]));
	}

	@Test
	public void testExch() {
		String[] s1 = { "a", "b" };
		String[] s2 = { "b", "a" };
		BaseSort.exch(s1, 0, 1);
		assertArrayEquals(s2, s1);
	}

	@Test
	public void testIsSorted() {
		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "c", "b", "a" };

		assertTrue(BaseSort.isSorted(s1));
		assertFalse(BaseSort.isSorted(s2));
	}

}
