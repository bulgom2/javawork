package ch18;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadLineEx {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			// FileReader에 BufferedReader 보조 스트림 연결
			new FileReader("src/ch18/ReadLineEx.java")
		);
		
		int lineNo = 1;
		// 더 이상 읽을 내용이 없으면 while 문 종료
		while(true) {
			// 1행을 읽음
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		// BufferedReader를 닫으면 FileReader도 닫힘
		br.close();
	}
}
