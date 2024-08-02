package test.t240704;

import java.util.Scanner;

public class T_05 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] iarr = new int[10];
		
		for(int i=0; i<iarr.length; i++) {
			iarr[i] = 10 - i;
			System.out.print(iarr[i] + " ");
		}
//		for(int i=iarr.length-1; i >= 0; i--) {
//			System.out.print(iarr[i] + " ");
//		}
		
		
	}
}
