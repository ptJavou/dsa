package com.chapter3.list.linked_list.single;
/**
 * Single Linked List
 * @author root
 *
 * @param <E>
 */
public class SinglyLinkedList<E> implements Cloneable{
	
	private Node<E> head;
	private Node<E> tail;
	private int size = -1;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	//access methods
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == -1;
	}
	
	public E first() {
		if(isEmpty()) {return null;}
		return head.getElement();
	}
	
	public E last() {
		if(isEmpty()) {return null;}
		return tail.getElement();
	}
	
	
	//update methods
	public void addHead(E e) {
		head = new Node<E>(e, head);
	
		if(isEmpty())
		tail = head;
		
		size++;
	}
	
	public void addTail(E e) {
		Node<E> newest = new Node<>(e, null);
		
		if(head == null)
			head = newest;
		else
			tail.setNext(newest);
			
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if(isEmpty()) {return null;}
		E element = head.getElement();
		head = head.getNext();
		
		size--;
		
		if(isEmpty())
			tail = null;
		
		return element;
	}

	private static class Node<E>{
		
		private E element;
		private Node<E> next;
		
		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext(){
			return next;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList<String> sll = new SinglyLinkedList<>();
		sll.addHead("element 1");
		sll.addHead("element 2");
		sll.addHead("element 3");
		sll.addHead("element 4");
		
		System.out.println(sll.size);
		while(sll.size >= 0) {
			System.out.println(sll.removeFirst());
		}
			
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(!getClass().equals(obj.getClass()))return false;
		SinglyLinkedList other = (SinglyLinkedList) obj;
		Node walkA = head;
		Node walkB = other.head;
		if(size!=other.size)return false;
		
		while(walkA != null) {
			if(!(walkA.getElement()).equals(walkB.getElement())) return false;
			walkA = walkA.getNext();
			walkB = walkB.getNext();
		}
		return true;
	}
	
	@Override
	protected SinglyLinkedList<E> clone() throws CloneNotSupportedException {
		SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone();
		if(size > 0) {
			other.head = new Node<E>(head.getElement(), null);
			Node<E> walk = head.getNext();
			Node<E> otherTail = other.head;
			while(walk != null) {
				Node<E> newest = new Node<E>(walk.getElement(), null);
				otherTail.setNext(newest);
				otherTail = newest;
				walk = walk.next;
			}
			
		}
		return other;
	}
}





