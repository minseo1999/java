package test.t240704;

import java.util.Scanner;

public class T_03 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n1?");
		int n1 = sc.nextInt();

		System.out.println("n2?");
		int n2 = sc.nextInt();
		
//		if((n1 >= 1)&&(n2 >= 1)) {
//			for(int i=n1; i<=n2; i++) {
//				System.out.print(i + " ");
//			}
//		}else {
//			System.out.println("1 이상의 숫자를 입력하세요.");
//		}
		
		if((n1 >= 1)&&(n1 < n2)) {
			for(int i=n1; i<=n2; i++) {
				System.out.print(i + " ");
			}
		}else if((n2 >= 1)&&(n2 < n1)) {
			for(int i=n2; i<=n1; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		
		//max = (n1 > n2) ? n1 : n2
		//min = (n1 < n2) ? n1 : n2
	}
}
