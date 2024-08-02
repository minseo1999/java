package test.t240711.object4;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	
	
	
	public void StudentMenu() {
		Student[] stArr = ssm.printStudent();
				
		System.out.println("========학생 정보 출력========");
		ssm.printStudent();
		
		System.out.println("========학생 성적 출력========");
		System.out.println("학생 점수 합계 : " + ssm.avgScore()[0]);
		System.out.println("학생 점수 평균 : " + ssm.avgScore()[1]);
		
		System.out.println("========성적 결과 출력========");
		for(int i=0; i<stArr.length; i++) {
			if(stArr[i].getScore() >= ssm.CUT_LINE) {
				System.out.println(stArr[i].getName() + "학생은 통과입니다.");
			}else {
				System.out.println(stArr[i].getName() + "학생은 재시험 대상자 입니다.");
			}
		}
		
		
	}

}
