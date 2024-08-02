package test.t240711.object2;

public class TV {
	
	private String brand;
	private int year;
	private int in;
	private int price;
	
	public TV(String name, int year, int in, int price) {
		super();
		this.brand = name;
		this.year = year;
		this.in = in;
		this.price = price;
	}
	
	public void show() {
		String res = this.brand+"에서 만든 "+this.year+"년형 TV 가격 : "+this.price;
		System.out.println(res);
	}

	public TV() {
		super();
	}



	public String getName() {
		return brand;
	}

	public void setName(String name) {
		this.brand = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
