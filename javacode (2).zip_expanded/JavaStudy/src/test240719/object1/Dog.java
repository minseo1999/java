package test240719.object1;

public class Dog extends Animal{
	
	private int weight;
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + "몸무게는 " + this.weight + "KG 입니다.");
		
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public Dog() {
		super();
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
