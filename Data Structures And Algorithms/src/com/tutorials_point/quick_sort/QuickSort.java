package com.tutorials_point.quick_sort;

public class QuickSort {

	public void sort(int[] arr, int left, int right) {
		int x, y, mid;
		x = left;
		y = right;
		mid = arr[(left + right) / 2];
		
		do {
			while(arr[x] < mid && x < right)
				x++;
			
			while(arr[y] > mid && y > left)
				y--;
			
			if(x <= y) {
				int temp = arr[y];
				arr[y] = arr[x];
				arr[x] = temp;
				
				x++;
				y--;
			}
		}while(x <= y);
		
		if(left < y)
		sort(arr, left, y);
		
		if(x < right)
		sort(arr, x, right);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,8,4,15,25,9,18,27,1};
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
