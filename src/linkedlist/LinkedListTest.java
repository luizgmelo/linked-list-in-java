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
	
	@Test
	void testRemove() {
		LinkedList list = new LinkedList();
		list.insert(0, 23);
		
		// remove head no elements after
		list.remove(0);
		assertEquals(list.getHead(), null);
		
		// remove head with elements after
		list.insert(1, 49);
		list.insert(2, 13);
		list.remove(0);
		
		assertEquals(list.getHead().getData(), 13);
				
		// remove in the middle
		list.insert(3, 51);
		list.insert(4, 41);
		list.insert(5, 27);
		list.insert(6, 42);
		list.insert(7, 12);
		list.insert(8, 22);
		
		list.remove(3);
		assertEquals(list.getHead().getNext().getNext().getNext().getData(), 42);
		
		list.remove(3);
		assertEquals(list.getHead().getNext().getNext().getNext().getData(), 12);
		
		
		// remove in the end
		// actual list 13 -> 51 -> 41 -> 12 -> 22
		list.remove(999);
		assertEquals(list.getHead().getNext().getNext().getNext().getNext(), null);
		list.remove(3);
		assertEquals(list.getHead().getNext().getNext().getNext(), null);
	
		// remove one Node before end
		list.remove(1);
		assertEquals(list.getHead().getNext().getData(), 41);
		
		
		
		
		
	}
	
	@Test
	void testSearch() {
		LinkedList list = new LinkedList();
		// search in list empty should return false
		assertEquals(list.search(23), false);
		
		
		list.insert(0, 23);
		list.insert(1, 55);
		list.insert(2, 76);
		list.insert(3, 91);
		
		// correct values
		assertEquals(list.search(23), true);
		assertEquals(list.search(55), true);
		assertEquals(list.search(76), true);
		assertEquals(list.search(91), true);
		
		// bad values
		assertEquals(list.search(999), false);
		assertEquals(list.search(145), false);
		assertEquals(list.search(333), false);
		assertEquals(list.search(695), false);
		
		
	}
	
	@Test
	void testPrintLinkedList() {
		LinkedList list = new LinkedList();
		list.insert(0, 23);
		list.insert(1, 55);
		list.insert(2, 76);
		list.insert(3, 91);		
		
		list.printLinkedList();
	}

}
