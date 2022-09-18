package com.prowings.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveValue {
	
	public static void main(String[] args) {
		delete();
	}
	public static void delete() {
		 int a[] = { 10, 20, 30, 40, 50};
		 int []b = new int[a.length-1];
		 int k = 0;
		 int count=0;
		
		System.out.println(Arrays.toString(a));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value from given array to remove");
		int num = sc.nextInt();
		for (int j = 0; j < a.length; j++) {
			if (num == a[j]) 
				count++;
			}
			if(count!=0) {
				for(int i=0; i<a.length;i++) {
					if(a[i] != num) {
					b[k]=a[i];
					k++;
				}
				}}else{
					System.out.println("Given element not present in Array "+num);
			}
			if(count != 0) {
		System.out.println(Arrays.toString(b));
	}

	}
}