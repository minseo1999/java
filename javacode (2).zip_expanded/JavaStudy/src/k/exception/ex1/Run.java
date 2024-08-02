package k.exception.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
	/*
	 * 에러 종류
	 * - 시스템 에러 : 커뮤터의 오작동으로 발생 -> 소스코드로 해결 불가 -> 심각
	 * - 컴파일 에러 : 소스코드 문법상의 오류 -> 빨간줄로 애초에 오류를 알려준다. (개발자의 실수) -> 발견과 해결이 쉬움
	 * - 런타임 에러 : 코드상으로 문제가 없지만 프로그램 실행도중 발생하는 에러 (사용자의 실수 또는 개발자가 미처 처리하지 않은 에러)
	 * - 논리 에러 : 문법적으로도 문제없고 실행했을때도 문제는 없지만 프로그램의 의도와 맞지않는 동작이나 결과가 나타나는 에러
	 * 
	 * 컴파일, 런타임, 논리에러 같은 개발자가 예측 가능하며 수정할 수 있는 에러들을 가지고 작업
	 * -> 예외라고 한다. (Exception)
	 * 
	 * 이런 "예외"가 발생했을 때를 "처리"하는 방법을 "예외처리"라고 한다.
	 * 
	 * 예외처리의 목적
	 * - 예외처리를 하지 않고 그대로 예외가 발생하면 프로그램이 비정상적으로 종료될 수 있다.
	 * 
	 * 예외처리 방법
	 * 1. try~catch 문을 이용하는 방법
	 * 2. throws 이용 (떠넘기기)
	 * 
	 * 사용한 리소스 반납 방법
	 * 
	 * 1. finally 에서 반납 : 예외가 발생하건 안하건 try-catch 종료후 마지막에 실행되는 코드
	 * 2. try-with-resource
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Runexception r1 = new Runexception();
		
		r1.method2();
	}
}
