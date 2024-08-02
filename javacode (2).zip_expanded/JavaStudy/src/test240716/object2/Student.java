package test240716.object2;

public class Student extends Human{
	
	private String number;
	private String major;
	
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + number + " " + major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	

}
