package test.t240704;

import java.util.Scanner;

public class T_04 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("숫자: ");
		n = sc.nextInt();
		if(n<=9) {
			for(int j=n; j<10; j++) {
				System.out.println("=====" + n + " 단 =====");
				for(int i=1; i<10; i++) {
					System.out.println(n + " * " + i + " = " +  i*n);
				}
				n++;
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
}
