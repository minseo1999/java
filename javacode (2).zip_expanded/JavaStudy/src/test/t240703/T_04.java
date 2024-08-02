package test.t240703;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int n = sc.nextInt();
			if(n >= 1) {
				for(int i =1; i<=n; i++) {
					System.out.print(i + " ");	
				}
				break;
			}else {
				continue;
			}
		}
		
		
	}

}
