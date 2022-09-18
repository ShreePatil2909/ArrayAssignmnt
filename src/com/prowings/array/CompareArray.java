package com.prowings.array;

import java.util.Arrays;
public class CompareArray {

	public static void main(String[] args) {
		boolean res = compare();
		System.out.println(res);
	}
	public static boolean compare() {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };
		if (a.length != b.length)
			return false;
		if (a == null || b == null)
			return false;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("both array exact match :\n" + Arrays.toString(a) + "\n" + Arrays.toString(b));
			return true;
		} else {
			System.out.println("both array not exact match :\n" + Arrays.toString(a) + "\n" + Arrays.toString(b));
			return false;
		}
	}
}