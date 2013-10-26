package chapter2;

import java.util.Collection;
import java.util.Iterator;

public class myLinkedList implements Collection<Integer> {
	private Node head;

	public myLinkedList(int value) {
		this.head = new Node(value);
	}

	public myLinkedList() {
		this.head = null;
	}

	@Override
	public boolean add(Integer e) {
		if (head == null){
			head=new Node(e);
			return true;
		}
		getLast().next = new Node(e);
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getLast() {
		if (head == null)
			return head;
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}

	public Node getfirst() {
		return head;
	}

}