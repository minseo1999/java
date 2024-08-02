package f.object.ex3;

import java.awt.Checkbox;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 만드는 방법
		//클래스명 참조변수명 = new 생성자();
		Book b1 = new Book();
//		b1.title = "불안을 이기는 심리학";
//		b1.genre = "자기계발";
//		b1.author = "황양밍";
//		b1.maxPage = 120;
		//b1.init("불안을 이기는 심리학", "자기계발", "황양밍", 120);
		System.out.println(b1.toString());
		
		Book b2 = new Book();
		b2.title = "자바란 무엇일까";
		b2.genre = "전공서적";
		b2.author = "최지원";
		b2.maxPage = 320;
		
		Book b3 = new Book();
		b3.title = "당신 어쩌고 차단";
		b3.genre = "자기계발";
		b3.author = "푸수";
		b3.maxPage = 130;
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		

	}

}
