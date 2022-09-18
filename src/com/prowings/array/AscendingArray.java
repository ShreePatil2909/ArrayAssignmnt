package com.prowings.array;

import java.util.Arrays;
public class AscendingArray {

	public static void main(String[] args) {

		Ascending();
	}

	private static void Ascending() {
		int a[] = { 30, 50, 20, 60, 40, 10 };
		int str;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {  
					str = a[i];
					a[i] = a[j];
					a[j] = str;
				}
			}
		}
		System.out.println("Ascending Order is :"+Arrays.toString(a));
	}
}
