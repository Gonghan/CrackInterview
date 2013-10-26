package chapter2;

public class Node {
	public int value;
	public Node next;

	public Node(Integer value) {
		this.value = value;
		this.next = null;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public int getValue() {
		return value;
	}

}
