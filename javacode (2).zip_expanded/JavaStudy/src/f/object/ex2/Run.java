package f.object.ex2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		
		ref1.checkMyBalance();
		ref2.checkMyBalance();
		
	}

}
