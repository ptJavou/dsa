package com.chapter6.array_queue;

public class ArrayQueue<E> {

	private E[] data;
	private int primeiroElementoIndex;
	private int size;
	
	public ArrayQueue(int capacidade) {
		data = (E[]) new Object[capacidade];
	}
	
	public boolean vazia() {
		return (size == 0);
	}
	
	public int getSize() {
		return size;
	}
	
	public void enqueue(E e) throws IllegalStateException {
		if(getSize() == data.length) throw new IllegalStateException("A fila está cheia");
		
		int index = (primeiroElementoIndex + size) % data.length;
		data[index] = e;
		size++;
		
	}
	
	public E dequeue() {
		if(vazia()) return null;
		E elemento = data[primeiroElementoIndex];
		data[primeiroElementoIndex] = null;
		primeiroElementoIndex = (primeiroElementoIndex + 1) % data.length;
		size--;
		return elemento;
	}
	
	public E first() {
		if(vazia()) return null;
		return data[primeiroElementoIndex];
	}
	
	public static void main(String[] args) {
		int arr[] = util.Util.arr;
		ArrayQueue<Integer> queue = new ArrayQueue<>(10);
		queue.enqueue(arr[0]);
		queue.enqueue(arr[3]);
		queue.enqueue(arr[5]);
		queue.enqueue(arr[2]);
		queue.enqueue(arr[4]);
		queue.enqueue(arr[8]);
		
		while(!queue.vazia()) {
			System.out.println(queue.dequeue());
		}
		
	}
}
