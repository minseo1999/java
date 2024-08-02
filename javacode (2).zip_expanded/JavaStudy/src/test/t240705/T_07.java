package test.t240705;

import java.util.Scanner;

public class T_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int n2 = sc.nextInt();
		
		int max,min;
		
		max = (n1 > n2) ? n1 : n2;
		min = (n1 < n2) ? n1 : n2;
		if(min >= 1) {
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

}
