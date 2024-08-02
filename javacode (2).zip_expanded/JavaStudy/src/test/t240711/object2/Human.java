package test.t240711.object2;

public class Human {
	private String name;
	private int money;
	
	TV myTV = new TV();
	
	public Human(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public Human() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buy(TV myTV) {
//		String brand = myTV.getName();
//		int year = myTV.getYear();
//		int in = myTV.getIn();
//		int price = myTV.getPrice();
		
		if(this.money>=myTV.getPrice()) {
			System.out.println(this.name + "님의 구매내역");
//			System.out.println(brand+"에서 만든 "+year+"년형 TV 가격 : "+price + "(잔액 : " + (money-price) +")");
			myTV.show();
			System.out.println("잔액 : " + (this.money-=myTV.getPrice()));
		}else {
			System.out.println(name + "님 잔액이 부족해서 구매하실 수 없습니다.");
		}
	}

}
