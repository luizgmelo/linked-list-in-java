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
	
	
}
