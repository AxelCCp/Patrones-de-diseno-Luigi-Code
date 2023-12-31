package B5_Iterator_v2;

public class Node<T> {

	public Node(T value) {
		this.value = value;
	}
	
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}



	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}



	private T value;
	private Node <T> next;
}
