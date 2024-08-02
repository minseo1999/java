package test_240712_test5;

public class BookArrayTest {
	public static void main(String[] args) {
		
		Book bArr [] = new Book[3];
		
		bArr[0] = new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
		bArr[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		bArr[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		
		for(int i=0; i<bArr.length; i++) {
			System.out.println(bArr[i].getTitle() + ", " +bArr[i].getAuthor() + ", " + 
			bArr[i].getPublisher() + ", " + bArr[i].getPrice() + "원, " + 
			(int)(bArr[i].getDiscountRate()*100) + "% 할인");
		}
		
		
	}

}
