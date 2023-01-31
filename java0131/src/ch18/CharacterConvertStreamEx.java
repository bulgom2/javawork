package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		// FileOutputStream에 OutputStreamWriter 보조 스트림 연결
		OutputStream os = new FileOutputStream("C:/Temp2/test2.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		// OutputStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		// FileInputStream에 InputStreamReader 보조 스트림 연결
		InputStream is = new FileInputStream("C:/Temp2/test2.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		// InputStreamReader 보조 스트림을 이용해서 문자 입력
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		// char 배열에서 읽은 문자 수만큼 문자열로 변환
		String str = new String(data, 0, num);
		return str;
	}
}
