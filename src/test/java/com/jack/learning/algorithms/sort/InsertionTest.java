package com.jack.learning.algorithms.sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertionTest extends BaseSortTest {

	@Before
	public void setUp() throws Exception {
		sortAlgorithms = new Insertion();
	}

	@After
	public void tearDown() throws Exception {
	}

}
