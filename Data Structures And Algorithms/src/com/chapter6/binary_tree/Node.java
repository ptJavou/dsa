package com.chapter6.binary_tree;


public class Node<E> {
	
	private E element;
	private Node<E> left;
	private Node<E> right;
	
	public Node(E e, Node<E> leftChild, Node<E> rightChild ) {
		element = e;
		left = leftChild;
		right = rightChild;
	}
	
	public E getElement() {
		return element;
	}
	public Node<E> getLeft() {
		return left;
	}
	public Node<E> getRight() {
		return right;
	}
	
	
	public void setElement(E element) {
		this.element = element;
	}
	public void setLeft(Node<E> left) {
		this.left = left;
	}
	public void setRight(Node<E> right) {
		this.right = right;
	}
}
