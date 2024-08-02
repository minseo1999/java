package h.inherit.ex2;

public class TV extends Product{
	private int inch;
	
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "TV [inch=" + inch + "]";
	}

	public TV() {
		super();
	}

	public TV(String brand, String pCode, String name, int price, int inch) {
		super(brand,pCode, name, price);
		this.inch = inch;
	}

	public String information() {
		return super.information() + " inch : " + this.inch;
	}

}
