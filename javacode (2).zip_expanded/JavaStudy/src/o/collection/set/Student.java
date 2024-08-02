package o.collection.set;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public Student() {
		super();
	}

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public int hashCode() {//모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환
		// TODO Auto-generated method stub
//		return Objects.hash(name,age,score); //방법 1. Objects 이용
		return ("" + name + age + score).hashCode(); //방법 2. String 의 hashCode를 이용
	}
	
	//Students.equals (Student 객체)
	@Override
	public boolean equals(Object obj) { //현재 객체와 전달받은 객체의 필드값이 모두 일치하면 true/ 하나라도 다르면 false
		// TODO Auto-generated method stub
		//this(현재객체) <=> obj(전달받은 객체)
		
		
		
		return super.equals(obj);
	}
	

}
