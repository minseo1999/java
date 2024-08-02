package test.t240709.object2;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product(){}
	
	public void information() {
		System.out.println("pName : " + this.pName + "\nprice : " + this.price + "\nbrand : " + this.brand);
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
