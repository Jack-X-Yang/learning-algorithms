package com.jack.learning.data.structure;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SymbolTableTest {
	SymbolTable st = null;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPut() {
		st.put(1, "a");
		assertEquals("a", st.get(1));

		st.put(1, null);
		assertEquals(null, st.get(1));
	}

	@Test
	public void testGet() {
		st.put(1, "a");
		assertEquals("a", st.get(1));

		assertEquals(null, st.get(2));
	}

	@Test
	public void testDelete() {
		st.put(1, "a");
		assertEquals("a", st.get(1));

		st.delete(1);
		assertEquals(null, st.get(1));
	}

	@Test
	public void testContains() {
		st.put(1, "a");
		assertTrue(st.contains(1));

		assertFalse(st.contains(2));
	}

	@Test
	public void testIsEmpty() {
		assertTrue(st.isEmpty());

		st.put(1, "a");
		assertFalse(st.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, st.size());

		st.put(1, "a");
		assertEquals(1, st.size());
	}

	@Test
	public void testKeys() {
		// TODO:完善测试
		fail("Not yet implemented");
	}

}
