package test.t240711.object3;

public class Book {

	private String title;
	private String genre;
	private String author;
	private int bookNo;

	public Book(String title, String genre, String author, int bookNo) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.bookNo = bookNo;
	}

	public Book() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String toString() {
//		System.out.println("title : " + this.title);
//		System.out.println("genre : " + this.genre);
//		System.out.println("author : " + this.author);
//		System.out.println("bookNo : " + this.bookNo);
		String res = "제목 : " + this.title + " | 장르 : " + this.genre + " | 작가 : " + this.author + " | 번호 : " + this.bookNo;
		return res;
		
	}

}
