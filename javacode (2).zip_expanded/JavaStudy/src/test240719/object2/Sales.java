package test240719.object2;

public class Sales extends Employee implements Bonus{

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public Sales() {
		super();
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary(getSalary() + (int)(pay*1.2));
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return super.getSalary()*0.13;
	}
	

}
