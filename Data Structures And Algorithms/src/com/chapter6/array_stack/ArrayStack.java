package com.chapter6.array_stack;

public class ArrayStack<E> {

	private static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1;
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public void push(E e) throws IllegalStateException{
		if(size() == data.length)
			throw new IllegalStateException();
		data[++t] = e;
	}
	
	public E pop() {
		if(isEmpty()) return null;
		E element = data[t];
		data[t] = null;
		t--;
		return element;
	}
	
	public E top() {
		if(isEmpty()) return null;
		return data[t];
	}
	
	public int size() {
		return t + 1;
	}
	
	public boolean isEmpty() {
		return (t == -1);
	}
	
	public static void main(String[] args) {
		ArrayStack<String> stack = new ArrayStack<>(10);
		stack.push("batata");
		stack.push("banana");
		stack.push("melão");
		stack.push("arroz");
		stack.push("carne");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
