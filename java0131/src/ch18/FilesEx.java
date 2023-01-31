package ch18;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesEx {
	public static void main(String[] args) {
		try {
			String data = "" +
				"id: winter\n" +
				"email: winter@mycompany.com\n" + 
				"tel: 010-123-1234";
			
			// Path 객체 생성
			Path path = Paths.get("C:/Temp2/user.txt");
			
			// 파일 생성 및 데이터 저장 (Java 11 ~)
//			Files.writeString(Paths.get("C:/Temp2/user.txt"), data,
//					Charset.forName("UTF-8"));
			Files.write(Paths.get("C:/Temp2/user.txt"), data.getBytes());
			
			
			// 파일 정보 얻기
			System.out.println("파일 유형: " + Files.probeContentType(path));
			System.out.println("파일 크기: " + Files.size(path) + " bytes");
			
			// 파일 읽기 (Java 11 ~)
//			String content = Files.readString(path, Charset.forName("UTF-8"));
//			System.out.println(content);
			
			FileReader reader = new FileReader("C:/Temp2/user.txt");
	        int ch;	// 텍스트를 아스키 코드로 변환하기 위함
	        // read() 메소드로 한 글자씩 아스키 코드로 변환해서 받아옴
	        while ((ch = reader.read()) != -1) {	// 읽을 내용이 있다면 반복되고, 없다면 -1이 리턴됨
	            System.out.print((char) ch);	// 아스키코드를 캐릭터형으로 강제 변환하여 출력     
	        }
	        reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
