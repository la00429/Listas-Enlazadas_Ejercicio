

public class Node {

	private int data;
	private Node next;
	
	public Node(int data) {
		super();
		this.data = data;
	}

	public int getValue() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		
		return "data "+ data + " next " + next;
	}
	
	
}
