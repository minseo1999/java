package test.t240704;

import java.util.Scanner;

public class T_08 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"일","월","화","수","목","금","토"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int n = sc.nextInt();
		if((0<=n)&&(n<=day.length)) {
		System.out.println(day[n] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
}
