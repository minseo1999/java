package test.t240704;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final String ID = "my";
		final String PWD = "myPassword12";
		
		System.out.print("아이디: ");
		String uid = sc.next();
		
		System.out.print("비밀번호: ");
		String upwd = sc.next();
	
		if((uid.equals(ID)) && (upwd.equals(PWD))) { // 문자열 비교할때는 .equals 사용해야함
			System.out.println("로그인 성공");
		}else if(upwd.equals(PWD)) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		if(ID.equals(uid)) {
			if(PWD.equals(upwd)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

}
