package com.xanthodont.algorithms.searching;

public interface IOrderedSymbolTable<Key extends Comparable<Key>, Value> extends ISymbolTable<Key, Value> {
	/**
	 * 最小键
	 * @return
	 */
	Key min();
	/**
	 * 最大键
	 * @return
	 */
	Key max();
	/**
	 * 小于等于参数key的最大键值
	 * @param key
	 * @return
	 */
	Key floor(Key key);
	/**
	 * 大于等于参数key的最下键值
	 * @param key
	 * @return
	 */
	Key ceiling(Key key);
	/**
	 * 小于key的键值数
	 * @param key
	 * @return
	 */
	int rank(Key key);
	/**
	 * 选择顺序为k的键值
	 * @param k
	 * @return
	 */
	Key select(int k);
	/**
	 * 删除最小键
	 */
	void deleteMin();
	/**
	 * 删除最大键
	 */
	void deleteMax();
	/**
	 * [lo, hi]区间键的数目
	 * @param lo
	 * @param hi
	 * @return
	 */
	int size(Key lo, Key hi);
	/**
	 * [lo, hi]区间的键集合
	 * @param lo
	 * @param hi
	 * @return
	 */
	Iterable<Key> keys(Key lo, Key hi);
}
