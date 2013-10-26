package com.gonghan.chapter2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2_test {

	@Test
	public void test() {
		Q2 q2=new Q2();
		myLinkedList list=new myLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		q2.run(list);
		Node head=list.getfirst();
		while(head!=null){
			System.out.println(head.getValue());
		}
	}

}
