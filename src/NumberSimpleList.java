


public class NumberSimpleList {
	private Node head;
	
	public NumberSimpleList() {
//		solo inicializarla para que se cree la lista
		this.head = null;
	}
	public void insert(int data) {
		Node node = new Node(data);
		
		if (isEmpty()) {
			head = node;	
		}else {
			Node nodeAux = head;
			while (nodeAux.getNext()!=null) {
				nodeAux = nodeAux.getNext();
			}
			nodeAux.setNext(node);
		}
	}
	//tarea
	public boolean exist(int data) {
		boolean nodeExist = false;
		
		
		
		return nodeExist;
		

	}
	
	public void remove() {
		//dos auxiliares, aux-previus
		

	}
	
	public boolean isEmpty() {
//		boolean listEmpty = false;
//		if (head==null) {
//			listEmpty = true;
//		}else {
//			listEmpty=false;
//		}
//		return listEmpty;
		
		return head ==null;
		//head == null? true: false
	}
	
	public String show() {
		return head.toString();

	}
	

}
