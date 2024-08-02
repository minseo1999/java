package test.t240705;

import java.util.Scanner;

public class T_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("입력1:");
		n1 = sc.nextInt();
		System.out.print("입력2:");
		n2 = sc.nextInt();
		System.out.print("입력3:");
		n3 = sc.nextInt();
		
		if((n1 == n2)&&(n2 == n3)&&(n1 == n3)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}
}
