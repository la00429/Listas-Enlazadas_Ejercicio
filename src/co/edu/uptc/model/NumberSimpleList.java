package co.edu.uptc.model;

public class NumberSimpleList {
	private Node head;

	public NumberSimpleList() {
		this.head = null;
	}

	public void insert(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			head = node;
		} else {
			Node nodeAux = head;
			while (nodeAux.getNext() != null) {
				nodeAux = nodeAux.getNext();
			}
			nodeAux.setNext(node);
		}
	}

	public boolean exist(int data) {
		boolean nodeExist = false;
		Node nodeAux = head;
		while (nodeAux != null && nodeExist == false) {
			if (nodeAux.getValue() == data) {
				nodeExist = true;
			}
			nodeAux = nodeAux.getNext();
		}
		return nodeExist;

	}

	public void remove(int data) {
		Node nodeAux = head;
		Node previus = head;
		while (nodeAux != null) {
			if (nodeAux.getValue() == data) {
				removeNodeFound(nodeAux, previus);
			}
			nodeAux = nodeAux.getNext();
		}
	}

	private void removeNodeFound(Node nodeAux, Node previus) {
		Node nodeToRemove = nodeAux;
		if (nodeToRemove == head) {
			head = nodeToRemove.getNext();
		} else {
			previusReference(previus, nodeToRemove);
		}
	}

	private void previusReference(Node previus, Node nodeToRemove) {
		while (previus.getNext() != nodeToRemove) {
			previus = previus.getNext();
		}
		previus.setNext(nodeToRemove.getNext());
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public String show() {
		return this.head.toString();

	}
}
