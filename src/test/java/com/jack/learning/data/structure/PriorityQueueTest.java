package com.jack.learning.data.structure;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public abstract class PriorityQueueTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	abstract public void testIsEmpty();

	@Test
	abstract public void testSize();

}
