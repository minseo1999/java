package test240715.object1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1, num2, num3 : ");
		
		int[] num = new int[3];
		
		
		for(int i=0; i<3; i++) {
			num[i] = sc.nextInt();
			if(num[i]%2==0) {
				System.out.print("짝 ");
			}else {
				System.out.println("홀 ");
			}
		}

	}

}
