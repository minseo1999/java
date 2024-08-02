package test.t240709.object4;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author,int price,double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println("title : " + this.title);
		System.out.println("publisher : " + this.publisher);
		System.out.println("author : " + this.author);
		System.out.println("price : " + this.price);
		System.out.println("discountRate : " + this.discountRate);
	}

}
