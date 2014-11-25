package com.xanthodont.algorithms.foundmental;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BagTest {
	private Bag<String> bag;
	
	@Before
	public void init() {
		bag = new Bag<String>(10);
	}
	
	@Test
	public void initTest() {
		Assert.assertEquals(0, bag.size());
		Assert.assertEquals(true, bag.isEmpty());
	}
	
	@Test 
	public void addTest() {
		bag.add("a");
		Assert.assertEquals(1, bag.size());
		Assert.assertEquals(false, bag.isEmpty());
		bag.add("b");
		bag.add("c");
		Assert.assertEquals(3, bag.size());
	}
	
	@Test
	public void iteratorTest() {
		bag.add("1");
		bag.add("2");
		bag.add("3");
		bag.add("4");
		Assert.assertEquals(4, bag.size());
		int count = 1;
		for (String s : bag) {
			Assert.assertEquals(count++, Integer.parseInt(s));
		}
	}
}
