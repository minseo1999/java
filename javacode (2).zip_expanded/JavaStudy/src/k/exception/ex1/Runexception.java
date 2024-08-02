package k.exception.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runexception {

	Scanner sc = new Scanner(System.in);
	
	
	public void method1() {
		try {
			System.out.println("a/b...a : ");
			int n1 = sc.nextInt();
			
			System.out.println("a/b...b : ");
			int n2 = sc.nextInt();
			
			System.out.printf("%d / %d = %d",n1,n2,n1/n2);
			System.out.println("good bye");			
		} catch(ArithmeticException e){
			System.out.println("수학적 오류");
		}catch(InputMismatchException e) {
			System.out.println("입력 오류");
		}catch (Exception e ) {
			e.printStackTrace();
		}
		
		System.out.println("gg");
		
	}
	
	public void method2() {
		/*
		 * CheckedException : 반드시 예외처리를 해야하는 예외들
		 * => 조건문을 미리 제시할 수 없음(예측이 불가능한 곳에서 문제가 발생하기 때문에 예외처리가 필수)
		 * => 외부 매개체와 입출력이 일어날 때 발생한다.
		 *  
		 */
		//Scanner 와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로 읽어들인다.)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		//1. try ~ catch
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. throws : 여기서 예외처리를 하지 않고 현제 이 메소드를 호출한 곳으로 예외처리를 넘긴다.
		System.out.println(str);
	
	}
	
	
}
