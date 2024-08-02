package test.t240710.object3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(10,"chlalstj");
		
		System.out.println(emp1.getEmpName() + emp1.getEmpNo());
		
		emp1.setEmpName("tlqkf");
		emp1.setEmpNo(25);
		emp1.setAddress("fsnfklsdnfks");
		
		System.out.println(emp1.getEmpName() + emp1.getEmpNo() + emp1.getAddress());
		

	}

}
