package com.prowings.array;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {

		int d[]={20,30,50,10,40};
		int swap;
		
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d.length;j++) {
				if(d[i]>d[j]) {
					swap=d[i];
					d[i]=d[j];
					d[j]=swap;
				}
			}
		} System.out.println("Descending Order is :"+Arrays.toString(d));
	}

}
