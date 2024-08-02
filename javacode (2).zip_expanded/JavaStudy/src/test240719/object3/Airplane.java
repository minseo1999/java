package test240719.object3;

public class Airplane extends Plane{

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public Airplane() {
		super();
	}

	@Override
	public void flight(int distance) {
		// TODO Auto-generated method stub
		super.setFuelSize(super.getFuelSize() - 30 * (distance/10));
		
	}
	
	
}
