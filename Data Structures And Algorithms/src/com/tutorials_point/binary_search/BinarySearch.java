package com.tutorials_point.binary_search;

import com.tutorials_point.quick_sort.QuickSort;

public class BinarySearch {

	
	public int search(int arr[], int num) {
		
		int inicio = 0;
		int fim = arr.length - 1;
		while(inicio <= fim) {
			
			int meio = (inicio + fim) / 2;
			if(num < arr[meio]) {
				fim = meio - 1;
			
			}else if(num > arr[meio]) {
				inicio = meio + 1;
			
			}else {
				return meio;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,8,4,15,25,9,18,27,1,44,12,4,33,1111};
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length - 1);
		
		BinarySearch bs = new BinarySearch();
		int index = bs.search(arr, 27);
		if(index != -1)
			System.out.println("index: " + index + " valor: " + arr[index]);
	}
}
