package com.xanthodont.algorithms.foundmental;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayLinearListTest {
	private ILinearList<Integer> integerList;
	private ILinearList<String> stringList;
	
	@Before
	public void init() {
		integerList = new ArrayLinearList<Integer>();
		stringList = new ArrayLinearList<String>();
	}
	
	/**
	 * 初始化时测试初始状态
	 * 初始时线性表大小为0，isEmpty()返回true
	 */
	@Test
	public void initTest() {
		Assert.assertEquals(0, integerList.size());
		Assert.assertEquals(0, stringList.size());
		Assert.assertEquals(true, integerList.isEmpty());
		Assert.assertEquals(true, stringList.isEmpty());
	}
	
	/**
	 * 线性表插入数据测试
	 * insert(int i, Item item)在指定的位置插入元素item 
	 */
	@Test
	public void insertTest() {
		/** 正常参数测试 */
		integerList.insert(0, 0);
		Assert.assertEquals(1, integerList.size());
		Assert.assertEquals(false, integerList.isEmpty());
		Assert.assertEquals(0, integerList.getValue(0).intValue());
		
		stringList.append("s");
		Assert.assertEquals(1, stringList.size());
		Assert.assertEquals(false, stringList.isEmpty());
		Assert.assertEquals("s", stringList.getValue(0));
		
		/** 边界参数测试 */
		integerList.insert(1, 1);
		integerList.insert(2, 2);
		Assert.assertEquals(3, integerList.size());
		Assert.assertEquals(1, integerList.getValue(1).intValue());
		
		/** 非法参数测试 */
		try {
			integerList.insert(4, 4);
		} catch (Exception e) {
			Assert.assertEquals(IllegalArgumentException.class, e.getClass());
		}
		Assert.assertEquals(3, integerList.size());
	}
	
	/**
	 * append方法测试
	 */
	@Test
	public void appendTest() {
		integerList.append(0);
		integerList.append(1);
		integerList.append(2);
		integerList.append(3);
		integerList.append(4);
		Assert.assertEquals(5, integerList.size());
		Assert.assertEquals(2, integerList.getValue(2).intValue());
	}
	
	/**
	 * delete方法测试
	 * delete(int i) 删除位置i的元素，并返回该元素
	 */
	@Test
	public void deleteTest() {
		integerList.append(0);
		integerList.append(1);
		integerList.append(2);
		integerList.append(3);
		integerList.append(4);
		Assert.assertEquals(5, integerList.size());
		/** 正常参数测试 */
		int item1 = integerList.delete(2);
		Assert.assertEquals(2, item1);
		Assert.assertEquals(4, integerList.size());
		Assert.assertEquals(3, integerList.getValue(2).intValue());
		/** 边界参数测试 */
		int item2 = integerList.delete(0);
		Assert.assertEquals(0, item2);
		int item3 = integerList.delete(2);
		Assert.assertEquals(4, item3);
		Assert.assertEquals(2, integerList.size());
		/** 非法参数测试 */
		try {
			integerList.delete(2);
		} catch (Exception e) {
			// TODO: handle exception
			Assert.assertEquals(IllegalArgumentException.class, e.getClass());
		}
		Assert.assertEquals(2, integerList.size());
	}
	
	/**
	 * 获取元素位置测试
	 */
	@Test
	public void getPositionTest() {
		stringList.append("a");
		stringList.append("b");
		stringList.append("c");
		stringList.append("d");
		
		Assert.assertEquals(0, stringList.getPosition("a"));
		Assert.assertEquals(1, stringList.getPosition("b"));
		Assert.assertEquals(2, stringList.getPosition("c"));
		Assert.assertEquals(3, stringList.getPosition("d"));
		Assert.assertEquals(-1, stringList.getPosition("e"));
	}
	
	/**
	 * setValue测试
	 */
	@Test
	public void setValueTest() {
		stringList.append("a");
		stringList.append("b");
		stringList.append("c");
		stringList.append("d");
		
		stringList.setValue(0, "aa");
		Assert.assertEquals("aa", stringList.getValue(0));
	}
	
	@Test 
	public void clearTest() {
		stringList.append("a");
		stringList.append("b");
		stringList.append("c");
		stringList.append("d");
		Assert.assertEquals(4, stringList.size());
		
		stringList.clear();
		Assert.assertEquals(0, stringList.size());
		Assert.assertEquals(true, stringList.isEmpty());
	}
	
	@Test
	public void iteratorTest() {
		integerList.append(0);
		integerList.append(1);
		integerList.append(2);
		integerList.append(3);
		Iterator<Integer> it = integerList.iterator();
		int i = 0;
		while (it.hasNext()) {
			int v = it.next();
			Assert.assertEquals(i, v);
			i++;
		}
	}
	
	@Test
	public void resizeTest() {
		integerList.append(0);
		integerList.append(1);
		int i = integerList.delete(1);
		Assert.assertEquals(1, i);
	}
}
