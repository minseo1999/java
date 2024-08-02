package q.thread.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSend extends Thread{
	private Socket socket;
	
	public ClientSend(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try(PrintWriter pw = new PrintWriter(socket.getOutputStream());) {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("보내는 메세지 : ");
				String SendMsg = sc.nextLine();
				
				pw.println(SendMsg);
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
