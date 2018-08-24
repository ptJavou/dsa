package com.chapter3.arrays.sort.insertion;

public class InsertionSort {

	public static void insertionSort(char[] data) {
		int n = data.length;
		for(int k = 1 ; k < n ; k++) {
			char current = data[k];
			
			int j = k;
			while(j > 0 && data[j-1] > current) {
				data[j] = data[j - 1];
				j--;
			}
			
			data[j] = current;
		}
		
		
	}
	
	public static void main(String[] args) {
		char[] c = {'a', 's', 'r', 'c', 'v', 'b', 'n', 'm'};
		insertionSort(c);
		for(char s : c) {
			System.out.println(s);
		}
	}
}
