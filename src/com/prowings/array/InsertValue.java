package com.prowings.array;

import java.util.Arrays;

public class InsertValue {

	public static void main(String[] args) {
		insert();
		}

	private static void insert() {
		int num[] = { 5, 10, 20, 40 };
		int add[] = new int[num.length + 1];
		int index = 2;
		int value = 60;

		for (int i = 0; i < add.length - 1; i++) {
			add[i] = num[i];
		}
	
		for (int i = add.length - 1; i>index; i--) {
			add[i] = add[i - 1];
		}
		add[index] = value;
		System.out.println(Arrays.toString(add));
	}
	}