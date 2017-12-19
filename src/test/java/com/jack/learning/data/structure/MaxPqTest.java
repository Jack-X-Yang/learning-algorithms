package com.jack.learning.data.structure;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jack.learning.data.structure.MaxPQ;

public class MaxPqTest extends PriorityQueueTest {
	MaxPQ pq = null;

	@Before
	public void setUp() throws Exception {
		pq = new MaxPQ<Integer>(10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Override
	public void testIsEmpty() {
		assertTrue(pq.isEmpty());

		pq.insert(1);
		assertFalse(pq.isEmpty());
	}

	@Override
	public void testSize() {
		assertEquals(pq.size(), 0);

		pq.insert(1);
		assertEquals(pq.size(), 1);
	}

	@Test
	public void testInsert() {
		int a = 1;
		assertEquals(pq.size(), 0);

		pq.insert(a);
		assertEquals(pq.size(), 1);

		int b = (Integer) pq.delMax();
		assertEquals(a, b);
	}

	@Test
	public void testDelMax() {
		int[] a = { 1, 4, 2, 3, 5 };
		int[] b = { 5, 4, 3, 2, 1 };

		for (int c : a) {
			pq.insert(c);
		}

		for (int i = 0; i < a.length; i++) {
			assertEquals(pq.delMax(), b[i]);
		}
	}

}
