package test.t240705;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함)");
		
		String wnals = sc.next();
		
		switch (wnals.charAt(7)) {
		case 1:
		case 3:
			System.out.println("남자");
			break;

		default:
			break;
		}

	}

}
