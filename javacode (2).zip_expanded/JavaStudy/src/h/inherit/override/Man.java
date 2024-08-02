package h.inherit.override;

public class Man {
	@Override
	public String toString() {
		return "Man [name=" + name + "]";
	}

	private String name;

	public Man(String name) {
		super();
		this.name = name;
	}

	public Man() {
		super();
	}
	
	public void tellYourName() {
		System.out.println("My name is " + this.name);
	}

}
