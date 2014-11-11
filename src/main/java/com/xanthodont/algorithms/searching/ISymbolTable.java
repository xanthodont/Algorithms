package com.xanthodont.algorithms.searching;

public interface ISymbolTable<Key, Value> {
	/**
	 * 插入键-值对
	 * @param key 键
	 * @param value 值
	 */
	void put(Key key, Value value);
	/**
	 * 获取key对应的值
	 * 注：键值是唯一的
	 * @param key
	 * @return 如果没有则返回空
	 */
	Value get(Key key);
	/**
	 * 从表中删除key的值
	 * @param key
	 */
	void delete(Key key);
	/**
	 * 判断是否包含键key
	 * @param key
	 * @return
	 */
	boolean contains(Key key);
	/**
	 * 是否为空
	 * @return
	 */
	boolean isEmpty();
	/**
	 * 字符表大小
	 * @return
	 */
	int size();
	/**
	 * 字符表的所有键集合
	 * @return
	 */
	Iterable<Key> keys();
}
