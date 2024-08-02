package test_240712;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];
		double sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ',') {
				for(int j=0; j<i; j++) {
					
					System.out.print(str.charAt(j));
				}System.out.println();
						
				
			}
		}

	}

}
