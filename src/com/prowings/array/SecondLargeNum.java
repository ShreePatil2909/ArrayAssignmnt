package com.prowings.array;

import java.util.Arrays;

public class SecondLargeNum {

	public static void main(String[] args) {
		large();
	}
	public static void large() {
		int num[] = { 10, 15, 30, 55, 50, 60 };
		int sort;
		int largeNum;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) {
					sort = num[i];
					num[i] = num[j];
					num[j] = sort;
				}
			}
		}
		largeNum = num[num.length - 2];
		System.out.println("Second Highest Number is :" + largeNum);
	}
}