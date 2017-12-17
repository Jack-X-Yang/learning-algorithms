package com.jack.learning.algorithms.sort;

public class MergeBU extends BaseSort {

	private static Comparable[] aux = null;

	@Override
	public void sort(Comparable[] a) {
		int N = a.length;
		aux = new Comparable[N];

		for (int sz = 1; sz < N; sz *= 2) {
			for (int lo = 0; lo < N - sz; lo += sz * 2) {
				merge(a, lo, lo + sz - 1, Math.min(lo + sz * 2 - 1, N - 1));
			}
		}
	}

	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (less(aux[i], aux[j])) {
				a[k] = aux[i++];
			} else {
				a[k] = aux[j++];
			}
		}
	}

}
