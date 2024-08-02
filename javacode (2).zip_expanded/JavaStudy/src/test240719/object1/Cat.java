package test240719.object1;

public class Cat extends Animal{
	private String location;
	private String color;
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + this.location + "에 서식하며, 색상은 " + this.color + "입니다.");
		
	}

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public Cat() {
		super();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}