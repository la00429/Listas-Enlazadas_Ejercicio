package co.edu.uptc.model;

public class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
	}

	public int getValue() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data + "->" + next;
	}
}
