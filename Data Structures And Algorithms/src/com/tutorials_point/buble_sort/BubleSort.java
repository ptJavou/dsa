package com.tutorials_point.buble_sort;

public class BubleSort {
	
	private int comparisons = 0;
	private int swaps = 0;

	public void sort(int arr[]) {
		
		boolean swapped = false;
		for (int i = 1; i < arr.length; i++) {
			swapped = false;
			
			for(int j = arr.length - 1 ; j >= i ; j--) {
				comparisons++;
				if(arr[j - 1] > arr[j]) {
					swaps++;
					swapped = true;
					increaseSwap(arr, j);
				}	
			}
			
			if(!swapped)
				break;
		}
			
		printArr(arr);
	}
	
	public int getComparisons() {
		return comparisons;
	}
	
	public int getSwaps() {
		return swaps;
	}
	
	private void increaseSwap(int arrt[], int i) {
		int temp = arrt[i];
		arrt[i] = arrt[i - 1];
		arrt[i - 1] = temp;
	}
	
	public void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,8,4,15,25,9,18,27,1};
		BubleSort bs = new BubleSort();
		bs.sort(arr);
		System.out.println("Comparações: " + bs.getComparisons() + " Swaps: " + bs.getSwaps());
	}
}
