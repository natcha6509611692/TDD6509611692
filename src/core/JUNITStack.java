package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}
	
	public void testPushToTop() {
		Stack s1 = new Stack();
		assertEquals(false, s1.isFull());
		s1.push(1);
		assertEquals(1,s1.getTop());
	}
	
	public void testLastInFirstOut() {
		Stack s1 = new Stack();
		assertEquals(false, s1.isFull());
		s1.push(1);
		assertEquals(1,s1.getTop());
		assertEquals(1, s1.pop());
	}

}
