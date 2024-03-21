package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testInsert() {
		LinkedList list = new LinkedList();
		
		// insert root
		list.insert(0, 33);
		
		// insert when next is null
		list.insert(22, 42);
		
		// insert in a determinate position
		list.insert(1, 52);
		
		assertEquals(33, list.getHead().getData());
		assertEquals(52, list.getHead().getNext().getData());
		assertEquals(42, list.getHead().getNext().getNext().getData());
	}

}
