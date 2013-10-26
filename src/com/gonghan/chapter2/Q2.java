package chapter2;

public class Q2 {

	public void run(myLinkedList list) {
		Node head = list.getfirst();
		Node first = head;
		while (first != null) {
			Node second = first.next;
			while (second != null) {
				if (second.getValue() == first.getValue()) {
					first.next = second.next;
				}
				second = second.next;
			}
			first = first.next;
		}
	}

	public static void main(String args[]) {
		Q2 q2 = new Q2();
		myLinkedList list = new myLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		q2.run(list);
		Node head = list.getfirst();
		while (head != null) {
			System.out.println(head.getValue());
		}
	}
}


