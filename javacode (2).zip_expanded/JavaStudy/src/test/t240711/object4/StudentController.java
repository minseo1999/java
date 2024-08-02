package test.t240711.object4;

public class StudentController {
	
	final int CUT_LINE = 60;
	
	private Student[] sArr = new Student[5];

	public StudentController() {
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
	}
	
	public Student[] printStudent() {
		for(int i=0; i<sArr.length; i++) {
			System.out.print(sArr[i].inform());
			System.out.println();
		}
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum+=sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avg = new double[2];
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum+=sArr[i].getScore();
		}
		avg[0] = sum;
		avg[1] = sum/sArr.length;
		return avg;
	}
	
	

}
