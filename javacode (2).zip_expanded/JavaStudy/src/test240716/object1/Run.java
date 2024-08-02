package test240716.object1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 클래스 참조변수 = new 클래스 생성자;
		 * (부모클래스)   /    (자식클래스)
		 * 실제로 접근 가능여부 / 실제로 어떤 형태의 메모리가 생성이 되는가
		 * 자식이 부모보다 가진게 많아서 반대는 불가능
		 * 
		 * 
		 */
		
		Cake c1 = new CheeseCake();
		//Cake 까지 접근 가능하며 실제 메모리공간은 CheeseCake이다
		c1.sweet();
		c1.yummy();
		
		//CheeseCake c2 = new Cake();
		//실제 공간이 Cake 이므로 CheeseCake으로 만들수 없다

	}

}
