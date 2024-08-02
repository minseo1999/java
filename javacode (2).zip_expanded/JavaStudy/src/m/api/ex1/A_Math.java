package m.api.ex1;
import java.lang.*; //내가 직접 import 하지 않아도 무조건 import 된다

public class A_Math {
	//java.iang.Maht
	//모든 필드는 상수필드, 모든 메소드 static 메소드 

	public void method01() {
		//상수필드
		System.out.println("파이 : " + Math.PI);
		
		//랜덤수
		System.out.println("랜덤 : " + Math.random());
		
		//절대값
		int num = -10;
		System.out.println("절대값 : " + Math.abs(num));
		
		//올림
		double num2 = 4.49;
		System.out.println("올림 : " + Math.ceil(num2));
		
		//반올림
		double num3 = 4.49;
		System.out.println("올림 : " + Math.round(num2));
		
		//내림
		double num4 = 4.49;
		System.out.println("올림 : " + Math.floor(num2));
		
		//제곱
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
	}
	

}
