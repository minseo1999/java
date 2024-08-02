package test.t240710.object1;

public class Person {
	
	String name; //값이 없다면 "이름 없음"
	int age; // 값이 없다면 1
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		this("이름없음",1);
		System.out.println("기본 생성자");
	}
	
	//필드 모든 값을 전달받은대로 초기화 하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("name: %s age: %d",name,age);
	}
	
	//age 값만을 초기화하는 생성자
	public Person(int age) {
		this("이름 없음",age);
		System.out.printf("age: %d",age);
	}
	
	//name 값 만을 초기화 하는 생성자
	public Person(String name) {
		this(name, 1); //this() 는 자기자신 생성자, 맨 앞에만 올수 있음
		System.out.printf("name: %s ",name);
	}
	
	//값을 전달받지 않고 초기화 하는 생성자
	

}
