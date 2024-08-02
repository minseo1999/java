package test.t240705;

import java.util.Scanner;

public class T_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//0 가위
		//1 바위
		//2 보
		
		String name,user;
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("당신의 이름을 입력해주세요 : ");
		name = sc.next();
		
		String[] garr = {"가위", "바위", "보"};
		int w=0,d=0,l=0;
		
		System.out.println("가위바위보 : ");
		user = sc.next();
		
		if(user.equals(garr[0]) || user.equals(garr[1]) || user.equals(garr[1])) {
			System.out.println("비겼습니다.");
			d++;
		}else {
			
		}
		
	}

}
