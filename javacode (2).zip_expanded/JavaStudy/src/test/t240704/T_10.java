package test.t240704;

import java.util.Scanner;

public class T_10 {


public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		int n = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr[i].length-1; j>=0; j--) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println("");
		}
		
	}


}
