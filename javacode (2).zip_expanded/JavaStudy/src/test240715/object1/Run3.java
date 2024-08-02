package test240715.object1;

import java.util.Scanner;

public class Run3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		
		int[] num = new int[10];
		int[] count = new int[20];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			for(int j=0; j<count.length; j++) {
				if(num[i] == j+1) {
					count[j]++;
				}
			}
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}

}
