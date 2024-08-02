package test240715.object4;

public class Circle extends Point{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public Circle(int x, int y, int radius) {
		super(x ,y);
		this.radius = radius;
	}

	public Circle() {
		super();
	}
	
	
	
	

}
