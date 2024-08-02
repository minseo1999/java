package e.array;

public class A_Array2 {
	/*
	 * 
	 */
	public static void main(String[] args) {
//		int i = 10;
//		int[] iArr = new int[5];
//		System.out.println(iArr.hashCode());
//		
//		double[] dArr = new double[3];
//		System.out.println(dArr.hashCode());
		
		/*
		 * 실제 리터럴값을 곧바로 담을 수 있는 변수를 일반변수라고 한다.
		 * 주소값을 담고있는 변수는 참조변수(레퍼런스 변수)라고 한다.
		 * 
		 * 기본자료형(원시타입) : boolean, int, char, byte, long, double등등으로 선언된 변수
		 * -> 실제 리터럴값을 바로 담을 수 있다.
		 * 
		 * 그 외 자료형 (String, Scanner, int[], double[], char[] ...) -> 참조변수
		 */
		
		int[] iArr = new int[10]; //0~9번 인덱스 사용가능, 0으로 초기화 되어있음
		System.out.println(iArr[3]);
		
		double[] dArr = new double[4]; //0~3번 인덱스 사용가능, 0으로 초기화 되어있음
		System.out.println(dArr[1]);
		
		//내가 각 인덱스를 초기화 하지 않아도 값들이 담겨있다.
		// Heap 이라는 메모리 공간은 절대 빈공간을 허용하지 않는다.
		//-> 공간이 만들어질 때 JVM이 기본적으로라도 초기화를 진행한다.
		
		System.out.println(iArr); //배열의 자료형 + @ + 주소값의 16진수 형태
		System.out.println(iArr.hashCode()); //주소값의 10진수 형태 
		
		int[] arr = null; // 아무것도 참조하고 있지 않음
		System.out.println(arr);
		
		/*
		 *  null을 가지고 있는 참조변수에 접근하여 다른 정보를 구하고자 하면 어떻게 될까?
		 *  항상 오류가 발생한다.
		 *  
		 *  System.out.println(arr.hashCode());
		 *  
		 */
		
		arr = new int[5];
		/*
		 * ArrayIndexOutOfBoundsException
		 * : 배열에 부적절한 인덱스 제시하면 발생하는 에러
		 * System.out.println(arr[6]);	
		 */
		
		//배열의 가장 큰 단점
		//- 한번 지정한 배열의 크기는 변경이 불가능하다.
		//->배열의 크기를 변경하고자 한다면 다시 만들어야한다.
		
		System.out.println(arr.hashCode());
		arr = new int[7];
		System.out.println(arr.hashCode());
		//주소값이 변경되었다. -> 새로운 곳을 참조하고 있다.
			
		/*
		 * 연결이 끊어진 기존 배열은 Heap 영역에 떠다닌다(어떤 변수에도 참조되지 않는 상태)
		 * -> 일정 시간이 지나면 "가비지 컬렉터(GC)" 가 알아서 지워줌
		 * -> 자바에서의 "자동메모리관리" 특징 -> 개발자가 코드에만 집중할 수 있다.
		 */
		
		arr = null;
		
		//배열을 강제로 삭제시키고자 한다면 -> 연결고리를 끊어주면 된다.(null대입)
		
		int[] arr2 = {1,1,1,1};
		int[] arr3 = {1,1,1,1};
			
		System.out.println(arr2 == arr3);	
			
		arr3 = arr2;
		
		System.out.println(arr2 == arr3);
			
		arr3[0] = 100;
		
		System.out.println(arr2[0]);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
