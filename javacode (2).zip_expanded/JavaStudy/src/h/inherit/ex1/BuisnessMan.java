package h.inherit.ex1;

public class BuisnessMan extends Man{
	private String company;
	private String position;
	
	public BuisnessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public BuisnessMan() {
		super();
		System.out.println("기본 생성자");
	}

	public BuisnessMan( String company, String position) {
		super();
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + this.company);
		System.out.println("My position is " + this.position);
	}

}
