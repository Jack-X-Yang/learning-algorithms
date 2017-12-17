package com.jack.learning.algorithms.sort;

public class HeapSort extends BaseSort {

	@Override
	public void sort(Comparable[] a) {
		int N = a.length;
		for (int k = N / 2 - 1; k >= 0; k--) {
			sink(a, k, N - 1);
		}

		while (N > 1) {
			exch(a, 0, N - 1);
			N--;
			sink(a, 0, N - 1);
		}

	}

	private void sink(Comparable[] a, int k, int N) {
		while (2 * k + 1 <= N) {
			int j = 2 * k + 1;

			if (j < N && less(a[j], a[j + 1])) {
				j++;
			}

			if (!less(a[k], a[j]))
				break;

			exch(a, k, j);
			k = j;
		}
	}

}
