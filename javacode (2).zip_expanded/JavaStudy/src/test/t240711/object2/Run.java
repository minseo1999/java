package test.t240711.object2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tv mt = new TV("삼성", 2020, 65, 100000);
		 * mt.show();
		 * 
		 * Tv mt2 = new TV("삼성", 2020, 65, 100000);
		 * mt2.show();
		 * 
		 * res : 삼성에서 만든 2020년형 65인치 TV 가격 : 
		 * 
		 */
		
		TV myTV = new TV("삼성",2020,65,1000000);
		myTV.show();
		
		TV myTV2 = new TV("LG",2024,85,5000000);
		myTV2.show();
		
		/*
		 *  one 라는 Human 객체를 생성하고 해당 객체를 이용해서 myTV와 myTV2를 구매 가능한지 확인하는 코드 작성
		 *  
		 *  Human one = new Human("최지원" , 10000000);
		 *  one.buy(myTV);
		 *  최지원님 구매내역
		 *  삼성에서 만든 2020년형 65인치 TV 가격 : 1000000 -> 잔액 :
		 *  or
		 *  "최지원님 잔액이 부족하여 구매할 수 없습니다"
		 */
		
		Human one = new Human("최지원",4000000);
		
		one.buy(myTV);

	}

}
