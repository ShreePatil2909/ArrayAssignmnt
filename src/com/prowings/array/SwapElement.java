package com.prowings.array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {

		swap();
	}
	public static void swap() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index for swapping");
		int num = sc.nextInt();
		int num1 = sc.nextInt();

		int a[] = { 10, 20, 30, 40 };

		a[num] = a[num] + a[num1];
		a[num1] = a[num] - a[num1];
		a[num] = a[num] - a[num1];
		System.out.println(Arrays.toString(a));

	}
}