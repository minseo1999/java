package test_240712_test4;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pr = new Product("갤럭시 s7",563500,3);
		
		System.out.println(pr.information());
		System.out.println("총 구매 가격 : " + (pr.getPrice()*pr.getQuantity()));
	}

}
