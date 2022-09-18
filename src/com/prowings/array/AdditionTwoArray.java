package com.prowings.array;

import java.util.Arrays;
public class AdditionTwoArray {

	public static void main(String[] args) {
		 addition();

	}

	private static void addition() {
		int a[]= {10,20,30,40,50};
		 int b[]= {10,20,30,40,50};
		 int c[]= new int[a.length];
		 int j=0;
		 for(int i=0;i<a.length;i++) {
			 
			 c[j]=a[i]+b[i];
			 j++;
			  
		 }System.out.println(Arrays.toString(c));
	}

}
