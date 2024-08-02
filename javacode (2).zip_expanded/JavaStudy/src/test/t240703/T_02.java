package test.t240703;

import java.util.Scanner;

public class T_02 {
	/*
	 * 키보드로 정수를 입력받아 정수가 양수일때 짝수, 홀수 출력
	 * 양수가 아니면 양수만 입력하세요 출력
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요: ");
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("양수만 입력하세요.");
		}else {
			if(n%2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}
		
	}

}
