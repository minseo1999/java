package test240719.object3;

public class Cargoplane extends Plane{

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		// TODO Auto-generated method stub
		super.setFuelSize(super.getFuelSize() - 50 * (distance/10));

		
	}
	
	

}
