package test.t240711.object1;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 n(2~9)를 입력받아 2부터 n까지 짝수의 구구단을 출력하는 코드 작성
		//만약 2~9 사이의 값이 아니면 다시 입력하세요를 반복한다
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("n? : ");
		int n = sc.nextInt();
		
		while(n<2||n>9) {
			System.out.println("다시 입력하세요");
			System.out.println("n? : ");
			n = sc.nextInt();
			continue;
		}
		for(int i=2; i<=n; i++) {
			for(int j=1; j<10; j++) {
				if((i*j)%2==0) {
					System.out.printf("%d * %d = %d",i,j,i*j);
					System.out.println();
				}
			}
		}
	

	}

}
