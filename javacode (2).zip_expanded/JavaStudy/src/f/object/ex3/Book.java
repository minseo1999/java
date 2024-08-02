package f.object.ex3;

public class Book {
	//필드
	/*
	 * 접근 제한자 : 해당 구조에 접근할 수 있는 범위를 제한한다.
	 * 
	 * public > protected > default > private
	 * 
	 * 클래스에 사용 가능 -> default, public
	 * 
	 * 필드와 메서드에 사용할 수 있는 접근제한자
	 * public : 어디서든 (같은 패키지, 다른 패키지 모두) 접근가능
	 * protected : 같은 패키지, 다른 패키지일 경우 상속관계에서만 접근 가능
	 * default : 같은 패키지일떄만 접근 가능
	 * private : 오직 해당 클래스만 접근 가능
	 */
	String title, genre, author;
	int maxPage;
	
//	//생성자
//		//객체를 생성할 때 초기화 해주는 작업이 필수
//		//초기화를 위해 메소드를 만들어준다 -> 생성자라는 규칙이 생김
		public void Book(String title, String genre, String author, int maxPage) {
			this.title = title; //내가 가진 (this) title 에 넘겨받은 title 을 넣는다
			this.genre = genre;
			this.author = author;
			this.maxPage = maxPage;
		}
/*
 * 		생성자 
 * 		클래스의 이름과 동일한 메소드로 반환형이 없다.
 * 		필드 데이터의 초기화를 위한 특수목적의 메소드이다.
 * 		매개변수가 하나도 없는 생성자를 기본 생성자라고 한다.
 * 		
 * 		생성자를 개발자가 직접 만들지 않는다면 컴파일러는 기본 생성자를 만들어준다.
 * 		개발자가 직접 생산자를 작성하면 기본 생성자를 만들어주지 않는다.
 * 		메소드의 매개변수의 갯수 또는 타입에 따라서 메소드를 구분하는 메소드 오버로딩은 생성자에도 적용된다.
 * 		
 */
//		public Book(){
//			System.out.println("기본 생성자 호출");
//		}
	//메소드
	public String toString() {
		/*
		 * this -> 인스턴스 객체(메모리를 사용중인 객체) 자기 자신을 의미
		 * 1. 자기 자신의 메모리를 가르킨다.
		 * 2. 생성자에서 다른 생성자를 호출할 수 있다.
		 * 3. 자기 자신의 주소를 반환할 수 있다.
		 */
		return "제목 : " + this.title + "\n장르 : " + this.genre+ "\n저자 : " + this.author+ "\n페이지 : " 
		 + this.maxPage;
	}
	

}
