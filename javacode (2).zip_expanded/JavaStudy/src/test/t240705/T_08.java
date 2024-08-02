package test.t240705;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String dus = sc.next();
			if(dus.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
			System.out.print("n1 : ");
			int n1 = sc.nextInt();
			System.out.print("n2 : ");
			int n2 = sc.nextInt();
			
			switch (dus) {
			case "+":
				System.out.println(n1 +" + " + n2 + " = " + (n1+n2));
				break;
			case "-":
				System.out.println(n1 +" - " + n2 + " = " + (n1-n2));
				break;
			case "*":
				System.out.println(n1 +" * " + n2 + " = " + (n1*n2));
				break;
			case "/":
				if(n2 != 0) {
					System.out.println(n1 +" / " + n2 + " = " + (n1/n2));
					break;
					}else {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						break;
					}
			case "%":
				if(n2 != 0) {
				System.out.println(n1 +" % " + n2 + " = " + (n1%n2));
				break;
				}else {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					break;
				}
			default:
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
				break;
			}
			}
		}
		
	}

}
