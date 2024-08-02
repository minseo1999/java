package test240723.object2;

import java.util.Scanner;

public class NumberMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수1 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + nc.checkDouble(num1, num2));
		} catch(NumRangeException e){
			System.out.println("1부터 100 사이의 값이 아닙니다!");
			e.printStackTrace();
			
		}
		
	}

}
