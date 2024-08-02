package test.t240704;

import java.util.Scanner;

public class T_06 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수:");
		
		int n = sc.nextInt();
		
		int[] narr = new int[n];
		
		for(int i=0; i<narr.length; i++) {
			narr[i] = i+1;
			System.out.print(narr[i] + " ");
		}
	}
}
