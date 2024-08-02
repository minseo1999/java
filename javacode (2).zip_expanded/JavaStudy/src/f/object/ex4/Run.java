package f.object.ex4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//choi 최지원 70 80 60
		//kim 김도한 18 50 70 95
		Student choi = new Student("최지원", 15, 70, 80, 60);
		Student kim = new Student("김도한", 18, 50, 70, 95);
		
		System.out.println(choi.getName());
		System.out.println(choi.getAge());
		System.out.println(choi.getMa());
		System.out.println(choi.getKo());
		System.out.println(choi.getEn());
		System.out.println(choi.getEvg());
		
		choi.getEvg("최지원", 15, 70, 100, 85);
		
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("국어 점수 : ");
		int kos = sc.nextInt();
		System.out.println("수학 점수 : ");
		int mas = sc.nextInt();
		System.out.println("영어 점수 : ");
		int ens = sc.nextInt();
		
		Student s1 = new Student();
	}

}
