package h.inherit.ex2;

public class Run {
	/*
	 * 상속이란
	 * 부모 클래스의 필드와 메섣드를 자식 클래스에서 그대로 이어받아 사용하는 것
	 * (실제로 상속된 클래스를 통해서 객체생성시 부모클래스의 객체도 생성이 된다.)
	 * 
	 * 상속의 장점
	 * 적은 양의 코드로 새로운 클래스를 정의하고 사용할 수 있다.(생산성이 좋은)
	 * 코드를 공통으로 관리하기 때문에 코드의 추가나 변경이 용이하다.(유지보수성이 좋음)
	 * 
	 * 상속의 특징
	 * 클래스간의 다중상속이 불가(부모는 하나다)
	 * 부모클래스에 정의되어 있는 protected 필드는 자식 클래스에서 직접 접근이 가능하다.(private 은 불가)
	 * 자식 객체는 부모 클래스에 있는 메소드를 자기거처럼 호출할 수 있다.
	 * 부모 클래스의 정의된 기능이 마음에 들지 않는다면 내 마음대로 수정할 수 있다.
	 * 명시되어 있지는 않지만 모든 클래스(자베에서 제공하는 클래스, 직접만든 클래스)는 object 클래스의 후손이다.
	 * -> Object 에 있는 메소드를 마음대로 호출해서 사용할 수 있다.
	 * -> 오버라이딩도 가능하다
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop d1 = new Desktop("LG","d-100","사무용pc",1000000, true);
		
		System.out.println(d1.information());
		
		TV t1 = new TV("samsung","t-100","LED TV",1000000,65);
		System.out.println(t1.information());
		
	}

}
