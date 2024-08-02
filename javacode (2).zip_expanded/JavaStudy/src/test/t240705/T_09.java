package test.t240705;

import java.util.Scanner;

public class T_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		if(n>0) {
			for(int i=0; i<n; i++) {
				if(i%2 == 0) {
					System.out.print("박");
				}else {
					System.out.print("수");
				}
				
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}

}
