package com.chapter3.list.circular_list;

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
	
	public void addHead(E element) {
		Node<E> newest = new Node<>(element, null);
		if(isEmpty()) {
			tail = newest;
			tail.setNext(tail);
		}	
		else {
			newest.setNext(tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	public void addTail(E element) {
		addHead(element);
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



