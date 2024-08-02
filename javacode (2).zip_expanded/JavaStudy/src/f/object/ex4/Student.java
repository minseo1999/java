package f.object.ex4;

public class Student {
	//이름 나이 수학 영어 국어 데이터 객체
	// 데이터는 직접 접근ㄴ 간접적으로 set/get사용
	// 모든 데이터를 매개변수로 받아 초기화하며 객체를 생성할 수 있는 생성자 작성
	
	private String name;
	private int age;
	private int Ma;
	private int Ko;
	private int En;
	
	//매개변수 다 받는것도 그냥 만들기
	public Student(String name, int age, int Ma, int Ko, int En) {
		this.name = name;
		this.age = age;
		this.Ma = Ma;
		this.Ko = Ko;
		this.En = En;
	}
	
	// 기본 생성자 그냥 만들기
	public Student() {
		
	}
	
	//Alt + Shift + s -> generate getter/setter

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
		if(age<1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}

	public int getMa() {
		return Ma;
	}

	public void setMa(int ma) {
		if(Ma<0) {
			this.Ma = 0;
			return;
		}
		this.Ma = ma;
	}

	public int getKo() {
		return Ko;
	}

	public void setKo(int ko) {
		Ko = ko;
	}

	public int getEn() {
		return En;
	}

	public void setEn(int en) {
		En = en;
	}
	
	public double getEvg() {
		double evg = (this.En + this.Ko + this.Ma) / 3.0;
		return evg;
	}
	
	public void getEvg(String name, int age, int Ma, int Ko, int En ) {
		double evg = (this.En+this.Ko+this.Ma)/3.0;
		System.out.println( this.name + "님의 평균 : " +evg);
		
	}
	
	
}
