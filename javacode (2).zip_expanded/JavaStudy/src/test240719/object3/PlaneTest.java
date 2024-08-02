package test240719.object3;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airplane ap = new Airplane("L747",1000);
		Cargoplane cp = new Cargoplane("C40",1000);
		
		System.out.println(ap.toString());
		System.out.println(cp.toString());
		
		System.out.println("=====================distance:100===================");

		ap.flight(100);
		cp.flight(100);
		System.out.println(ap.toString());
		System.out.println(cp.toString());
		
		System.out.println("=======================refuel:200=====================");
		
		ap.refuel(200);
		cp.refuel(200);
		System.out.println(ap.toString());
		System.out.println(cp.toString());		
		
	}

}
