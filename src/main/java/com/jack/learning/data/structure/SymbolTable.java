package com.jack.learning.data.structure;

public abstract class SymbolTable<Key, Value> {

	abstract void put(Key key, Value val);

	abstract Value get(Key key);

	abstract void delete(Key key);

	abstract boolean contains(Key key);

	abstract boolean isEmpty();

	abstract int size();

	abstract Iterable<Key> keys();
}
