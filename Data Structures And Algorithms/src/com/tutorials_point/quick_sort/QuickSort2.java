package com.tutorials_point.quick_sort;

public class QuickSort2 {

	public void sort(int arr[], int esquerda, int direita) {
		int x = esquerda;
		int y = direita;
		
		int valorMeio = arr[(x + y) / 2];
		
		do {
			while(arr[x] < valorMeio && x < direita)
				x++;
			
			while(arr[y] > valorMeio && y > esquerda)
				y--;
			
			if(x <= y) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
				
				x++;
				y--;
			}
		}while(x <= y);
		
		if(y > esquerda)
			sort(arr, esquerda, y);
		
		if(x < direita)
			sort(arr, x, direita);
		
	}
	
	public static void main(String[] args) {
		int arr[] = util.Util.arr;
		QuickSort2 qs2 = new QuickSort2();
		qs2.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
