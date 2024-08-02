package q.thread.ex1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task t1 = new Task();
		
		Runable task = new MyRunable();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
		
		

	}

}
