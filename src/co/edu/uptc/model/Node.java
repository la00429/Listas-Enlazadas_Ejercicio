package co.edu.uptc.model;

public class Node<E> {
	private E data;
	private Node next;

	public Node(E data) {
		this.data = data;
	}

	public E getValue() {
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
