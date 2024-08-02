package test.t240705;

import java.util.Scanner;

public class T_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 : ");
			String str = sc.next();
			sc.nextLine();
			System.out.println("문자 : ");
			char ch = sc.next().charAt(0);
			int c = 0;
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == ch) {
					c++;
				}
			}
			System.out.println("포함된 갯수 : " + c);
			int i = 0;
			while(i == 0) {
				System.out.println("더 하시겠습니까? (y/n)");
				char ans = sc.next().charAt(0);
				
				switch (ans) {
				case 'y':
				case 'Y':
					i = 1;
					break;
				case 'n':
				case 'N':
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					break;
				
				}
			}
		}
	}

}
