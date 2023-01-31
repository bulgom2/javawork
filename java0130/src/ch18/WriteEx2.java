package ch18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args) {
		try {
			// 데이터 도착지를 test3.db 파일로 하는 바이트 출력 스트림 생성
			OutputStream os = new FileOutputStream("C:/Temp2/test3.db");
			
//			// 데이터 도착지를 test2.db 파일로 하는 바이트 출력 스트림 생성
//			OutputStream os = new FileOutputStream("C:/Temp2/test2.db");
			
			byte[] array = {10, 20, 30, 40, 50};
			
			// 1번 인덱스부터 3개까지만 출력
			os.write(array, 1, 3);
			
			// 내부 버펴에 잔류하는 바이트를 출력하고 버퍼를 비움
			os.flush();
			// 출력 스트림을 닫아 사용한 메모리를 해제
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
