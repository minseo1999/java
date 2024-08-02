package test240715.object2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] std = new Student[10];
		
//		std[0] = new Student();
//		std[0].setName("std1");
		
		for(int i=0; i<std.length; i++) {
			std[i] = new Student();
			std[i].setName("std"+(i+1));
			std[i].setClassRoom(i+1);
			std[i].reTest();
			System.out.println(std[i].toString());
		}
		
		
		
			}

}
