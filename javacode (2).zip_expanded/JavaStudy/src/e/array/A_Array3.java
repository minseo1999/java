package e.array;

import java.util.Scanner;

public class A_Array3 {
	
	public static void main(String[] args) {
		/*
		 * 1. 크기가 10인 정수형 배열 생성후
		 * 
		 * 2. 반복문을 통해서 0번 인덱스부터 마지막 인덱스까지 모든값을 1로 초기화
		 * 
		 * 3. 반복문을 통해서 0~마지막 인덱스까지 전부 출력
		 */
		
//		int[] arr = new int[10];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = 1;
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		//1. 사용자에게 배열의 길이를 입력받아 해당 크기의 문자열 배열을 생성해라
//		//길이 입력: //
//		
//		System.out.println("길이 입력:");
		Scanner sc = new Scanner(System.in);
//		int len = sc.nextInt();
//		String[] str = new String[len];
//		
//		//2. 반복문을 활용해 매번 사용자에게 과일명을 입력받아 그 값을 배열에 대입(0~마지막인덱스)
//		//좋아하는 과일을 입력: 바나나
//		
//		for(int i=0; i<str.length; i++) {
//			System.out.println("좋아하는 과일을 입력: ");
//			String gr = sc.next();
//			str[i] = gr;
//		}
//		//3. 반복문을 사용하여 배열의 모든 값을 출력하라
//		
//		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i]);
//					}
		
		//사용자에게 문자열 하나 입력 받은 후 
		//각각의 인덱스에 있는 문자들을 char 배열에 옮겨 담기
		//1. 사용자에게 문자열 하나 입력 받기
		//2. 문자열 담을 배열 만들기(길이 == 문자열 길이)
		//3. 반복문을 통해서 해당 문자열에서 각각 인덱스별 문자를 char배열에 대입
		//4. char 배열 모든 값을 전체 출력
//		System.out.println("문자열 입력: ");
//		String str = sc.nextLine();
//		
//		char[] ch = new char[str.length()];
//		
//		for(int i = 0; i<str.length(); i++) {
//			ch[i] = str.charAt(i);
//		}
//		
//		for(int i=0; i<str.length(); i++) {
//			System.out.println(ch[i]);
//					}
		
		//사용자에게 배열의 길이를 입력받아 해당 길이의 정수형 배열 arr을 생성한다.
		//arr의 모든 인덱스 값에 1~100 사이의 랜덤값을 할당하고
		//arr의 모든 값을 출력한 후
		// 이 중 짝수인 값의 총 합을 구해라
		
		System.out.println("정수 입력:");
		int len = sc.nextInt();
		int[] ran = new int[len];
		
//		for(int i=0; i<ran.length; i++) {
//			ran[i] = (int)(Math.random()*100)+1;
//					}
		int sum = 0;
		for(int i=0; i<ran.length; i++) {
			ran[i] = (int)(Math.random()*100)+1;
			System.out.println(ran[i]);
			if(ran[i]%2 == 0) {
				sum+=ran[i];
			}
					}
		System.out.println("짝수 합: " + sum);
		
		
		
	}

}
