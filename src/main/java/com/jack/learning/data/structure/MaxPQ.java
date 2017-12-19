package com.jack.learning.data.structure;

public class MaxPQ<Key extends Comparable<Key>> extends PriorityQueue<Key> {

	public MaxPQ(int maxN) {
		pq = (Key[]) new Comparable[maxN + 1];
	}

	protected boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}

	protected void swim(int k) {
		while (k > 1 && less(k / 2, k)) {
			exch(k / 2, k);
			k = k / 2;
		}
	}

	protected void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;

			if (j < N && less(j, j + 1)) {
				j++;
			}

			if (!less(k, j))
				break;

			exch(k, j);
			k = j;
		}
	}

	public void insert(Key v) {
		N++;
		pq[N] = v;
		swim(N);
	}

	public Key delMax() {
		Key max = pq[1];
		exch(1, N);
		pq[N] = null;
		N--;
		sink(1);

		return max;
	}

}
