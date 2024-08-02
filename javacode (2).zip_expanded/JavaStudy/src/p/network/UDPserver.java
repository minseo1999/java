package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 4000;
		
		try {
			//서버가 4000포트를 결합하여 요청을 받을 준비를 한다.
			DatagramSocket doc = new DatagramSocket(port);
			
			//전송받은 데이터를 저장할 바이트 배열
			byte[] data = new byte[60000];
			
			//클라이언트로부터 받을 peacket 객체 생성
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("데이터 받을 준비 완료");
			
			while(true) {
				
				doc.receive(dp);
			
				System.out.println("클라이언트 ip : " + dp.getAddress());
				String message = new String(dp.getData(), "UTF-8");
				System.out.println("클라이언트 내용 : " + message);
				
			}
		
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
