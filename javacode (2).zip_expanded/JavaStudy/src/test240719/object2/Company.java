package test240719.object2;

public class Company {
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.println("name   department   salary ");
		System.out.println("------------------------------------");
		for(int i=0; i<employees.length; i++) {
			System.out.println(employees[i].toString());
		}
		
		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);
		System.out.println("인센티브 100 지급");
		System.out.println("name   department   salary   tax");
		System.out.println("------------------------------------");
		for(int i=0; i<employees.length; i++) {
			System.out.println(employees[i].toString());
		}
		
		
	}

}
