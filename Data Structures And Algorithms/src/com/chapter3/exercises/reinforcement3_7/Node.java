package com.chapter3.exercises.reinforcement3_7;

public class Node<E> {

	private E element;
	private Node<E> next;
	
	public Node(E element, Node<E> next){
		this.element = element;
		this.next = next;
	}
	
	public E getElement() {
		return element;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public Node<E> setNext(Node<E> node) {
		next = node;
		return this;
	}
	
}
