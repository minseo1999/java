package l.Io.ex1;

import java.io.File;
import java.io.IOException;

public class Run {
	/*
	 * 간단한 파일 만들기
	 * java.io.File 클래스 사용하기
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. 경로지정을 딱히 하지 않고 파일 생성하기
		File f1 = new File("test.txt"); // 파일 객체 만든 상태(실제파일 아님)
		// 2. 존재하는 경로에 파일 생성
		File f2 = new File("D:\\test2.txt");
		// 3. 존재하지 않는 경로에 파일 생성
		File f3 = new File("D:\\tmp\\test2.txt");
		//-> 경로가 없으면 예외 발생 IOException
		
		
		try {
			f1.createNewFile(); // createNewFile() 메소드가 실행될때 실제 파일이 만들어짐
			f2.createNewFile();
			//f3.createNewFile(); -> 에러발생
			
			// 3. 폴더 먼저 만들고 파일 생성법
			File tmpFolder = new File("D:\\tmp");
			tmpFolder.mkdir();
			
			File f4 = new File("ttt.txt");
			
			// 파일의 존재유무 확인하는법
			System.out.println(f4.exists());
			System.out.println(f1.exists());
			
			//파일인지 확인하는 법
			System.out.println(f1.isFile());
			System.out.println(tmpFolder.isFile());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
