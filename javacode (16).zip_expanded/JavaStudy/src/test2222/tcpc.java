package test2222;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class tcpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 3000;
		
		String si;
		
		try {
			si = InetAddress.getLocalHost().getHostAddress();
//			try {
//				Socket sc = new Socket(si,port);
//				System.out.println("연결");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Socket sc = new Socket(si,port);
			System.out.println("werewrwer");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
