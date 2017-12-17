package com.jack.learning.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HeapSortTest extends BaseSortTest {

	@Before
	public void setUp() throws Exception {
		sortAlgorithms = new HeapSort();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

}
