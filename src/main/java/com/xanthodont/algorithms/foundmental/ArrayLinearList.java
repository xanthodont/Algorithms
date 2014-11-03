package com.xanthodont.algorithms.foundmental;

import java.util.Iterator;

public class ArrayLinearList<Item> implements ILinearList<Item>{
	private static final int INIT_CAPACITY = 2;
	private Item[] items;
	private int n;
	
	public ArrayLinearList() {
		this(INIT_CAPACITY);
	}
	public ArrayLinearList(int capacity) {
		items = (Item[]) new Object[capacity];
		n = 0;
	}
	
	/**
	 * 重新设置线性表的容量
	 * @param capacity 容量大小
	 */
	private void resize(int capacity) {
		Item[] tmp = (Item[]) new Object[capacity];
		for (int k = 0; k < n; k++) {
			tmp[k] = items[k];
		}
		items = tmp;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return n == 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	public void insert(int i, Item item) {
		// TODO Auto-generated method stub
		if (i < 0 || i > n) 
			throw new IllegalArgumentException("参数i非法");
		if (n >= items.length) resize(items.length*2);
		for (int k = n-1; k > i; k--) {
			items[k+1] = items[k]; 
		}
		items[i] = item;
		n++;
	}

	public void append(Item item) {
		// TODO Auto-generated method stub
		insert(n, item);
	}

	public Item delete(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i >= n) 
			throw new IllegalArgumentException("参数i非法");
		Item item = items[i]; 
		for (int k = i; k < n; k++) {
			items[k] = items[k+1];
		}
		n--;
		if (n <= items.length/4) resize(items.length/2);
		return item;
	}

	public Item getValue(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i > n) 
			throw new IllegalArgumentException("参数i非法");
		return items[i];
	}

	public int getPosition(Item item) {
		// TODO Auto-generated method stub
		for (int k = 0; k < n; k++) {
			if (item.equals(items[k]))
				return k;
		}
		return -1;
	}

	public void setValue(int i, Item item) {
		// TODO Auto-generated method stub
		if (i < 0 || i > n) 
			throw new IllegalArgumentException("参数i非法");
		items[i] = item;
	}

	public void clear() {
		// TODO Auto-generated method stub
		items = (Item[]) new Object[INIT_CAPACITY];
		n = 0;
	}

	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator{
		private int i = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < n;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return items[i++];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
		
	}
}
