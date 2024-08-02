/**
 * 
 */
package h.inherit.ex2;

/**
 * 
 */
public class Desktop extends Product{
	
	private boolean allinOne;

	public Desktop(String brand, String pCode, String name, int price, boolean allinOne) {
		super(brand, pCode, name, price);
		this.allinOne = allinOne;
	}
	


	public boolean isAllinOne() {
		return allinOne;
	}



	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}



	public Desktop() {
		super();
	}
	//오버라이딩
	//부모 클래스에 있는 메소드를 자식 클래스에서 내용만 재정립하는것
	@Override
	public String information() {
		return super.information() + " 올인원 : " + this.allinOne;
		
	}

	
}
