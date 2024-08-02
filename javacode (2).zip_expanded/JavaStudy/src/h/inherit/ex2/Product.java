package h.inherit.ex2;

public class Product {
	
	private String brand;
	private String pCode;
	private String name;
	private int price;
	
	public Product() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(String brand, String pCode, String name, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}
	
	public String information() {
		return "브랜드 : " + this.brand + " 제품번호 : " + this.pCode + " 제품명 : "+this.name ;
	}

}
