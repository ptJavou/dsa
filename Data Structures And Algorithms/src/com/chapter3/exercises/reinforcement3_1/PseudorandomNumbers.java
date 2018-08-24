package com.chapter3.exercises.reinforcement3_1;

public class PseudorandomNumbers {

	private static final int a = 12;
	private static final int b = 5;
	private static final int n = 100;
	
	
	
	public static int getPseudoRandomNumber(int cur) {
		return (a * cur + b) % n;
	}
	
	public static void main(String[] args) {
		int i = 0;
		int cur = 93;
		do {
			cur = PseudorandomNumbers.getPseudoRandomNumber(cur);
			System.out.println(cur);
			i++;
		}while(i < 10);
	}
}
