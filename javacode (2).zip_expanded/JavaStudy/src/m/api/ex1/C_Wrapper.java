package m.api.ex1;

public class C_Wrapper {
	/*
	 * Wrapper 클래스
	 * -> 기본자료형을 객체로 포장해줄 수 있는 클래스이다.
	 * 
	 * 	boolean(Boolean)
	 * 	char(Character)
	 * 	byte(Byte)
	 *  int(Integer)
	 *  long(Long)
	 *  float(Float)
	 *  double(Double)
	 * 
	 * -> 기본자료형을 객체로 표현해야할 경우
	 * - 메소드 호출해야할 때
	 * -> 메소드의 매개변수가 기본자료형이 아닌 객체타입만 요구될 때
	 * - 다형성을 적용시키고 싶을 때
	 *  
	 * 
	 */
	
	public void method01() {
		// TODO Auto-generated method stub
		// Boxing : 기본자료형을 -> Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 20;
		
		//1. 객체생성구문을 통한 방법
		
		Integer i1 = new Integer(num1); // num1 => i1
		Integer i2 = new Integer(num2); // num1 => i2
		
		System.out.println(i1.toString());
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞이 크면 1, 뒤가 크면 -1, 같으면 0
	
		//2. 객체생성 하지 않고 바로 대입방법(AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3);
		
		// 객체생성을 통해서 반드시 반환해야 하는 경우 -> 문자열을 Intefer 타입으로 변환하고 싶을때
		Integer i4 = Integer.parseInt("123");
		Integer i5 = new Integer("123");
		
		//UnBoxing : Wrapper 클래스 자료형 -> 기본자료형
		
		//1. 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해서 가능
		int num3 = i3.intValue();
		int num4 = i4.intValue();
		
		//2. 메소드 사용하지 않고 바로 대입하는법
		int num5 = 15;
		
		// 기본자료형 <--> String
		String str1 = "10";
		String str2 = "15.5";
		
		System.out.println(str1 + str2); // 문자열로 합쳐져서 나옴
		
		// String -> 기본자료형
		// "10" -> 10
		// "15.5" -> 15.5
		// 해당 Wrapper클래스.parsexxx() 사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d); // 숫자로 바뀜
		
		
	
	}

}
