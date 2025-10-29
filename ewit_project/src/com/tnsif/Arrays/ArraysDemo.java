package com.tnsif.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String days[]=new String[7];
		/* 
		 * OR
		 * String days[];
		 * days=new String[7];
		 */
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<days.length; i++) {
			System.out.println("Please Enter the "+i+"th day of the week");
			days[i]=sc.nextLine();
		}
		
		System.out.println("Days in the week");
		for(int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		sc.close();
		
		//Arrays Sorting
		int arr1[]= {100,20,300,40,50};
		Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);	
		}
		
	}
}