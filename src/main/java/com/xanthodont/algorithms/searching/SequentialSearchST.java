package com.xanthodont.algorithms.searching;

public class SequentialSearchST<Key, Value> implements ISymbolTable<Key, Value>{
	private class Node {
		Key key;
		Value value;
		
		Node next;
		public Node() {}
		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	private Node head = null;
	private int n = 0;
	
	public SequentialSearchST() {
		this.head = new Node();
	}
	

	public void put(Key key, Value value) {
		// TODO Auto-generated method stub
		Node t = head;
		while (t.next != null) {
			if (t.key.equals(key)) {
				t.value = value;
				return;
			}
			t = t.next;
		}
		Node x = new Node(key, value);
		t.next = x;
		n++;
	}

	public Value get(Key key) {
		// TODO Auto-generated method stub
		Node t = head;
		while (t.next != null) {
			if (t.key.equals(key)) {
				return t.value;
			}
			t = t.next;
		}
		return null;
	}

	public void delete(Key key) {
		// TODO Auto-generated method stub
		Node t = head;
		while (t.next != null) {
			if (t.key.equals(key)) {
				
				n--;
			}
			t = t.next;
		}
	}

	public boolean contains(Key key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size() == 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	public Iterable<Key> keys() {
		// TODO Auto-generated method stub
		return null;
	}

}
