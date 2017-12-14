package com.jack.learning.algorithms.sort;

public class Quick extends BaseSort {

	@Override
	public void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
		show(a);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (lo < hi) {
			int p = partation(a, lo, hi);
			sort(a, lo, p - 1);
			sort(a, p + 1, hi);
		}
	}

	private static int partation(Comparable[] a, int lo, int hi) {
		int i = lo + 1;
		int j = hi;
		Comparable v = a[lo];
		while (i < j) {
			while (less(a[i], v)) {
				if (i == hi) break;
				i++;
			}

			while (less(v, a[j])) {
				if (j == lo) break;
				j--;
			}

			if (i >= j) break;

			exch(a, i, j);
		}

		exch(a, lo, j);

		return j;
	}

}