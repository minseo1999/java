package test.t240704;

import java.util.Scanner;

public class T_07 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.nextLine();
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);
		
		int c=0;
		System.out.print(str + "에 " + ch + " 가 존재하는 위치(인덱스) : ");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				System.out.print(i + " ");
				c++;
			}
		}
		System.out.println("");
		System.out.println(ch + " 개수 : " + c);
		
	}

}
