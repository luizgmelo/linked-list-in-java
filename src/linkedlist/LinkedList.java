package linkedlist;

public class LinkedList {
	private Node head;
	
	public LinkedList() {	
		this.head = null;
	}
	
	public Node getHead() {
		return this.head;
	}
	
	
	public void insert(int position, int data) {
		Node node = new Node(data);
		
		if (this.head == null) {
			this.head = node;
			return;
		}
		
		Node current = this.head;
		int i = 0;
		while (current.getNext() != null && i < position - 1)  {
			current = current.getNext();	
			i++;
		}
		
		// case node in position exist new node next get the current next node.
		if (current.getNext() != null) {
			Node currentNext = current.getNext();
			node.setNext(currentNext);
		}
		
		current.setNext(node);
	}
	
	public void remove(int position) {
		if (this.head == null || position < 0) {
			return;
		}
		
		// remove beginning
		if (position == 0) {
			this.head = this.head.getNext();
			return;
		}
		
		// if position is larger than linkedList remove last
		
		Node current = this.head;
		int i = 0;
		while(current.getNext().getNext() != null && i < position - 1) {
			current = current.getNext();
			i++;
		}
		
		// remove from middle
		if (current.getNext().getNext() != null) {
			current.setNext(current.getNext().getNext());
			return;
		}
		
		// remove from end
		current.setNext(null);
		
		
	}
	
	
}
