package test.t240703;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int rnr = sc.nextInt();
		System.out.print("수학점수: ");
		int tn = sc.nextInt();
		System.out.print("영어점수: ");
		int dud = sc.nextInt();
		
		
		double av = (rnr + tn + dud)/3.0;
		
		if(((rnr >= 40)&&(tn >= 40)&&(dud >= 40))&&(av >=60)) {
			System.out.println("국어: " + rnr);
			System.out.println("수학: " + tn);
			System.out.println("영어: " + dud);
			System.out.println("합계: " + av*3);
			System.out.println("평균: " + av);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}

}
