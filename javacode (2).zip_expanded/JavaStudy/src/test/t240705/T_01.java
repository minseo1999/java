package test.t240705;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float rnr,dud,tn;
		
		System.out.print("국어: ");
		rnr = sc.nextFloat();
		System.out.print("영어: ");
		dud = sc.nextFloat();
		System.out.print("수학: ");
		tn = sc.nextFloat();

		
		System.out.println("총점: " + (int)(rnr+dud+tn));
		System.out.println("평균: " + (int)(rnr+dud+tn)/3);

	}

}
