package e.array;

import java.util.Scanner;

public class C_Array_Two {
	/*
	 * 2차원 배열
	 * 자료형이 같은 1차원 배열의 묶음으로 배열안에 다른 배열이 존재한다.
	 * 2차원 배열은 할당된 공간마다 인덱스 번호를 두개 부여(앞 번호는 몇 번째 1차원 배열인지 (행), 뒷번호는 1차원 		배열의 몇번째 인덱스인지 (열))
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 2차원 배열 선언(1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만든다.
		 * 자료형[][] 배열명;
		 * int[][] arr;
		 */
		
		
		/*
		 * 2. 배열 할당(실제 m 크기의 1차원 배열 n 개를 만들어서 참조
		 * 배열명 = new 자료형[n][m]
		 * 
		 * 1차원 배열의 참조변수 묶음 먼저 생성할 수 있다.
		 * 
		 * 배열명 = new 자료형[n][];
		 * 배열명[0] = new 자료형[m];
		 * 배열명[1] = new 자료형[m];
		 * 배열명[n] = new 자료형[m];
		 
		arr = new int[3][4]; // 4개짜리 1차원 배열 3개 묶음 생성
		
		arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		arr[3] = new int[4];
		
		
		//배열 선언과 동시에 할당
		int[][] arr = new int[3][4];
		
		//3. 배열의 값 대입
		// 배열명[배열순번][인덱스] = 값;
		
		arr[0][0] = 1;
		arr[1][1] = 2;
		arr[2][2] = 3;
		*/
		
		//3행 3열짜리 문자열 배열을 선언하고 0행 0열부터 2행 2열까지 차례대로 접근하여 (행, 열) 값을 저장하기
		
		String[][] strarr = new String[3][3];
		
//		strarr[0][0] = ("0행0열");
//		strarr[0][1] = ("0행1열");
//		strarr[0][2] = ("0행2열");
//		
//		strarr[1][0] = ("1행0열");
//		strarr[1][1] = ("1행1열");
//		strarr[1][2] = ("1행2열");
//		
//		strarr[2][0] = ("2행0열");
//		strarr[2][1] = ("2행1열");
//		strarr[2][2] = ("2행2열");
//		
//		String str = null;
//		
//		for(int i=0; i<strarr.length; i++) {
//			for(int j=0; j<strarr[i].length; j++) {
//				strarr[i][j] = str;
//			}
//		}
//		
//		for(int i=0; i<strarr.length; i++) {
//			for(int j=0; j<strarr[i].length; j++) {
//				System.out.print(strarr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<strarr[0].length; i++) {
			strarr[0][i] = ("0행" + i + "열");
		}
		
		for(int i=0; i<strarr[1].length; i++) {
			strarr[1][i] = ("1행" + i + "열");
		}
		
		for(int i=0; i<strarr[2].length; i++) {
			strarr[2][i] = ("2행" + i + "열");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
