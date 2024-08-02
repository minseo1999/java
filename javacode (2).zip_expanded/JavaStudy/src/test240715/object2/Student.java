package test240715.object2;

public class Student {
	
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
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

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	public String toString() {
		String res = classRoom+"반 "+name+"학생 "+javaScore+"점 "+sqlScore+"점 "+practiceScore+"점";
		return res;
	}
	
	public boolean itPassd() {
		double avg = (this.javaScore+this.sqlScore+this.practiceScore)/3;
		if((avg >= 60)&&(this.javaScore>=50)&&(this.sqlScore>=50)&&(this.practiceScore>=50)) {
			return true;
		}
		return false;
	}
	
	public void reTest() {
		this.javaScore = (int)(Math.random()*100)+1;
		this.sqlScore = (int)(Math.random()*100)+1;
		this.practiceScore = (int)(Math.random()*100)+1;
	}
	

}
