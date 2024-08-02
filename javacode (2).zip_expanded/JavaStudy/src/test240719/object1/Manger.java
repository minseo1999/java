package test240719.object1;

public class Manger {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Cat();
		aArr[1] = new Dog();
		aArr[2] = new Cat();
		aArr[3] = new Dog();
		aArr[4] = new Cat();
		
		for(int i=0; i<aArr.length; i++) {
			aArr[i].speak();
		}
		
	}

}
