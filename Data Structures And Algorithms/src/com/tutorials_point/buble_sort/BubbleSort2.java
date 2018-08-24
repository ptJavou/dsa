package com.tutorials_point.buble_sort;

public class BubbleSort2 {

	public void sort(int arr[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = arr.length - 1 ; j > i ; j--) {
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BubbleSort2 bs2 = new BubbleSort2();
		bs2.sort(util.Util.arr);
		for (int i = 0; i < util.Util.arr.length; i++) {
			System.out.println(util.Util.arr[i]);
		}
	}
}
