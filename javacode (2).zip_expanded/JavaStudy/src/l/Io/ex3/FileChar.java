package l.Io.ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileChar {
	/*
	 * "문자 기반 스트림" 을 활용하여 입출력
	 * 
	 * - 문자기반 스트림 : 데이터를 2바이트 단위로 전송하는 통로
	 * 
	 * xxxReader : 입력용 스트림
	 * xxxWriter : 출력용 스트림
	 * 
	 * 
	 */
	
	public void fileSave() {
		//1. 객체생성
		try (FileWriter fw = new FileWriter("char_test.txt")) {
			//2. write 메소드를 사용하여 데이터 입력
			fw.write("hello world");
			fw.write("\n");
			fw.write("wlqdp rkffo");
			
			char[] arr = {'\n','a','b','c','i','b','a','l'};
			fw.write(arr);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try (FileReader fr = new FileReader("char_test.txt");) {
			
			int val = 0;
			
			while((val = fr.read()) != -1) {
				System.out.print((char)val);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
