package test.t240711.object1;

import java.util.Scanner;

public class T_02 {
	
	public static void  main(String[] args) {
		
		//정수 n을 입력받아 크기가 n인 정수형 배열을 만들고 1~100 사이의 랜덤값을 모든 배열의 인덱스에 대입
		// 이후 모든 배열의 값을 출력하고 홀수 인덱스 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n? : ");
		int n = sc.nextInt();
		
		int[] narr = new int[n];
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			narr[i] = (int)(Math.random() * 100) +1;
			System.out.print(narr[i] + " ");
			if(i%2==1) {
				sum+=narr[i];
			}
		}
		System.out.println();
		System.out.println("sum : " + sum);
 		
	}

}
