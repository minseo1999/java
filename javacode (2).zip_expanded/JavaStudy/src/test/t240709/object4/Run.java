package test.t240709.object4;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("불안 어쩌고","교보문고","무슨밍");
		Book b2 = new Book("자기개발","나도 모름","진짜 모름",25000,30.0);
//		Book b3 = new Book(null, null, null, 0, 0);
		
		b1.inform();
		b2.inform();
//		b3.inform();

	}

}
