package com.xanthodont.algorithms.foundmental;

/**
 * 线性表接口
 * @author xanthodont
 *
 * @param <Item>
 */
public interface ILinearList<Item> extends Iterable<Item>{
	/**
	 * 判断线性表是否为空
	 * @return 空则返回true，否则返回false
	 */
	boolean isEmpty();
	/**
	 * 线性表元素个数
	 * @return
	 */
	int size();
	/**
	 * 在位置i插入元素item
	 * @param i
	 * @param item
	 */
	void insert(int i, Item item);
	/**
	 * 在线性表末尾追加元素item
	 * @param item
	 */
	void append(Item item);
	/**
	 * 删除位置为i的元素
	 * @param i
	 * @return
	 */
	Item delete(int i);
	/**
	 * 获取位置为i的元素
	 * @param i
	 * @return
	 */
	Item getValue(int i);
	/**
	 * 获取元素item在线性表中的位置，不存在时返回-1
	 * @param item
	 * @return
	 */
	int getPosition(Item item);
	/**
	 * 给位置为i的元素赋值item
	 * @param i
	 * @param item
	 */
	void setValue(int i, Item item);
	/**
	 * 清空线性表
	 */
	void clear();
}
