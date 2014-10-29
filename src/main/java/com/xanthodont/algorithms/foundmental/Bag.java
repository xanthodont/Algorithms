package com.xanthodont.algorithms.foundmental;

import java.util.Iterator;

/**
 * 说明：Bag类是一个不支持删除元素的集合类，它提供给用户收集元素项，然后可以迭代访问每一项元素。
 * @author xanthodont
 *
 */
public class Bag<Item> implements Iterable<Item>{
	/** 默认初始数组大小 */
	private static final int INIT_CAPACITY = 2;
	/** 存储的元素数组 */
	private Item[] items;
	/** 元素个数 */
	private int size;
	
	/**
	 * 构造器，使用默认大小初始化
	 */
	public Bag() {
		this(INIT_CAPACITY);
	}
	/**
	 * 构造器
	 * @param capacity 初始元素大小
	 */
	@SuppressWarnings("unchecked")
	public Bag(int capacity) {
		if (capacity < 1)
			throw new IllegalArgumentException("capacity参数不能小于1");
		items = (Item[]) new Object[capacity];
		size = 0;
	}
	
	private void resize(int capacity) {
		if (capacity < 1) 
			throw new IllegalArgumentException("capacity参数不能小于1");
		Item[] temp = (Item[]) new Object[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = items[i];
		}
		items = temp;
	}
	
	/**
	 * 添加元素
	 * @param item
	 */
	public void add(Item item) {
		if (size >= items.length) 
			resize(items.length * 2);
		items[size++] = item;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}

	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<Item>();
	}

	private class ListIterator<Item> implements Iterator<Item> {

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public Item next() {
			// TODO Auto-generated method stub
			return null;
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	} 
}
