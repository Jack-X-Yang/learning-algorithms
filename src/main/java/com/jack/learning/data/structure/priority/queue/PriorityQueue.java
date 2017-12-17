package com.jack.learning.data.structure.priority.queue;

public abstract class PriorityQueue<Key> {
	Key[] pq = null;
	int N = 0;

	abstract public void insert(Key v);

	abstract protected void swim(int k);

	abstract protected void sink(int k);

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	protected void exch(int i, int j) {
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}
}
