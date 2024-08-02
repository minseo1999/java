package q.thread.chat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPclient {
	
	public static void main(String[] args) {
		int port = 3000;
		try {
			Socket socket = new Socket("localhost",port);
			
			System.out.println("연결");
			//서버로부터 메세지를 받는 쓰레드
			ClientReceive receive = new ClientReceive(socket);
			receive.start();
			
			//서버로부터 메세지를 보내는 쓰레드
			ClientSend send = new ClientSend(socket);
			send.start();
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
