package com.chapter3.double_linked_list;

public class DoubleLinkedList<E> {
	
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	public DoubleLinkedList(){
		header = new Node<E>(null, null, null);
		trailer = new Node<E>(null, header, null);
		header.setNext(trailer);
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if(isEmpty())
			return null;
		return header.getNext().getElement();
	}
	
	public E last() {
		if(isEmpty())
			return null;
		return trailer.getPrev().getElement();
	}
	
	public void addFirst(E element) {
		addBetween(element, header, header.getNext());
	}
	
	public void addLast(E element) {
		addBetween(element, trailer.getPrev(), trailer);
	}
	
	public E removeFirst() {
		if(isEmpty())
			return null;
		return remove(header.getNext());
	}
	
	public E removeLast() {
		if(isEmpty())
			return null;
		return remove(trailer.getPrev());
	}
	
	private void addBetween(E element, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<E>(element, predecessor, successor);
		successor.setPrev(newest);
		predecessor.setNext(newest);
		size++;
	}
	
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor= node.getNext();
		
		successor.setPrev(predecessor);
		predecessor.setNext(successor);
		size--;
		return node.getElement();
	}
	
	public static void main(String[] args) {
		DoubleLinkedList<String> dll = new DoubleLinkedList<>();
		dll.addFirst("teste 1");
		dll.addFirst("teste 2");
		dll.addFirst("teste 3");
		dll.addFirst("teste 4");
		dll.addFirst("teste 5");
		
		while(!dll.isEmpty()) {
			System.out.println(dll.removeLast());
		}
	}
}





