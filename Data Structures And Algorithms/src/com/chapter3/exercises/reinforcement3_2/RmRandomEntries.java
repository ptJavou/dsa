package com.chapter3.exercises.reinforcement3_2;

import java.util.Random;

/**
 * Write a Java method that repeatedly selects and removes a random entry from an
	array until the array holds no more entries.
 * @author ramon
 *
 * @param <E> 
 */
public class RmRandomEntries<E> {

	public void rmArrayEntries(E[] arr) {
		Random rand = new Random();
		
		for(int i = arr.length ; i > 0 ; i--) {
			int randPos = rand.nextInt(i);
			System.out.println(arr[randPos]);
			arr[randPos] = null;
			arr = generateNewArrayWithoutNullRef(arr);
		}
	}
	
	private E[] generateNewArrayWithoutNullRef(E[] arr) {
		int newArrSize = arr.length - 1;
		E[] newestArr = (E[]) new Object[newArrSize];
		
		int j = 0;
		for(E e : arr) {
			if(e != null)
				newestArr[j++] = e;
		}
		
		return newestArr;
	}

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,7};
		new RmRandomEntries<Integer>().rmArrayEntries(arr);
	}
}
