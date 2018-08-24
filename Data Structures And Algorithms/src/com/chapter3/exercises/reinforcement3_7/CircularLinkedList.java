package com.chapter3.exercises.reinforcement3_7;

/**
 * Consider the implementation of CircularlyLinkedList.addFirst, in Code Frag-
ment 3.16. The else body at lines 39 and 40 of that method relies on a locally
declared variable, newest. Redesign that clause to avoid use of any local vari-
able.
 * @author ramon
 *
 * @param <E>
 */

public class CircularLinkedList<E> {

	private Node<E> tail = null;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if(isEmpty())
			return null;
		return tail.getNext().getElement();
	}
	
	public E last() {
		if(isEmpty())
			return null;
		return tail.getElement();
	}
	
	public void rotate() {
		if(tail != null)
			tail = tail.getNext();
	}
	
	public void addFirst(E element) {
		if(isEmpty()) {
			tail = new Node<>(element, null);
			tail.setNext(tail);
		}	
		else {
			tail.setNext(new Node<>(element, null).setNext(tail.getNext()));
		}
		size++;
	}
	
	public void addTail(E element) {
		addFirst(element);
		tail = tail.getNext();
		size++;
	}
	
	public E removeFirst() {
		if(isEmpty())
			return null;
		Node<E> head = tail.getNext();
		
		if(head == tail)
			tail = null;
		else
			tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
}



