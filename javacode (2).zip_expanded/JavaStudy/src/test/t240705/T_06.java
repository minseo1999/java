package test.t240705;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t1,t2,h,g,t;
		
		System.out.print("중간 고사 점수 : ");
		t1 = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		t2 = sc.nextInt();
		System.out.print("과제 점수 : ");
		h = sc.nextInt();
		System.out.print("출석 횟수 : ");
		g = sc.nextInt();
		
		System.out.println("============ 결과 ============");
		System.out.println("중간 고사 점수 (20) : " + t1*0.2);
		System.out.println("기말 고사 점수 (30) : " + t2*0.3);
		System.out.println("과제 점수     (30) : " + h*0.3);
		System.out.println("출석 횟수     (20) : " + g);
		
		t =(int) ((t1*0.2)+(t2*0.3)+(h*0.3)+(g));
		System.out.println("총점 : " + t);
		
		if(g <= 20*0.3) {
			System.out.println("Fail [출석 미달]");
		}else if(t<70){
			System.out.println("Fail [점수 미달]");
		}else {
			System.out.println("Pass");
		}

	}

}
