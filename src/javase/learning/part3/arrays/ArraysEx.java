package javase.learning.part3.arrays;

import java.util.Scanner;

public class ArraysEx {
	public static void main(String[] args) {
		int arrOld[] = new int[5];
		int[] arr2 = new int[5];
		arr2[0] = 10;
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 10;
		}
		
		System.out.println("-----------------------");
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("enter num of rows");
		int ROWS = scr.nextInt();
		
		System.out.println("enter num of cols");
		int COLS = scr.nextInt();
		
		int[][] arr = new int[ROWS][COLS]; //2D array
		arr[1][0] = 10;
		
		int k = arr[1][0];
		System.out.println(k);
		
		
		//SETTING VALUES IN 2D ARRAY
		for (int i = 0; i < ROWS; i++) {
			
			for (int j = 0; j < COLS; j++) {
				System.out.println("enter digit for "+ i +" row & "+ j+" column");
				arr[i][j] = scr.nextInt();
			}
			
		}
		
		//READING VALUES IN 2D ARRAY
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				int p = arr[i][j];
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		int[][][] arr3 = new int[3][3][3];
		
	}
}
