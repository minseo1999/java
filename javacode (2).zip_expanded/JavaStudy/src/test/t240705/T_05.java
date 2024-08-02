package test.t240705;

import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double m,k,b;
		
		System.out.print("키 (m) 를 입력해주세요: ");
		m = sc.nextDouble();
		System.out.print("몸무게 (kg) 를 입력해주세요: ");
		k = sc.nextDouble();
		b = k/(m*m);
		System.out.println("BMI 지수: " + b);
		
		if(b < 18.5) {
			System.out.println("저체중");
		}else if(b < 23) {
			System.out.println("정상체중");
		}else if(b <25) {
			System.out.println("과체중");
		}else if(b <30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
		
	}

}
