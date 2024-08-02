package o.collection.map;

public class Snack {
	private String flavor;
	private int calroy;
	
	
	public Snack(String flavor, int calroy) {
		super();
		this.flavor = flavor;
		this.calroy = calroy;
	}


	public Snack() {
		super();
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	public int getCalroy() {
		return calroy;
	}


	public void setCalroy(int calroy) {
		this.calroy = calroy;
	}


	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calroy=" + calroy + "]";
	}
	
	

}
