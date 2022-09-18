package com.prowings.array;

import java.util.Arrays;
public class ConcatTwoArray {

	public static void main(String[] args) {

		concat();
	}
	private static void concat() {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 60, 70, 80, 90, 100 };
		int c[] = new int[a.length + b.length];
		int j = 0;

		for (int i = 0; i < a.length; i++) {
			c[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {
			c[j] = b[i];
			j++;
		}
		for (int z : c) {
			System.out.println(z);
		}
	}
}