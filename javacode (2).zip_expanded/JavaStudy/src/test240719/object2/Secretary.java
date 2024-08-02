package test240719.object2;

public class Secretary extends Employee implements Bonus{

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public Secretary() {
		super();
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary(getSalary() + (int)(pay*0.8));
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		
		return super.getSalary()*0.1;
	}
	
	

}
